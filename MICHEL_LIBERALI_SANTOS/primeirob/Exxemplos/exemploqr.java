package primeirob.Exxemplos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.print.DocFlavor.URL;

public class exemploqr {

    public static void main(String[] args) {
        
    }

     public static String genQRCode(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\n" + //
                    "  \"key\": \"testepix@celcoin.com.br\",\n" + //
                    "  \"amount\": " + amount.toString() + ",\n" + //
                    "  \"merchant\": {\n" + //
                    "    \"postalCode\": \"858402\",\n" + //
                    "    \"city\": \"cascaland\",\n" + //
                    "    \"merchantCategoryCode\": \"5000\",\n" + //
                    "    \"name\": \"TestBullet\"\n" + //
                    "  }\n" + //
                    "}";

            //dados da headers da nossa request & configs        
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", token); //bearer
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

            return (response.toString());
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
