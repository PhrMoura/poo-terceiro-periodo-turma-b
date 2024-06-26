package segundob.aulas.aulasete;

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
                    "  \"amount\":" + amount + ",\n" + //
                    "  \"merchant\": {\n" + //
                    "    \"postalCode\": \"01201005\",\n" + //
                    "    \"city\": \"Barueri\",\n" + //
                    "    \"merchantCategoryCode\": 0,\n" + //
                    "    \"name\": \"Celcoin\"\n" + //
                    "  }\n" + //
                    "}";

            // Dados da Headers da nossa request & configs
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJyN1haRVFLSHZqL3lNNURHblZNWHh5b0ZKUUJXWW9yMGJNd2Y0MkwrNWJLZ1hzQUxLYm8zV0taRnh3cWo0K0RNU1luM3hxQTdKcWViQ2RwV3Znb29zS2VObWp0TnQ3Ym8wTFF2aWFhQWlUMmxnMTNrVTh3OW9FalNXYzZGZU41OXFQZWMxUUNtVzJhZzlGbjRQYXZLVXBXaTlVRE9KSFpCdGU4a2duclVDNElWWEpzWVVETDNVdmFqemN1dWFRSXFQci9Ua1B5d0pjSUcvZUJPQm9QVUl6UHhFbVZEL0FmZGpVaEtVbmt6VmV4cXR6MWZiaWZreEFId1UrSWVQYXJrY0lPK3pGTi96OFQ0aFIzS0RSSTgrTEpUYkFESFVsZzB4T1htMk1iZ09KcXp2M0FRWVc0WXdRR1FRc3A0ZG0rUS9KSzhKdHFzOFpneTdTaHhvdmM3RDRjT2RxSTV5R0VkNTYzNWxsdTk2QnBTNHk1K1AxaEQ4blViWVA2ZTdiU2N3QkJsdER6bmFBdWp3bUQwZDhrOGR3TmhFL1BiSkN1WElHU2t5V1d2OG4zNXJIYit2Yzg5WTVvSnI4TVRIM1pwSkt6SiswZFduUTFJYm4yWFhqbVloMHdRQlp1UmRKc09VN2FTbVFHaGc0QWlnREdEbDA2TG9GYmszUFhHYjBGMCtOLy9MaVJxa0RRVjZrNzFvZDNCVHRPMkNqSTdYb3dyMzRHRGdVakVFNCtwM1hkaEdJSy9MckxrVnJOejJ4UmFScEtDdlNEdkpMemh3bzNEVWdFTmJ3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMjIzYWQ4ZDQ2YTI1NDRiYWE1ZWIiLCJleHAiOjE3MTg3NjA0MDAsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.Izp57NQq6Mmto4q1a0zQVezN6OxciYsHWzCaefOzZE4");
            connection.setDoOutput(true);

            // Escrevendo JSON na request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno Json da request e atribuindo em uma String
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            // String com nosso Json
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

}
