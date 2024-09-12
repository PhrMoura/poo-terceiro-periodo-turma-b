package segundoB.listas.listaCinco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        List<String> opcoes = List.of("Listar convênios de pagamento", "Consultar boleto");

        String opcaoSelecionda = (String) JOptionPane.showInputDialog(
                null,
                "Selecione a opção desejada:",
                "Informe.",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes.toArray(),
                opcoes.toArray()[0]);
        
        switch(opcaoSelecionda) {
            case "Listar convênios de pagamento":
                listarConvenio();
                break;
            case "Consultar boleto":
                consultarBoleto();
                break;
        }
    }

    private static void listarConvenio() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJRcUxIdFk1VG85Z210dzhMZGZrR2M5QWt3SVhYVXVydVdtVENxVytGUldoYytJQ3pkRXk5NWRiTDEyYTQxRG5rV2JOSFU4NmFBVEZNRVNZQ0lONnZuWmNNUTRINVc1dTEwcEt3aVF2TTRwSTBHZ0hEQVJNcE9Vbk9uYjc0RDVBUWNpcGxqbEx5K2o4WXNTRjloR09BTXc4SHFnWXVyQmVBZm8zUWc1ekJlMm5EcWZyZ2VRN1N4THJDTkIrd3RvMTZHQkJDcy9PNzYzc04rYWRCK3ZsNW1sazVDZzFVbVVWcFlSejVxbnVhRDk2dzFKbXFuM3BnVXYxOTFwbHVLeVc2NmJINFRoeG5yL2J1aVB5SkJFRGl2bnNUaElYd1hURDZyQ2lEK2VIelMrUWw2OElsc1lBQ1NOWGxuK2EzV3UxTWlocndyMjdZZHlNbzNVejJUR3hLK0dFWlJFSGl1OEJNT1FzUXVsREJRR1Z6RVJ1Y0U2N2VzcTB4ejZyUm4wUitTVHcya3JlQjYxWHRuM0IwS0VhOXN4RFVYOXFVZzNEV2ZTUFNmNXBuYW9kY0VTUTFTaXZmUHhEbHZJeHZWNTYrSWFRa1pvU3FuR2dVTUk0SEliVTRZME1HWUJmOW94Ly84b2NQV2pXUFp4dkdJZlQxNmFEK1FxcHlSME1wdEpXZUdKb3EyNnpaY0owcTRmUlFWQ0Y2UHR2Wkt0WnAwT1VRSVUycXQ5bzZtaTVXeGh0TUFtOGFEMW1DZmdIcGFhZnZzTGFHNjdORDR5b1BjbERnNGZ0L2hRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYWRjNDVjN2RhYjFmNGExNDg4N2EiLCJleHAiOjE3MTkxODIyMDMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.XAGNqzrN12IyIZenwxFTl_YA7Gs9D8y27tkJVKtPQcs");
            connection.setDoOutput(false);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JOptionPane.showMessageDialog(null, response, "Listagem de convênios", 1);

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    private static void consultarBoleto() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String linhaDigitavel = JOptionPane.showInputDialog("Insira a linha digitável:");

            String json = "{\n" +
                                "  \"barCode\": {\n" +
                                "    \"type\": 0,\n" +
                                "    \"digitable\":\"" + linhaDigitavel + "\"\n" +
                                "  }\n" +
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJRcUxIdFk1VG85Z210dzhMZGZrR2M5QWt3SVhYVXVydVdtVENxVytGUldoYytJQ3pkRXk5NWRiTDEyYTQxRG5rV2JOSFU4NmFBVEZNRVNZQ0lONnZuWmNNUTRINVc1dTEwcEt3aVF2TTRwSTBHZ0hEQVJNcE9Vbk9uYjc0RDVBUWNpcGxqbEx5K2o4WXNTRjloR09BTXc4SHFnWXVyQmVBZm8zUWc1ekJlMm5EcWZyZ2VRN1N4THJDTkIrd3RvMTZHQkJDcy9PNzYzc04rYWRCK3ZsNW1sazVDZzFVbVVWcFlSejVxbnVhRDk2dzFKbXFuM3BnVXYxOTFwbHVLeVc2NmJINFRoeG5yL2J1aVB5SkJFRGl2bnNUaElYd1hURDZyQ2lEK2VIelMrUWw2OElsc1lBQ1NOWGxuK2EzV3UxTWlocndyMjdZZHlNbzNVejJUR3hLK0dFWlJFSGl1OEJNT1FzUXVsREJRR1Z6RVJ1Y0U2N2VzcTB4ejZyUm4wUitTVHcya3JlQjYxWHRuM0IwS0VhOXN4RFVYOXFVZzNEV2ZTUFNmNXBuYW9kY0VTUTFTaXZmUHhEbHZJeHZWNTYrSWFRa1pvU3FuR2dVTUk0SEliVTRZME1HWUJmOW94Ly84b2NQV2pXUFp4dkdJZlQxNmFEK1FxcHlSME1wdEpXZUdKb3EyNnpaY0owcTRmUlFWQ0Y2UHR2Wkt0WnAwT1VRSVUycXQ5bzZtaTVXeGh0TUFtOGFEMW1DZmdIcGFhZnZzTGFHNjdORDR5b1BjbERnNGZ0L2hRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYWRjNDVjN2RhYjFmNGExNDg4N2EiLCJleHAiOjE3MTkxODIyMDMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.XAGNqzrN12IyIZenwxFTl_YA7Gs9D8y27tkJVKtPQcs");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JOptionPane.showMessageDialog(null, response.toString(), "Consulta de boleto", 1);

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}
