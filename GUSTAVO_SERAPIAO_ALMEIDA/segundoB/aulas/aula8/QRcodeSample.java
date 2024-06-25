package aula8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class QRcodeSample {
        public static void main(String[] args) {
            System.out.println(genQRCode(null, null));
        }
  
 public static String genQRCode(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\r\n" + //
                                "  \"key\": \"testepix@celcoin.com.br\",\r\n" + //
                                "  \"amount\": 10.55,\r\n" + //
                                "  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n" + //
                                "  \"merchant\": {\r\n" + //
                                "    \"postalCode\": \"01201005\",\r\n" + //
                                "    \"city\": \"Barueri\",\r\n" + //
                                "    \"merchantCategoryCode\": 0,\r\n" + //
                                "    \"name\": \"Celcoin\"\r\n" + //
                                "  },\r\n" + //
                                "  \"tags\": [\r\n" + //
                                "    \"string\"\r\n" + //
                                "  ],\r\n" + //
                                "  \"additionalInformation\": \"Referente ao custo de...\",\r\n" + //
                                "  \"withdrawal\": false\r\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJQanJ2NEQ3RGdVNkhjeSs4RlV5VzUweDlzRDBnNS82U0RCUEY2dUIvZUNSNlRTRGJ5VnYwMGVqZ2JUNUh2Tko2UGJySjRVTW5iWEhOVVJINVFhWkhBeTg3SmFhT2tHc3FMUVZRaE05clFJMVVNbEw0K1lFRmNWSnVJejh0RzFEUzBBc3V0dzNnZzJTNFNqalBxSllsd1Z5dkgvNDAveTFlT0xwWjltM0tnbHRJVElLUncyVzg3emk3TkIwcWN6Q21mOUFEalVRSkJZT3c1ZFcrS09XUllTYlVLMTNpdk9Rck1laXJlTWRsSlFnUzRJa3B5UlhUUXBRcGh6NXFOcFlBYytITFNldXdXTHJ3ekc5UGlEcnRROEJjMXZwMFBpV05JSW1PVDA5U1lrRXMvZTB3dHRoNmFuOHZidkZDMERKUnoyRDhQV3dka0hYa21kT0xva1dpWE5BUU1EYWhLRSs0M29lMG14U3N6UVR1bjdBVG1GbFpiOHlGa256RmRmbE5rME9VYzYyOTIremJjQ3JjRG5zcTZrUk9LK0xVckRQQW45NWJHQmRmT05TTzZiR1hGVVlpcWx2MlpsT3JBK3VLRldzR0dvMGFPRzVXOWRkK3JDNm1qY3RCQTNwbTAzSy9MT1owclE2YzVEc3IxMnpEVHByVnhkVWlGaU81S3U2bjF4NS9XcVJYU0ZDU01XY2VEQVlOcWZUZDAzODZTTkRCQTFFb1krZzZRSjVWby9HbTNvV3d5MkZaY3g3NmNxT0NDTnQweGlEV21tdEo1eXczLzJEQlpBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZjgzYmNiZTAwNDk5NDIzNzg0ZWMiLCJleHAiOjE3MTg3NjEzNzYsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.8Tp5iqeDqkeG4WWbe6z1eMmi3J4ShV4n-CsPvtL4Ngk");
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
