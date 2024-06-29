package MAYLO_DOS_SANTOS_DUARTE.segundob.prova;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RequestTestimonial {

    public static void getTestimonial(String imageURL, String description, String ra) {
        try {

            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\n" + //
                    "  \"imageUrl\": \""  + imageURL + "\",\n" + //
                    "  \"description\": \"" + description + "\",\n" + //
                    "  \"ra\": \"" + ra + "\"\n" + //
                    "}";

            System.out.println(json);
            // System.out.println(jsona1);

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            connection.getInputStream();
            
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}

