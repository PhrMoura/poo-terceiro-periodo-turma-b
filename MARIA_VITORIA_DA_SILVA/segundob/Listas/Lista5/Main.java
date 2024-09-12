package segundob.Listas.Lista5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String[] opções = { "Convênios de Pagamento", "Consulta de Boleto" };

        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Seleção de Opção",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opções,
                opções[0]);

        switch (selectedOption) {
            case "Convênios de Pagamento":
                consultaConvenio();
                break;
            case "Consulta de Boleto":
                consultaBoleto();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    // Listar Convênio
    public static void consultaConvenio() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI3UndwajFOS3RFaEdESzZsbEFwQUFOczNpOUJiUHA1M2xuaEZUeWl3dUR0K29yZzFGK05rakF6YVFtKzhwME5IcUlPQXJGWmFzOTE5eXVhZlpNdk9rSmlIUk1qZTVWb2V1MnBQMTA4MUhpRlYxa3dqcnpHNVNzZTF3d1Y4MjRKeHhFekhXbFZpRU5haHlZQWpXOTZKK0MrVkV0S3FGc0MrMXdacHYwR1loaC9FbkFtYkh1NE5ld3JvM2J0VGQvRDJMaVRnbi9CV1crTmlIS1Q5Y0NFT2hIK25ydkpVS0hXSUFJZVZxSUlra2xueDJKYlNWQUFQeWZuYnJIL1lKdTJEbUN5eEovNlloM20ycm4wYnhLdWxMeFphNGlrYmNZTGhCdkVISUxZRGg0VUZWM3JtNXQvSWZEaE5UdVIvcDBiRUN2ZFNjR1BJcGNuM1ZYSnNucGV6YjdWdld1MnhXY3hldGhxRkwzQWdZOFRlY3NWRG5mYk1QU25ueDgzaXlVdGdWc1RKeFhpTThUSVJvYzJNd0Z6NjhEdnA4SXZtYkYvSit4SlR1VnBSQkZUaE51N2hMUWc2VVluOXpYRHFocThUaEdGVVg0UkUwQVpwYm1uR1IwV2d0bWtjNVQ5dHQ4ekIxTDNFQ25KTEhoQm9RM1pPL1JWcmZteEVqZ2ptVmdnbUUwMFNRSHNmUDRDVWJtTFJKbHdYTDA1OWQwU29zVUFNSTRtSHpLbThkYlhzKytQSXh2azlEeG53MjlOSVBkMzFUQ0hoaWtTbEE0UW1hcS9TK3p4dmhRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMTI1OTgzMTVhYTJkNDc0M2FlMDkiLCJleHAiOjE3MTkxODI3MjEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.sLhs5CLFxYLJRrchWzTYTEyp3CDo6ow51Pg0VWB9Wdg");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();
            JOptionPane.showMessageDialog(null, response.toString(), "Listagem de convênios",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar convênios: " + e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return;
        }
    }

    public static String LinhaDigitavel() {
        return JOptionPane.showInputDialog("Insira a linha digitável!");
    }

    // Listar Boleto
    public static void consultaBoleto() {
        String linhaDigitavel = LinhaDigitavel();
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String json = "{\n" +
                                "  \"barCode\": {\n" +
                                "    \"type\": 0,\n" +
                                "    \"digitable\":\"" + linhaDigitavel + "\"\n" +
                                "  }\n" +
                                "}";
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI3UndwajFOS3RFaEdESzZsbEFwQUFOczNpOUJiUHA1M2xuaEZUeWl3dUR0K29yZzFGK05rakF6YVFtKzhwME5IcUlPQXJGWmFzOTE5eXVhZlpNdk9rSmlIUk1qZTVWb2V1MnBQMTA4MUhpRlYxa3dqcnpHNVNzZTF3d1Y4MjRKeHhFekhXbFZpRU5haHlZQWpXOTZKK0MrVkV0S3FGc0MrMXdacHYwR1loaC9FbkFtYkh1NE5ld3JvM2J0VGQvRDJMaVRnbi9CV1crTmlIS1Q5Y0NFT2hIK25ydkpVS0hXSUFJZVZxSUlra2xueDJKYlNWQUFQeWZuYnJIL1lKdTJEbUN5eEovNlloM20ycm4wYnhLdWxMeFphNGlrYmNZTGhCdkVISUxZRGg0VUZWM3JtNXQvSWZEaE5UdVIvcDBiRUN2ZFNjR1BJcGNuM1ZYSnNucGV6YjdWdld1MnhXY3hldGhxRkwzQWdZOFRlY3NWRG5mYk1QU25ueDgzaXlVdGdWc1RKeFhpTThUSVJvYzJNd0Z6NjhEdnA4SXZtYkYvSit4SlR1VnBSQkZUaE51N2hMUWc2VVluOXpYRHFocThUaEdGVVg0UkUwQVpwYm1uR1IwV2d0bWtjNVQ5dHQ4ekIxTDNFQ25KTEhoQm9RM1pPL1JWcmZteEVqZ2ptVmdnbUUwMFNRSHNmUDRDVWJtTFJKbHdYTDA1OWQwU29zVUFNSTRtSHpLbThkYlhzKytQSXh2azlEeG53MjlOSVBkMzFUQ0hoaWtTbEE0UW1hcS9TK3p4dmhRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMTI1OTgzMTVhYTJkNDc0M2FlMDkiLCJleHAiOjE3MTkxODI3MjEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.sLhs5CLFxYLJRrchWzTYTEyp3CDo6ow51Pg0VWB9Wdg");
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

            JOptionPane.showMessageDialog(null, response, "Consulta de Boleto", 1);
        } catch (

        Exception e) {
            e.printStackTrace();
            return;
        }
    }

}