package segundob.listas.listaquatro;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJWN0FUNWFIUHRteWtuK1NwbUtVaVBIRENGa3ptRVlBMUVVVnZycGJEaE1yeDR2R0F4eHM2TWVRYy9pUWZGZWpjZmdhZXBJV1ZWaWF6dWJ4Q2lUV2NUdXR2bXhuR1F4VkZHY2lZR1p3N0JHR2h0V3huNjhwVHloZXpnSEp1Q0dQOHd6ZEowalRhNmhLK09EM0lnVlAxYVYxOTJLOEVGY2JvSDVTeXBFd2hZS0p4bW8vQ2g2V1Q3TUR3VzBPVVh6RGRxNzVkd3hjMW5QallBdU1Wd1MwWVJnQkQ5RVIyQWJjY3J1UjBXd3djeFpDSEhwa3dxSzRHZnk1ejJPOXg0dXRsWlROaHNJbk9xVmh5S0duRUFGWmFGS0lCMWNhMWxoMkEwMmNQVzh3Z2dQci9MYStWYmdLK01GeE9BTWQvOTg0bDd0WFlXZW90Tm42N1Q1U3V2cU5VOTg3c2FtTlRpYmlzcTRzb3MzL0JGSUtyeTg2SVNwbC9DQ1JlSU53Mnd0dHpJbFh5ZmJvdElZVnZDVkRHS3FUbjJUYnNRTXhEUkJZc1VyMytvNWpnVlpSSGd6VnJGUk1JVklCaFNYMFBHdXpteGJqLzRmZEhwc0RtbGVaTVBhaCsyZHJkTHl0SzRaWjZ3dUx0ODhUcC9vNmVBMzhPaFJ3cHArdTM4RG9uYXdXNmlCcHlTOExaY2ZKQlRLaEdON2RoUCtSWS9ScTJIdkxtQlhKWEpqWFdydHFSNHJ1bmJYUXRTczZTTVNtbjd1dVVITDBBM3IxRVVUOVpWN3NHNEZvSkV3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZmRlZTM2NTBjNzM4NGJlNDk1ZTYiLCJleHAiOjE3MTkzMzcyOTEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.BCCVMRILH-as7d6hgO50SzwnzlXaotcTzIssb6fU4JA";

    public static void main(String[] args) {
        while (true) {
            String[] options = { "Listar Convênios", "Consultar Boleto" };
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                listarConvenios();
            } else if (choice == 1) {
                consultarBoleto();
            } else {
                break;
            }
        }
    }

    public static void listarConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + TOKEN);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String responseString = response.toString();
            if (responseString.length() > 200) {
                responseString = responseString.substring(0, 200) + "...";
            }

            JOptionPane.showMessageDialog(null, responseString, "Convênios", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar convênios.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
        if (linhaDigitavel != null && !linhaDigitavel.isEmpty()) {
            try {
                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Authorization", "Bearer " + TOKEN);
                connection.setDoOutput(true);

                String json = "{\n" +
                        "  \"barCode\": {\n" +
                        "    \"type\": 0,\n" +
                        "    \"digitable\": \"" + linhaDigitavel + "\"\n" +
                        "  }\n" +
                        "}";

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

                JOptionPane.showMessageDialog(null, response.toString(), "Consulta de Boleto",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao consultar boleto.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha digitável não pode ser vazia.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
