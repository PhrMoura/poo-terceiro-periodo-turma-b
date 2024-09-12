package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class Lista4 {
    public static String listarConvenios(String token) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJuSVZDR1k0cVpZazYzcHVaU0o5WUpqZHhmeVpiam5lMUFUUnNWV1hWeGlXdkoxcGhHUFBJZ2RsejFWOFQvazVBblZUQjdzdzhGUFhRS3NGNUFPZVEyRzhNUFlvSDJWcXNFNWl6b1ZETTZ4VEpQcUJRLzFYVzkwSENrSjZ1aUphdkptamUxckt0STBNVHBOMHF6RWJsWFlwUUNySkwzRGNWTkMva3YvazlFQ1NsWDlTbUpzN2RhMGlIK01UdndGdzhEcklhdFhHbW9QUWdQaXZJeitCQk9FYWRIa2NlbUhGT0RqQXBVVUNueFpJZTV1OEErYXNpL3BIOXlFdU5RcTRXa1FSaExkR3VYM3ZoSjhqOHVURXFob2NXcXd4S3VhVk9Gd2xtY3drSkZlTXpUbEs0dTZmeDNuVm41dkRYQ3JEYWJLTUdmWFFzLy9OczBidU9mTnNlRmljZTB6NGoxME5mejdrcDdXMzlHVDA5dWU1bzBOVEdDaXhsNGJqR1pFb3dOUjV2RjJiSHR5c1BzeDJFWGxTRkNjK3VYMTFNQ01UbnBYYXI1dWFMS2hrT3NkVERrdW03dy9tVVBIZjhNL1RMMS83S293ZU9LaERmV1psbkFkeXpxSGV5czJXZU5qUzcyd1gxNy9sQ25ncm5WZHQ1TFJQVmcwNXZEVzlWSlMwVXZwaUcyejF0QkZScDlHZUROUmRGMTYxc1ZRTUZOVTNCZ09xcFhyQ25Da3ROYWdSM0M4bHYvQVM1TE00ZGhreGk0cWlpeFVjOGVpS0F1Z25VemtLRG9nPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMDYwZjExMzBlYzM4NGZkMjlkNWYiLCJleHAiOjE3MTkzNDQ5MDUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.QBr79XOGt7NGeyTqisIRJycnrb7onD3OSXCOiAr0Vzw");
            connection.setRequestProperty("Accept", "application/json");

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

    public static String consultarBoleto(String token, String linhaDigitavel) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize\r\n");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJuSVZDR1k0cVpZazYzcHVaU0o5WUpqZHhmeVpiam5lMUFUUnNWV1hWeGlXdkoxcGhHUFBJZ2RsejFWOFQvazVBblZUQjdzdzhGUFhRS3NGNUFPZVEyRzhNUFlvSDJWcXNFNWl6b1ZETTZ4VEpQcUJRLzFYVzkwSENrSjZ1aUphdkptamUxckt0STBNVHBOMHF6RWJsWFlwUUNySkwzRGNWTkMva3YvazlFQ1NsWDlTbUpzN2RhMGlIK01UdndGdzhEcklhdFhHbW9QUWdQaXZJeitCQk9FYWRIa2NlbUhGT0RqQXBVVUNueFpJZTV1OEErYXNpL3BIOXlFdU5RcTRXa1FSaExkR3VYM3ZoSjhqOHVURXFob2NXcXd4S3VhVk9Gd2xtY3drSkZlTXpUbEs0dTZmeDNuVm41dkRYQ3JEYWJLTUdmWFFzLy9OczBidU9mTnNlRmljZTB6NGoxME5mejdrcDdXMzlHVDA5dWU1bzBOVEdDaXhsNGJqR1pFb3dOUjV2RjJiSHR5c1BzeDJFWGxTRkNjK3VYMTFNQ01UbnBYYXI1dWFMS2hrT3NkVERrdW03dy9tVVBIZjhNL1RMMS83S293ZU9LaERmV1psbkFkeXpxSGV5czJXZU5qUzcyd1gxNy9sQ25ncm5WZHQ1TFJQVmcwNXZEVzlWSlMwVXZwaUcyejF0QkZScDlHZUROUmRGMTYxc1ZRTUZOVTNCZ09xcFhyQ25Da3ROYWdSM0M4bHYvQVM1TE00ZGhreGk0cWlpeFVjOGVpS0F1Z25VemtLRG9nPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMDYwZjExMzBlYzM4NGZkMjlkNWYiLCJleHAiOjE3MTkzNDQ5MDUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.QBr79XOGt7NGeyTqisIRJycnrb7onD3OSXCOiAr0Vzw");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            String json = "{\n" + //
                                "  \"barCode\": {\n" + //
                                "    \"type\": 0,\n" + //
                                "    \"digitable\": \"23793381286008301352856000063307789840000150000\"\n" + //
                                "  }";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
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

    // convenio
    public static String infoConvenio(String jsonResponse) {
        StringBuilder result = new StringBuilder();
        String[] items = jsonResponse.split("\\{");

        for (String item : items) {
            if (item.contains("\"name\":") && item.contains("\"category\":")) {
                String name = item.split("\"name\":\"")[1].split("\"")[0];
                String category = item.split("\"category\":\"")[1].split("\"")[0];
                result.append("Nome: ").append(name).append("\n");
                result.append("Categoria: ").append(category).append("\n\n");
            }
        }

        return result.toString();
    }

    // boleto
    public static String infoBoleto(String jsonResponse) {
        StringBuilder result = new StringBuilder();
        if (jsonResponse.contains("\"amount\":") && jsonResponse.contains("\"dueDate\":")) {
            String amount = jsonResponse.split("\"amount\":")[1].split(",")[0];
            String dueDate = jsonResponse.split("\"dueDate\":\"")[1].split("\"")[0];
            result.append("Valor: ").append(amount).append("\n");
            result.append("Data de Vencimento: ").append(dueDate).append("\n");
        } else {
            result.append("Informacoes do boleto nao encontradas.");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJuOEtWbmI3bWltczhUZnd6QldXUys2bkV3S0hIMjRudkJEdTlVUDdjeXpheFVlY0xvK3hpbWlxTTlVMU9ZMzlnUmlOR2dqeUtvTjNrWU9FR2dha1lteXkraktrNnFRU1Vwd3ZmLzRpdEYyaGRGMkxZNXRWNlNCelkwU0NIUTBpcVFFbVhxWVZYemE4OWV5ZzRCc0t3cmZKV3crRW1CVGxNTUJiK3FkcUtmMVA1c1RXd2ZpYXJzSDlicWUxZm5Cc1pnWm1UeEZBWS9yK2pSTGZPejlHWE52MWs2SStNMXQ1VjkwY1RXWEJ0bC96MjZONWIxWEhmeURIdnRqNjM2WGFwNmMvcXM1cnB4ODlsUVFxalpPVTFud21ObUNaSHFpSW5mcERsZ2R3QllOSlRIcTdJaTJGNTZReWZ0NXpMbFFiWFAzazdtbFQwZ1lDaFdOeEw0MW4vK0poWlNSN2N5NTNDZzhzN1BKOXJBZmpsYTBzT3lHdk80bVc3dzVYdkZxMzhtbVNjN200OC9lVmZjZ2xWMjBsdDlvajEzQnZ6QzBkQkJpNGV2Z04xVGJTSE8yNDBqZEwweEQ3eXBwUk1RWHd3eVNaMDBpelZDQkhxRmNwWGJ1aWUxcEpCQlBGRzBGZU4wdUFOczNOZE9OM0JSSVZTdkhnMjB4RlAwcEtOZ21BdU42L3Q4S3l4Ri8velgxVFg1RVRNZFpqZHF2V3oweXEvS1JDamFQTkh4Y2JZVW0vcE9XUTlBNlZkZW1kcjZhMUZGWDI4SlZhSEEvVW5hQnliTWZMRXpBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYjFiNDNjNjQ3MjcxNDk1ZGJjYmQiLCJleHAiOjE3MTkzNjUwNzQsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.x-cOQ_dx-JuiI_wIsw4IN2y2xW15BoPfAsWgDtpKbxU";

        String[] options = {"Listar convenios de pagamento", "Consultar Boleto", "Sair"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma opcaoo", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (choice == 0) {
            String response = listarConvenios(token);
            if (response != null) {
                String conveniosInfo = infoConvenio(response);
                JOptionPane.showMessageDialog(null, conveniosInfo);
            } else {
                JOptionPane.showMessageDialog(null, "Erro convenio.");
            }
        } else if (choice == 1) {
            String linhaDigitavel = JOptionPane.showInputDialog("Entre com a linha do boleto:");
            if (linhaDigitavel != null && !linhaDigitavel.trim().isEmpty()) {
                String response = consultarBoleto(token, linhaDigitavel);
                if (response != null) {
                    String boletoInfo = infoBoleto(response);
                    JOptionPane.showMessageDialog(null, boletoInfo);
                } else {
                    JOptionPane.showMessageDialog(null, "Deu erro.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Linha errada.");
            }
        } else {
            System.exit(0);
        }
    }
}
