package segundob.Aulas.aulaoito;

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
                                "  },\r\n" + //
                                "  \"tags\": [\r\n" + //
                                "    \"string\"\r\n" + //
                                "  ],\r\n" + //
                                "  \"additionalInformation\": \"Referente ao custo de...\",\r\n" + //
                                "  \"withdrawal\": false\r\n" + //
                                "}";

            //DADOS READER E CONFIGS
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ0V0szRFQ4L28wZUJ1NG9MYXhtWlpDS1JHaWZ4QWlkQUhZZ250aFdLOU1tRjdsTFNGMThOUHV4VVdXbC80WGtzR2pmazlFdVBBRkhmbVBSUWc4UnFnSHJIOXVVa3N5eWprTjYzMEVIalIrMElMai9QVTVESzV2VlVvWEdjTUVVaXZZdm1RUGdqblUvbWdDRU5Ba0lnYVNMNTVlQWN1a2VkM2tJL0FrNVNLRVF1bXhLWHJKTzdXa2ZTNEJGaFI0MzJoOTBlSE1ZTzUrUlEzR3RRMFZEN3dvbnN5N1NJTjJkWEVlZEhMRElMZE1lVm0xamVGS2ZwVlduK2ZmdGhyK1M1NFgxdmFPQlg2b3ZZcGdHMVZoVWxNYzViS3pGUC9wblljT0tDSlhNbGczdnFYYzhGNWNpclZJdUpXOSt2d09BMWxBUjJKYWJoSE1vRDRLQytCQXlPdmZMcitlaTNkRU9ZbTBtMDAxMmVvbFh4YkJsTVVRaGJBMG9iNlovY2l3cWpkNWloSURxM1RMelNTMGs5YUtBUXJBWVNGU05EQTF5b3k2ZDV5TXJ5elI1b0V2Y1dOTEFXSkk3S2w0OVYrTUVzUXhjTXFlMEV4YWd0ZGpFQ21YVE5CZ2xhNDVaK2t1YjJteHpOQ2ppSUdXOHBtTjF3SUNsZ1NzMjZkTkFsaWdEeUYzM2VFUUdIK0ZTNVdWNUZzQ01CQmpQUU0xRFpLUC8vV2hGSmpqS0EvL0F4YkFzQkhUVllxUU15aUlQZFk3NTd3cnhoMFppQldxSUkwdHpRR2VCS0lnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNGM2N2E5YzZhNDMzNGEwNjkxN2MiLCJleHAiOjE3MTg3NjA5MDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.vbij_pM5BVmFqCRAyuY9UU5CmHxvfcpCIPxFrrrHfXQ");
            connection.setDoOutput(true);

            //ESCREVENDO JSON
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            //LENDO RETORNO JSON DA REQUEST E ATRIBUINDO EM UMA sTRING
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
