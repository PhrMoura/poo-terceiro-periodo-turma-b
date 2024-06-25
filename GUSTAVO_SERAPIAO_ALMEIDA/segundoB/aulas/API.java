import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class API {

    public static void main(String[] args) {
        try {
            String responseUSD = fetchUSDBRL();
            String responseEUR = fetchEURBRL();
            String responseTWO = fetchTwoDays_RemainigUSD();
            String responsePeriod = fetchPeriod();
            String responseSequential = fetchSequential();

            System.out.println("USD-BRL:");
            System.out.println(responseUSD);

            System.out.println("");
            
            System.out.println("EUR-BRL:");
            System.out.println(responseEUR);

            System.out.println("");

            System.out.println("Retorno últimos 2 dias");
            System.out.println(responseTWO);

            System.out.println("");

            System.out.println("2024/04/20 e 2024/05/25");
            System.out.println(responsePeriod);

            System.out.println("Sequêncial");
            System.out.println(responseSequential);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String fetchSequential(){
        return makeGetRequest("https://economia.awesomeapi.com.br/EUR-BRL/5");
    }

    public static String fetchPeriod(){
        return makeGetRequest("https://economia.awesomeapi.com.br/json/daily/USD-BRL/?start_date=20240520&end_date=20240525");
    }

    public static String fetchTwoDays_RemainigUSD(){
        return makeGetRequest("https://economia.awesomeapi.com.br/json/daily/USD/2");
    }

    public static String fetchUSDBRL() {
        return makeGetRequest("https://economia.awesomeapi.com.br/json/last/USD-BRL");
    }

    public static String fetchEURBRL() {
        return makeGetRequest("https://economia.awesomeapi.com.br/json/last/EUR-BRL");
    }

    public static String makeGetRequest(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

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