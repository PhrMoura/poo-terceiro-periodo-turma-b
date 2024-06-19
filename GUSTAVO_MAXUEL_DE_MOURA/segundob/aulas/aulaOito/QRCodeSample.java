import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRCodeSample {
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
                                "  }\r\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJRcnB1eVJrMUJCcGRtcDE3eHhoeDBpUWovZms5QVkzZWt2Vzg0MDRRdHI4aVZHT3h2dlUrMDJ4M0VtcFp1bm16RUNmYkZLbHM1SUhtN3M5UUNpRkhFczgzb3N2d2tkN2JtVFpsbmhxN0VUT3pTcFdVQ0t2M0tNU1RDbmZ5MmkrQXNUcHJBOGVPY1pFbEtTM3VSY3JscWpZR0hCb25acFVoU3JIcHdEVTRDYXdKTmtvamdTbDI4UStXcVdmZUpJUXVBNGRBTU5VTWl3UkZuMFdmWDJrb2FlVy9HNFV4cGNndGJOVG9GRHY1VENtWUlvVTkyWFNoZGU5UzQzeElTbzVWQ0lpQXZGS0xOYXFXZDQzNVdmejdRZlh3cC9yMzZ6ams0dmkwOUIreUJsZUFVYkx1ei96SFM2UTg3aUVSZWJMV3pRWVAzems1Z0xQSjVXc3ZqZmdBdVlNY0Q3Z2NtdU9tTnBVLzFodDVldEczbW1iSlBKTUVZaHJEY1BaUzJwQW5yVVFLcEJTQ3JnUWw0dlpNbncwSjB1Z1JXb3NTbVBxcDZ1TnloeW9EOFBkYlFhRWdURThwRU8yc3Y3SDdhZUxsUitqcGt4ZEkzOHhHMW9nRi9zYzg4YmRpMUhSdmhTQjhoWjNjOE1rbDFJeUJ4eHRwR0F1M2xuU1U3cWZMTDVjTy9pNlpzdFVXSThCQ0FnNzU0VlhsR0NQSkozeitJeFlCeTMrWFkyQU90S1Fqclp6bGFxcVpRYVVYOXlMM2ROU3pKcTRXZWpFU0MyWW1MMnFUcFlNWnlRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYWIxOTFlMzYzM2VmNDU4NGI3ZWQiLCJleHAiOjE3MTg3NjA0MDksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.XcYHGl_dOJ25ZjHsOSStGfdxCzK29720RpEcAUot7Y4");
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
