package segundob.aulas.aulaoito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TesteHttp {
    public static void main(String[] args) {
        try {
            System.out.println(getJsonData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getJsonData() {
        try {
            // URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            // criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJ5bU9Rd2hTVmJCVm5OWGRwRW42S1k4UnBGVW1oNzVtVzF5S2FNcWtxRTVWMlpoTVZDYldlVnQ3b01nZ2NFZWdQQkdwTlZwTW1DMjZ2amxibjVMQTN0Yy9wRUxYeFRXQlF3Z0pudGNLSHpyMnp0eTFUUTNqeU9QeFRYR2tGUDRRd05ocy9xbFE5UUNBZXRYVWUxYUZIdFloOG43NVVKUzRDT1oyMmVtZllnc0RHQlVaZVBzYlhzdlBBSGlILzFBWUh5MDk3cGFnVXBsZGhuWVcvMXFxbVVwQVUrUW96dU1CNThDaEJiMXRwcTNYQzBJYUljNm83Q3VudnVJMmt5cW5Ta0xBU1ZhcmlUckx0ZEJicjlrc1g0RXhqOE93emtxVTloQVBGUWw0azBxbXphQXZNRjV2cWUzZlFsSzhBeTNQMlFkWmZlckJad1F0d3NiU1MzOGNzTTBoNEd2elVSK2FiVWFZU2I4cnpnRmQrVnJzQ2tPTlBCU2NvWnUwYmozemVzVVJNZ1dtRGZxZFh5NFN5b0pRNTlsbjNGNmt2bUMzblJHUEtCQVlNMWQzSVV2T3I2eU1jYnFxbFNlVUJjRDBxUXlKbTVBV2lpWjdpSUswZ1NGNTFhTDVjNitnM25xSUtVRFdxQWVTRm0veHpMcFM1VEtmbTZSSzc4MDJWU2YwUWZ0UXhLRyt5b1JseXRsSERtN3Y4Nkhmc2hyZzV6a2d6VG13RzFydVRpRHpycFF4VDNKS3p6dWNKVzdRNVRZY3JhRTJCNHdKOFZkTEozN2wwekJ0bWFBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMjY2MjM1ZmQ1MTg2NDMxMGI2ZTEiLCJleHAiOjE3MTg4NDk2ODMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.SBTH1Qdp-_jaUB464CbK4h7A-_vebzCrL6aEmFtFKNM");

            // lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // fechando a conexão
            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}
