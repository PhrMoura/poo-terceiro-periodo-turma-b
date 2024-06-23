package segundob.aulas.aulaOito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QrCodeSample {
    public static void main(String[] args) {
        System.out.println(genQRCode(null, 20.0));
    }

     public static String genQRCode(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\n" + //
                    "  \"key\": \"testepix@celcoin.com.br\",\n" + //
                    "  \"amount\": "  + amount + ",\n" + //
                    "  \"merchant\": {\n" + //
                    "    \"postalCode\": \"858402\",\n" + //
                    "    \"city\": \"cascaland\",\n" + //
                    "    \"merchantCategoryCode\": \"5000\",\n" + //
                    "    \"name\": \"TestBullet\"\n" + //
                    "  }\n" + //
                    "}";

            //Dados de readers da nossas requests e config
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJaNHhaQ2huSitFNng2ZGdQNGR1N1RuSURyMTNjeHpSckRxUGNxMUhiNk9RS1dvQzRqYXF6cTNvaS9ZenZjR2ZldEJuZ2Qya00xMjVoQ1dUMGNabngzalNneC85YWl0OEh3YUh0TGJJcmc2aXV6UTQwRHdHR2hvY1ZyOXUybEZsdkJodzZFblJIS2Z5dElhL0pqSk9GRGZWUVpDNlNRbUpwYzBLWGViaXlvODZMbk11RWkzYVFrZDNGejRZQmdiRkFuMjh5WStZMithYnljUm1uYmUvaXNsVEwzMmVzU3dXWnoySDZCNXBsbklTaGhZaWNkdVFVNHAwQjhSMFpMNVg0bkM5cjE2NUhPZ2FvZXVLUzcrNE1NSU1oUmlIMXA3TnhxN1VtMnRhK3d5Nnh5cXE3SEM3a3VuZS9VTDRWUG9RdENDZFNWMDBoblVSZUYwSlp6TEtCR0Fwcis4RFFrWUJlZDNkT2NlZS9SdEtjdTE1Mi9IZlBjN2hvUWVtd2U2ZUFpR0JOYzREbitUV3MrcGZvTFJORjNVb1dEclZDSGlRczVDTUt3Y3JCWG0vYXZhTkQxN1paUFhvQ1hHRTNKV0oxNnpOTXcybHpTd2NaU0FQOUh5NjRPQzl3TWpiTUwzbDFrcjl1czgyZE90azBMbXF6SXJ1ZHlSYzZwVzFRamJrdDZRK3NXMUZ6MmpFYVgzckVOdWRuWXoyalFBS2tuSEpyRDlpbkpUVG1KZGtMOXZIZ0Z0alRXN09OSFhqRkVxYWxKcXJvTHJxdnU0MWk1VFRwRFEvNkd3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZTFmNzg4NjlmOTYxNDllMGFhZjAiLCJleHAiOjE3MTg3NTg1OTgsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.DGXBp9aVt4f6MQ-GzvaH1wqqo44OTH5MdZypaTVD_Jw");
            connection.setDoOutput(true);

            //escrevendo JSON na request
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

            return (response.toString());
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}