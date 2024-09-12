package segundob.listas.listaQuatroPtDois;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String[] options = {"Listagem de Convênios", "Consulta de Boletos", "Sair"};
        int choice;

        do {
            choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
            );

            switch (choice) {
                case 0:
                    listarConvenios();
                    break;
                case 1:
                    consultarBoletos();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo da aplicação.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (choice != 2);
    }

    private static void listarConvenios() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJCaDZ0UVdxcTM0YllIRmNQZEQyWUNoeVNGVVVTZWNNdGozd0FxY1U4ZkV4VmpiQTFjTDJTbXMxZDN6Q1hoMnp1a1E4UDlnYTZaOUdGSDdlL0RBb1VGZWN1WW1pR2c4elBYbjFWbEowcXhRWFZRWHRKdE05MThQeEQ2TDYwWG5BUlRKdEcyVVBSSlJselRmZXZla1NFY1NMZHhrOHlibnBudG9hT0J0cHdaa1pOdi9IcmFWNURhWjRzWExvekJZQURMN1RpUzNRUkprQjhPMTVRUThQaWJKeFBaMGRPcmZPTlZySE1oZG1EMjR0VHI3MkYzS3pLOXZneE5GcEY1eTRvSzltZE1ycEJCbUVmRmhaY1pnVDFVT2pkSzIxSEVXdzJLWlZub3hYdTNDKzVwMlF1ZGRjME1nWmd0RFNnc2tIc2xUOVlXRU9GMEtmZ3BqMDNIaGt6dEZzbzBMaW41TmxKZXJpY0JjV3RDUlYzZTVHQ3dPL0VrRlJPTHRpOEFFU1AxMXk3Zk5JUTUzeG51c2dpcittV3QrbG5DblBoUGlnT0xqOGNJZlR6bGJMbXhsWkR2YWhMb2lJQW85YlVmTXIyS2VmM1dTMW1VMUpYNTBFNDRQR2ZjcFl1VlpRdXYxajd1VEtrb0RkdGxKM1QxTldSWGc1OXNUMDBTcVJMZEpvSmZiNEVYdkNCdDRZOFoveXN1M05VdkZ1WFFENmZXUks0UU1CVTM3ZGoyM0ZnZTdJeUw3R1d6emhCcElJVVd5SUFZVTRrTzM2SG1LVURsNjgzaVVkZTNRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiODAxMTk4YjMzZjJiNDA5ODlkYWEiLCJleHAiOjE3MTkxNzAxODEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.wvfAXJnO-3xNDQOwTqvFTADRPqgZieF9Fa7Ze6_Gqyg");
            connection.setDoOutput(false);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String formattedResponse = "<html>" + formatStringBuilder(response, 40) + "</html>";
            JOptionPane.showMessageDialog(null, formattedResponse);

        } catch (Exception e) {
            e.printStackTrace();

            return;
        }
    }

    public static String solicitarLinhaDigitavel() {
        return JOptionPane.showInputDialog("Insira a linha digitável!");
    }

    private static void consultarBoletos() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String linhaDigitavel = solicitarLinhaDigitavel();

            String json = "{\n" +
                                "  \"barCode\": {\n" +
                                "    \"type\": 0,\n" +
                                "    \"digitable\":\"" + linhaDigitavel + "\"\n" +
                                "  }\n" +
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJCaDZ0UVdxcTM0YllIRmNQZEQyWUNoeVNGVVVTZWNNdGozd0FxY1U4ZkV4VmpiQTFjTDJTbXMxZDN6Q1hoMnp1a1E4UDlnYTZaOUdGSDdlL0RBb1VGZWN1WW1pR2c4elBYbjFWbEowcXhRWFZRWHRKdE05MThQeEQ2TDYwWG5BUlRKdEcyVVBSSlJselRmZXZla1NFY1NMZHhrOHlibnBudG9hT0J0cHdaa1pOdi9IcmFWNURhWjRzWExvekJZQURMN1RpUzNRUkprQjhPMTVRUThQaWJKeFBaMGRPcmZPTlZySE1oZG1EMjR0VHI3MkYzS3pLOXZneE5GcEY1eTRvSzltZE1ycEJCbUVmRmhaY1pnVDFVT2pkSzIxSEVXdzJLWlZub3hYdTNDKzVwMlF1ZGRjME1nWmd0RFNnc2tIc2xUOVlXRU9GMEtmZ3BqMDNIaGt6dEZzbzBMaW41TmxKZXJpY0JjV3RDUlYzZTVHQ3dPL0VrRlJPTHRpOEFFU1AxMXk3Zk5JUTUzeG51c2dpcittV3QrbG5DblBoUGlnT0xqOGNJZlR6bGJMbXhsWkR2YWhMb2lJQW85YlVmTXIyS2VmM1dTMW1VMUpYNTBFNDRQR2ZjcFl1VlpRdXYxajd1VEtrb0RkdGxKM1QxTldSWGc1OXNUMDBTcVJMZEpvSmZiNEVYdkNCdDRZOFoveXN1M05VdkZ1WFFENmZXUks0UU1CVTM3ZGoyM0ZnZTdJeUw3R1d6emhCcElJVVd5SUFZVTRrTzM2SG1LVURsNjgzaVVkZTNRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiODAxMTk4YjMzZjJiNDA5ODlkYWEiLCJleHAiOjE3MTkxNzAxODEsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.wvfAXJnO-3xNDQOwTqvFTADRPqgZieF9Fa7Ze6_Gqyg");
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

            String formattedResponse = "<html>" + formatStringBuilder(response, 40) + "</html>";
            JOptionPane.showMessageDialog(null, formattedResponse);

        } catch (Exception e) {
            e.printStackTrace();

            return;
        }
    
    }

    public static String formatStringBuilder(StringBuilder sb, int lineLength) {
        StringBuilder result = new StringBuilder();

        int length = sb.length();
        for (int i = 0; i < length; i += lineLength) {
            if (i + lineLength < length) {
                result.append(sb.substring(i, i + lineLength)).append("<br>");
            } else {
                result.append(sb.substring(i));
            }
        }

        return result.toString();
    }
}

