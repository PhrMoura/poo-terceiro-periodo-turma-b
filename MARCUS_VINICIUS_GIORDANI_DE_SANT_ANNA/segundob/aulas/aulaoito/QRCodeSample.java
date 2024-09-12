package segundob.aulas.aulaoito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRCodeSample {
    public static void main(String[] args) {
        System.out.println(genQRCode(null, 30d));
    }

    public static String genQRCode(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\n" + //
                                "  \"key\": \"testepix@celcoin.com.br\",\r\n" + //
                                "  \"amount\": "+ amount +",\r\n" + //
                                "  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n" + //
                                "  \"merchant\": {\r\n" + //
                                "    \"postalCode\": \"01201005\",\r\n" + //
                                "    \"city\": \"Barueri\",\r\n" + //
                                "    \"merchantCategoryCode\": 0,\r\n" + //
                                "    \"name\": \"Celcoin\"\r\n" + //
                                "  }\n" + //
                                "}";

            // Dados da headers da nossa request e configs
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ3TEJXdmFuUHhJYndZek5SUUlhOWdkQ2F1VEN5Y1liYnB4REJlVTlWVWRwaWF6c2N2YTZjV1E5KzVCNTAyajhLRTFRVUZjZU1PR2hqL2RzTlZrMDFBWG8yRzB5eEpyZ1ZFSWpNeUxMTkoyWURnUklxZGtxa3c4M0pCK1lETW9mOXZtbzRYcUxGR1dqWDE3UmN2Zmx0RUlrMWFVb2hlQzRZTDdWNTd0OGV2eW5hUTNDTGFMZ280SUhEMk9vZnpxVjRXWWMyR0hTMkVMS3ZaYW5aOVdjTVFKWUhCbnd6eUdEai85M2o2cnA2M05qWmpkdTdpZmJUNWMrVUU1bzNybmNSM3RFdGR5cmNUaG9IbURXeS9TK3J4Tzhkb1lzU3hKUnp0Q3cvUWxKQTY1TjJzQWtHZnRwOXV3QlNkSlMyYWl5S2NIMENjZ3V5WlZ4Sld5NWJDZUxCam5wK3dRVzhTQmQzMHJ2Rmx3MjU1b3FMSzM5dFlDYjYwZis0S2d5Q0ZWTU1qa1c0TmJWQzg1NGttMkJVdmE5L1lNYVhtMEU1amZmY21jcVppQkZvNzZRU1RnZ1pXS1hCbHZ0VzhKVjNwKzlOYTVCanhkODNhdVNBcG9NL3VLdmFsSEJ5MUhSSVIzSUlBSVNQbTRaMG1wYTNGUDhPV1Y5MEJuNURwUk9KUzBkRVYwK0c1OTlmNmZLaUZ1dFNXKzF4a1dDR096Y3JaY01wZXQ4cEtqRFlJOFE3SzZXbTQyT21tbFpraXFWUUpNMnlpancrZ20xNXRMK0xJMm9zcTFhaU5RPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiN2UzMmJjZTIwNGMyNGY5NTk5Y2UiLCJleHAiOjE3MTg3NjA0MDksImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.j7iI_Yq74ZbaVzwcbt6KJPCx57joJNfB0PjhH9rtgHA");
            connection.setDoOutput(true);

            // Escrevendo JSON na request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno JSON da request e atribuindo uma String
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