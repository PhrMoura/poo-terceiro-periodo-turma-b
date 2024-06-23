package segundob.listas.listaquatro.codigo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ConvenioRequest {

        public static void convenio(){
            try {
                String jsonConvenio = ConvenioConsulta.getJsonConvenio();

            // Extrair os dados do JSON usando expressões regulares
            Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(jsonConvenio);

            // Mapa que irá armazenar a chave:valor do json
            Map<String, Object> jsonData = new HashMap<>();

            int convenios = 0;

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                jsonData.put(key, value);

                convenios++;

                if (convenios == 3) {
                    break;
                }
            }

                System.out.println(jsonData);

            // Exibindo os dados da moeda
            StringBuilder msg = new StringBuilder();
            
            msg.append("Dados do convênio: ");
            msg.append("\nNome: " + jsonData.get("Nomeconvenant"));
            msg.append("\nTipo: " + jsonData.get("Tipoconvenant"));
            msg.append("\nEstado: " + jsonData.get("statesconvenant"));

            JFrame frame = new JFrame("Convênios");
            JOptionPane.showMessageDialog(frame, msg.toString(), "Convênios", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
