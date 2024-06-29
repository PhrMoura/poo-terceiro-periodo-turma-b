package BRUNO_GOEDERT_DALMOLIN.segundo_bimestre.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuController {
    public MenuController() {

    }

    public void listarEstudantes() {
        try {
            JFrame newFrame = new JFrame("Listando Estudantes");

            URL url = new URL(new BaseAPI().getBaseUrl() + "students");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(response);

            // Mapa que irá armazenar a chave:valor do json
            Map<String, Object> jsonData = new HashMap<>();

            String valorFinal = "";

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                Map<String, Object> internalMap = new HashMap<>();
                internalMap.putIfAbsent(key, value);

                jsonData.putAll(internalMap);

                valorFinal = valorFinal + jsonData.toString() + "\n";
            }

            reader.close();
            connection.disconnect();

            JOptionPane.showMessageDialog(newFrame, valorFinal.toString(), "Listando Estudantes",
                    JOptionPane.PLAIN_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage().toString(), "DEU ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cadastrarTestemunho() {
        try {
            JFrame newFrame = new JFrame("Criando Testemunho");

            String urlFoto = JOptionPane.showInputDialog(newFrame, "Informe sua URL de foto: ", "Prova 2º Bimestre",
                    JOptionPane.QUESTION_MESSAGE);

            String raAluno = JOptionPane.showInputDialog(newFrame, "Informe seu RA de aluno: ", "Prova 2º Bimestre",
                    JOptionPane.QUESTION_MESSAGE);

            String testemunho = JOptionPane.showInputDialog(newFrame, "Informe seu testemunho: ", "Prova 2º Bimestre",
                    JOptionPane.QUESTION_MESSAGE);

            String json = "{\r\n" + //
                    "    \"imageUrl\": \"" + urlFoto + "\",\r\n" + //
                    "    \"description\": \"" + testemunho + "\",\r\n" + //
                    "    \"ra\": \"" + raAluno + "\"\r\n" + //
                    "}";

            System.out.println(json);

            URL url = new URL(new BaseAPI().getBaseUrl() + "testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados da Headers da nossa request & configs
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Escrevendo JSON na request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno Json da request e atribuindo em uma String
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            System.out.println(response.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage().toString());

            JOptionPane.showMessageDialog(new JFrame(), e.getMessage().toString(), "DEU ERRO",
                    JOptionPane.ERROR_MESSAGE);

        }
    }
}
