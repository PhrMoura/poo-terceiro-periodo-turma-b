package segundob.aulaoito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRMain {
     public static String genQRCode(String token, Double amount) {
        try {
            //URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");
            //Criando conexão HTTP  para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\r\n" + //
                                "  \"key\": \"testepix@celcoin.com.br\",\r\n" + //
                                "  \"amount\": 2.55,\r\n" + //
                                "  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n" + //
                                "  \"merchant\": {\r\n" + //
                                "    \"postalCode\": \"01201005\",\r\n" + //
                                "    \"city\": \"Barueri\",\r\n" + //
                                "    \"merchantCategoryCode\": 0,\r\n" + //
                                "    \"name\": \"Celcoin\"\r\n" + //
                                "  }";
                                

            // Dados da redears da nossa request & Configs
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization","bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJiaytFTlpMN0ZhRlZ5anE3a2xaNlVub1Q0dmFVNHBDTlFKdU8xdHkxVXVSNElneXd2ZkQ5R0toNFFnWExRZkI3TTQ5Z0g1YVlNaDY5eVVmRU1UYTNBOS84K0x3WGpvY3doY0FFMm5xQzhDZTFXb2tmbGc5Ly9TVXl0ZDg5OXluejhiUmlCU1poTWJBRW5udStKNC9DVkpxZGJaMHdPZE1kazdnY2J1OVA2SlpUajcrMUZ2Tkg1QjhqdHRFUHVVK2dSb3BVYWxaUmFMK1BZY0hhb1dha2dkeDlRT0wyTHphZjFDSWNtYjA4c2pJR1lRRTVlc2FGM2FhR0YxNUJrR2ZMbDFRQ3RFWlV5dkY4bEFVM3FRTmdEOSt3ZnViWEFhUjl3bUNwc01WMTBVZi92ckdSd1E4TFQxNVJ0TVF1azdncHdCSitNcUtGVkREUXFBc3hIMmlYbG11VjNsSm1PT0htNlhlT2NWcWJjTlZCRm9tb0xtc2JTaVJQdWNyR091ZGNQTnhtcGUxSjZwYm93Yk9yUTUxVFdYK3dtQVo4TWlVVSsxWXVVUXMxc1ppSmRuQm9YMDIvazAzM2Y4NEN1WW9udm5CSzUxMHBsTWcyeGhTdEd0Qm85MXZ4QWZreDZ0TmQ1bjl2SHVZdGE2bEtTbGxTbzBiU3Y2cHprK0g4dkRjSTIrUW5kQTN1T2xGRER1Q2RNYUNnZnhYUWFPNTRkUUU1Ynh0dktEUC9IM1FMM3FQV2NQZ09UTmtPSnR6U1lsVEI2YWtnSjFaMGErOHNrenFkc2V1UFBBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMjc0MmVlMzY2NDYxNDVlZWJiOGMiLCJleHAiOjE3MTkyNzQ5NTAsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.MBz5O5g2lKilScjuXhqtS7x2dlsxOp00UCgrSomWa_g");
            connection.setDoOutput(true);
            //Escrevendo JSON na request  Saida de dados OutputStream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
            //Lendo retorno JSON da request e atribuindo em uma String
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            //fechando a conexão
            connection.disconnect();
        //String com noso JSON
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

}
