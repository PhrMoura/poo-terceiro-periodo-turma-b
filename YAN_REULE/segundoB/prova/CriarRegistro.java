package YAN_REULE.segundoB.prova;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

public class CriarRegistro {
    public static String criarRegistro(String link, String descricao, String ra) {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String json = "{\n" +
                    "  \"imageUrl\": \"" + link + "\",\n" +
                    "  \"description\": \"" + descricao + "\",\n" +
                    "  \"ra\": \"" + ra + "\"\n" +
                    "}";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            StringBuilder response = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            }

            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
