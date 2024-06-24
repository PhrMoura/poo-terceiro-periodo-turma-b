import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class Lista4part2 {
    public static void main(String[] args) {
        String[] options = {"Listar convênios de pagamento", "Consulta de boleto"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);


        switch (choice) {
            case 0:
                listarConvenios();
                break;
            case 1:
                consultarBoleto();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }


    private static void listarConvenios() {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("accept", "application/json");


            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();


                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();


                JOptionPane.showMessageDialog(null, response.toString(), "Convênios de pagamento", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao listar convênios. Código de resposta: " + responseCode, "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    private static void consultarBoleto() {
        String linhaDigitavel = JOptionPane.showInputDialog(null, "Digite a linha digitável do boleto:", "Consulta de boleto", JOptionPane.QUESTION_MESSAGE);


        if (linhaDigitavel != null && !linhaDigitavel.trim().isEmpty()) {
            try {
                @SuppressWarnings("deprecation")
                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("accept", "application/json");
                conn.setRequestProperty("content-type", "application/json");
                conn.setDoOutput(true);


                String jsonInputString = "{\n" +
                        "  \"barCode\": {\n" +
                        "    \"type\": 0,\n" +
                        "    \"digitable\": \"" + linhaDigitavel + "\"\n" +
                        "  }\n" +
                        "}";


                try (OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("utf-8");
                    os.write(input, 0, input.length);
                }


                int responseCode = conn.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();


                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();


                    JOptionPane.showMessageDialog(null, response.toString(), "Resultado da consulta", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha na consulta do boleto. Código de resposta: " + responseCode, "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Linha digitável inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}


