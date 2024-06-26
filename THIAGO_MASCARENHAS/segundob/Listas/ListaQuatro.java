package segundob.Listas;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListaQuatro {

    private static final String API_URL_LISTA_CONVENIOS = "https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions";
    private static final String API_URL_CONSULTA_BOLETOS = "https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize";
    private static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJRMHhBYnBhQU56bHFpUjV0QWRIYWJITGNoZ2hwY3drNkZYaU1nMktOeUZPdDNEZWRLWEdHU3lFL2thVVN3eFh0bElZclloSURjOWRzaXBIVFpxTXdjbjZCcCt4K2pOWDZCa0dicTN5eWlmM0hKc3l0bzNBY0diQTQ4Qm5JOE5hcHdGMGduQkdpeG82eE0yNVVTMVJTVVZKTmFOVEp1MjlzajRjeVp0b0ZiamZqSVZ3aW1tbURvV1dqSGFPM0NWUlhoZ2ZoTUdpdmhUaXluSzdUK0NXOWJaNHBoS2ZkaWZJNTQ3SWlKRWE4ZVJrMUN3SlV2QzNnV0VhYmptZ0QrcndrVkhZZGFNcDJMVS9KbU5IRTA0QjU4OCtBQWRhek4vdWVZUEZNNkhDSTQrWXBLT0VZZ3djaVQ2eVlJL2kvQ25aTkhSSlkwekpjQU5sZnlFQTZqVk9uRXh3d3VpNjlEMDcxODhMaDBwRHpLTm1lOTFPVnVxRzUzRVkxekE4ejJ3ZnlZY2dEUFpvUjNtZVFkOUVkTFZPNnFHRWkvTG1nMmhxMlNFTDhWODM0ajk2Z2svL2hJQ0xHV3grMStEdzFrd3FzTU5lcmpKeWNDajFCWVJ2NHArYUU2ZTRRakhFdFptbytMaVU1bXBOM3h1WUpZMjFabzltaDluSkZVTVFPc2hIaFg0V3NMNjFHYVFJOWc2cE5nQ0xHUnYrd2NPM1o2TGxCQ3dtV0M2UFVXd0d4THhzaEc3MHF5SVpzS0VTdXdtRzZkTVdzSU5tWi9xQWpZVTFBV2FUbndBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNjk5ZjFiODAxNTFjNDVmNjkzODMiLCJleHAiOjE3MTkzNDI4MDMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.pkxq5zG8gKKxnTfqSHCbQQF9EzZtWalQtRxApyCt8v0";

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Listar Convênios", "Consultar Boleto", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (escolha == 0) {
                listarConvenios();
            } else if (escolha== 1) {
                consultarBoleto();
            } else {
                break;
            }
        }
    }

    private static void listarConvenios() {
        try {
            String response = makeGetRequest(API_URL_LISTA_CONVENIOS);
            JOptionPane.showMessageDialog(null, response, "Lista de Convênios", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar convênios: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog(null, "Informe a linha digitável do boleto:", "Consultar Boleto", JOptionPane.QUESTION_MESSAGE);
        if (linhaDigitavel != null && !linhaDigitavel.trim().isEmpty()) {
            try {
                String response = makePostRequest(API_URL_CONSULTA_BOLETOS, linhaDigitavel);
                JOptionPane.showMessageDialog(null, response, "Consulta de Boleto", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar boleto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static String makeGetRequest(String urlStr) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + TOKEN);
        conn.setRequestProperty("Content-Type", "application/json");

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new RuntimeException("Failed : HTTP error code : " + responseCode);
        }
    }

    private static String makePostRequest(String urlStr, String linhaDigitavel) throws Exception {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + TOKEN);
        conn.setRequestProperty("Content-Type", "application/json");

        String jsonInputString = "{\"digitableLine\": \"" + linhaDigitavel + "\"}";

        conn.setDoOutput(true);
        try (java.io.OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new RuntimeException("Failed : HTTP error code : " + responseCode);
        }
    }
}
