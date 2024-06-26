package segundob.listas.lista4.codigo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HttpRequestConvenios {

    public static void convenios() {

        try {

            String jsonConvenio = HttpConvenios.getJsonConvenio();

            Pattern pattern = Pattern.compile("\\\"([\\w]+)\\\":\\s*\\\"([^\\\"]+)\\\"");
            Matcher matcher = pattern.matcher(jsonConvenio);


            Map<String, Object> jsonData = new HashMap<>();

            int count = 0;

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                jsonData.put(key, value);

                count++;

                if (count == 5) {
                    break;
                }
                
            }

            System.out.println(jsonData);

            StringBuilder message = new StringBuilder();

            message.append("Dados do convênio: ");
            message.append("\nNome: " + jsonData.get("Nomeconvenant"));
            message.append("\nTipo: " + jsonData.get("Tipoconvenant"));
            message.append("\nEstado: " + jsonData.get("statesconvenant"));

            JFrame frame = new JFrame("Convênios");
            JOptionPane.showMessageDialog(frame, message, "Convênios", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    
    
} 
