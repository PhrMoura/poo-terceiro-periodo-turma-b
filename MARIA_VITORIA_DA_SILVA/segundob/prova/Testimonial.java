package MARIA_VITORIA_DA_SILVA.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Testimonial {
    public static void imprimiTestimonial(){
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String json = "{\r\n" +
                            "  \"imageUrl\": \"ht" +
                            "tps://avatars.github" +
                            "usercontent.com/u/91" +
                            "562068?s=96&v=4\",\r" +
                            "\n" +
                            "  \"description\": " +
                            "\"finalmente poha!!!!\"," +
                            "\r\n" +
                            "  \"ra\": \"11702\"" +
                            "\r\n" +
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

            JOptionPane.showMessageDialog(null, response, "Testimonial", 1);
        } catch (

        Exception e) {
            e.printStackTrace();
            return;
        }
    }
}