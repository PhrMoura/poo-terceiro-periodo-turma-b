package segundob.listas.listaquatro.codigo;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BoletoRequest {
        public static void main(String[] args) {

            boleto("");

        }

        public static void boleto(String code){
            try {
                String jsonBoleto = BoletoConsulta.getJsonBoleto(code);

            // Extrair os dados do JSON usando expressões regulares
            Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(jsonBoleto);

            // Mapa que irá armazenar a chave:valor do json
            Map<String, Object> jsonData = new HashMap<>();

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                jsonData.put(key, value);
            }

            // Exibindo os dados da moeda
            StringBuilder msg = new StringBuilder();
            
            msg.append("Dados da moeda:");
            msg.append("\nBanco: " + jsonData.get("assignor"));
            msg.append("\nValor: " + jsonData.get("value"));
            msg.append("\nVencimento: " + jsonData.get("dueDate"));

            JFrame frame = new JFrame("Boleto");
            JOptionPane.showMessageDialog(frame, msg.toString(), "Boleto", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }


