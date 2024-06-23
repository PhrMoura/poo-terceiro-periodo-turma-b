package segundob.aulas.aulaoito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRCodeSample {

    public static void main(String[] args) {

        System.out.println(genQRCode(null, 20d));
        
    }

    public static String genQRCode(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\n" + //
                    "  \"key\": \"testepix@celcoin.com.br\",\n" + //
                    "  \"amount\":" + amount +",\n" + //
                    "  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\n" + //
                    "  \"merchant\": {\n" + //
                    "    \"postalCode\": \"01201005\",\n" + //
                    "    \"city\": \"Barueri\",\n" + //
                    "    \"merchantCategoryCode\": 0,\n" + //
                    "    \"name\": \"Celcoin\"\n" + //
                    "  },\n" + //
                    "  \"tags\": [\n" + //
                    "    \"string\"\n" + //
                    "  ],\n" + //
                    "  \"additionalInformation\": \"Referente ao custo de...\",\n" + //
                    "  \"withdrawal\": false\n" + //
                    "}";
            

            // Dados do header
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJmNlcrZEVJQnZpZkpZODR5Tm01UFRleTltMnArYXFKT3ZudmFXS2FBZ1ZZYzIyczV3U3huVStPNUIzVXVpRFErc0FickxVYmNTeXpXayt1Sm1oVmlHTEdqaEdrcUY4QVRIUlh2Y2tJTHpTTDQva1hzUUlMZTBJaTJaVjhIZ2JYaWozL3YxMnQyMW5mRUpsMDZub0xMNmlnSGsvV0RaMDZXRVllbGJBMXZzU1l0TE41NDR6SGZmMWNzVSs4SU4wRnNkV1kzbEI2ckV4MXUyUlZyQ1plWnZQVmtZc21ncVpCNlU5aHVsNHhvd2lHYUVabGFYVXFQWUUxbzE5ZmVhSjF4M09PbTI3Sm4xNWxFZlQ1VmhJRXY0b1Buc2FZNklvT3VyTTBIZHFpNjdPcGJ3amVRWXlaYmdIZnlzOUFqbGZxaFlTRVdIOEtrd3UxVlNUZEw2U2xHN3pMR0Z6a2FVbHN1WU80ZEFiSkVEcEFwbFpqb3dnbFRJdnRzMnp3cFJFVE5HZExBbGdsTm45S2hYZHljN2FMQURvUVRiZnQwQmhTMjE1Ti9OVjVYLzBlNUF1T3ZPdTFaSVZENmhlY2owL1N0MnRsSlEwMVVXeEdENHRNQTY2K0twNC9qUXBzd0gvTDBjUlAvdjhXMGhyTG9PM3B1cjMxV3lCV3dZdFV0aG1ZQ3ZPSTNRZEV3OHUrVFZjbTh4SnBlckNzemZubTArVURrbUZqWC9mNnVjRUFFam02OFhIL0prU3Q2bURTWGlyNUs5Y1RxWWF2Q2RxNjJpZldVSGJWckhnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiOTk4NDY0MzBjMTg4NGU3MGEzY2MiLCJleHAiOjE3MTg3NjA0MTUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.RhDxJuEWeRN7Y2ngVS0IWEzezNbXOwZt-XxmR4rpj5M");
            connection.setDoOutput(true);


            // Escrevendo o json
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo a resposta da request e atribuindo em uma String
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
