package MAYLO_DOS_SANTOS_DUARTE.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpResquestLista {

    public static void main(String[] args) {
        System.out.println(HttpResquestLista.getJsonLista());
    }

    public static String getJsonLista() {

        try {
            
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\n" + //
                    "  \"data\": [\n" + //
                    "    {\n" + //
                    "      \"name\": \"José da Silva\",\n" + //
                    "      \"ra\": \"1233\"\n" + //
                    "    }\n" + //
                    "  ]\n" + //
                    "}";

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                    byte[] input = json.getBytes(StandardCharsets.UTF_8);
                    os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder reposta = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                reposta.append(line);
            }

            reader.close();

            connection.disconnect();

            return reposta.toString();


        } catch (Exception e) {
            e.printStackTrace();

            return null;    
        }
        
    }
    
}
