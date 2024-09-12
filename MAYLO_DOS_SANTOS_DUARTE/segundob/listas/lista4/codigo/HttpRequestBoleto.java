package segundob.listas.lista4.codigo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HttpRequestBoleto {

    public static void main(String[] args) {
        boleto("23793381286008301352856000063307789840000150000");
        
    }

    public static void boleto(String number) {

        try {

            String jsonBoleto = HttpConsultaBoleto.getJsonBoleto(number);

            Pattern pattern = Pattern.compile("\"([^\"]+)\":\\s*(?:\"([^\"]*)\"|(\\d+\\.?\\d*)|null|true|false)");
            Matcher matcher = pattern.matcher(jsonBoleto);


            Map<String, Object> jsonData = new HashMap<>();

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                if (value == null) {
                    value = matcher.group(3);
                }

                jsonData.put(key, value);
            }

            StringBuilder message = new StringBuilder();

            message.append("Dados do convênio: ");
            message.append("\nBanco: " + jsonData.get("assignor"));
            message.append("\nValor: " + jsonData.get("value"));
            message.append("\nVencimento: " + jsonData.get("dueDate"));

            JFrame frame = new JFrame("Convênios");
            JOptionPane.showMessageDialog(frame, message, "Convênios", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
