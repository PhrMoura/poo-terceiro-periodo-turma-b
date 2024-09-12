package GUSTAVO_MAXUEL_DE_MOURA.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class CriarTestemunho {
     public static String criarTestemunho() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String imagem = JOptionPane.showInputDialog(null, "Insira o link da imagem:");
            String descricao = JOptionPane.showInputDialog(null, "Digite a sua descricao:");
            String ra = JOptionPane.showInputDialog(null, "Digite o seu ra:");
            // Dados do json
            String json = "{\r\n" + //
              "  \"imageUrl\": \""+imagem+"\",\r\n" + //
              "  \"description\": \""+descricao+"\",\r\n" + //
              "  \"ra\": \""+ra+"\"\r\n" + //
              "}";


            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "Erro", 0);
            return null;
        }
    }
}
