package CRYSTHIAN_SMARCK_FEISTAUER.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TestemunhoProva {
    public static void main(String[] args) {
        String response = gerarTestemunhoString();
        if (response != null) {
            System.out.println("Response: " + response);
        } else {
            System.out.println("Erro ao criar testemunho.");
        }
    }

    public static String gerarTestemunhoString() {

        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            String json = "        {\n" + //
                                "\t\t\t\"ra\": \"10614\",\n" + //
                                "            \"description\": \"Dale\",\n" + //
                                "            \"imageUrl\": \"https://avatars.githubusercontent.com/u/106833048?v=4\"\n" + //
                                "\t\t}";

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
            return null;
        }
    }
}
