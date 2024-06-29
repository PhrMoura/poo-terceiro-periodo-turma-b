package ENZO_ANTONIO_PRIMON.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.net.URL;

public class TestimonialsConsulta {

    public static String getJsonTestimonials(String imgUrl, String description, String ra) {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" + //
                                "  \"imageUrl\": \"https://avatars.githubusercontent.com/u/77335343?v=4\",\r\n" + //
                                "  \"description\": \"Megabanger aulas professor tamo junto, receba.\",\r\n" + //
                                "  \"ra\": \"11561\"\r\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
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
