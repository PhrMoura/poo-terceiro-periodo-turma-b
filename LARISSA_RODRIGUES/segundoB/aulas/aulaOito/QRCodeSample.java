package segundoB.aulas.aulaOito;

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
            String json = "\t{\r\n" + //
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

            // Dados da Heathers da nossa request & config
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJvcEpDd1cvQ1ZpdEYrZHk5Qm44SWRGaXRPNGVCTVgremNlS2JWYXNWOFh0clo2cHA3YjBoQVROUUpqM24wN0xYWStGRlJyMUVDMHBXSllDTm4wS29YbFN4eDVBUnBtQlZxNUQvbytEbmJ0WE5qbjJtcXBkWVl4UFNWbW5xdEhtTEl4R2R4ekNzdGJsMHQva3pPSFI4R3lRZW5HcEsxWTUvN2JiUktVZHowMHFIZnJpamxMQW1GQzN4b2VlUGszdWZQMDF3ZGEyb2M2RHR1cXhwS1kvU09WWllpRG1XK3NCc3duOU9OQUlhL2VPRm03ckxkVFhrSXFvUU5rNkZvYlNNSStqMllTT2x4ZmRRTEdlcG9GMklkR1NLL0dRYWFRdVl0RVdJZDBMNTdDeGQ2R2IwTitiaEErQ1Y4NXJySVQxcXpkTThIRmZvL1lvUFBtbEh0Tysyc0JmWE9wOWVaOERGTmhWTHpvU0JraENudzJNMG11RG81TUxhNjhhYklrTjRuNzJNQVkrbzFXVzZUYWI4UktQUlIrZjZMRFRzOTcxbXZNUWxmdGsrMllDK1h4OU5mZFErTHJ1K2VIdkEvd0hVNDRBUjRPdmI4cUZCZDV2aTM5MTEzNGt0VmdwTmVJREtOZ25xc0ttSHJ4NXpYL3NHMGk2c0Z6Z0ZBVGpGQlhzL3dONGtvNDJLeW4xWDlhUVU5L1AzL1hEendyTk9MZkppZ2JyVUp2N0RFRm85OFhPMkpGcEVWZlRjb1g0Vlpsb2JNbXNYM0RtL2Q5RU44UitxTTV6eUJnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMTIwMzYwYWQ1YWU5NGM1MGI0NTIiLCJleHAiOjE3MTg3NjA0MTQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.XskaeEgojaHQbtCoSIfvOBW0NUYq6RVevWTrIY-9xJw");
            connection.setDoOutput(true);

            // Escrevendo o JSON na request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno da JSON 
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
