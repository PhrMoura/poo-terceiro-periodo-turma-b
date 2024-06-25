package segundob.aulas.aula08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class QRCodeSample {

    public static void main(String[] args) {
        System.out.println(genQRCode(null, 10.1));
    }
    
      public static String genQRCode(String token, Double amount) {
        try {
            // Dados do json
            String json = "{\r\n  \"key\": \"testepix@celcoin.com.br\",\r\n  \"amount\":" + amount + ",\r\n  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n  \"merchant\": {\r\n    \"postalCode\": \"01201005\",\r\n    \"city\": \"Barueri\",\r\n    \"merchantCategoryCode\": 0,\r\n    \"name\": \"Celcoin\"\r\n\t}\r\n}";

            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            // connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJlVGZpZ2NOTGtrb0g1Z3NJa3N0c3cybUxJTjVoUmVwTWU0R0ZERTBsdDJvSGEzUkVjOFh2SkNVWk04QkNwcXpjeUwrNUVtb1k1OXZoMlpmZnJQUDFtSkFQanN2WGFjbllmaDM5ZEhGWW9QWEZ1aTJSZHVYcE1XQUtXL2lUaFJzcXdhTWVIRVgxTDh5elcreGtJRnJVTmRmSGRreU5JRnA5cWVBU0xudWY3NVBMQUpJa09CTEtzTFJya0ZRNmI4Sy9oM0U5cTJOTnVnT1ZpNWRjOEtJR1k3aTcrSTRWWENsK0ZtL3JwZ2duZDY0R3dxUys3YUNoeVduVzRkSE94SW9abysyVk9nOUk3S3JaYzJyWE84ZjkyaUVQOU8zZW04MVJJLzVuRVNCa3pKcGdHUzZoeTR4R2g4VXQ4SDBRTDNaZUlUemVNNE44ck5xWGw5djRsc016aGVQK1N1cEFxdzNTMk9HZ1BFQmVCMzMyWVZuSW1LNHZJb3YyUGxiYlVIRXByd24wMTZZVEtiMUZGRjBnaE4xVmY2eFRBMlNnWEJVZyt1WmJnMjR2QXhIZUdxckNyZUhlNVkyVHF0cTVYaUdlbTNrUzdyRThLZjJZRXBkQVBCbHJWTSt2dzhkQ21QVWgvckh6eHVadlRLMGcwTXBHcENOUWlSQUN4UXlFZzA3Ny96UnBhR1M5ZUx2bXliQndlVmF1VEJlRE5ucGkwKy9GUGtpSksxRjN6emFyRWpVQnBvUnpaakFGOS9KSUtWUStrTXBKU0ZtWi9SajNpQmlEZTRXaGlnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMDU3NThiMzJkM2Q4NGQ1YjgyYTYiLCJleHAiOjE3MTg3NjA0MDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.eXLzLD_3e285pELc8bMttPRWgc7kFOH9JOSIHh9YwAQ");
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
