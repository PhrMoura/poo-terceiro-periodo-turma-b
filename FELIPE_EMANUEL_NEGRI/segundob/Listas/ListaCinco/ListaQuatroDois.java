package segundob.Listas.ListaCinco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.swing.JOptionPane;

public class ListaQuatroDois  {
    public static void main(String[] args) {
        List<String> opcoes = List.of("Listagem de convenios", "Consulta de boleto", "Pinxar");

        String opcao = (String) JOptionPane.showInputDialog(null,
        "O que deseja fazer??",
        "ℳ",
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes.toArray(), opcoes.toArray()[0]);

        switch (opcao) {
            case "Listagem de convenios":
                    JOptionPane.showMessageDialog(null,
                    listagemDeConvenio().substring(0, 200),
                    "Convenios ate 200 caracteres.",
                    JOptionPane.INFORMATION_MESSAGE);
                break;

                case "Consulta de boleto":
                    JOptionPane.showMessageDialog(null,
                    consultaBoleto(),  //para utillizar a formatação do boleto so colar isso aqui do lado :) <- formatJson(consultaBoleto())
                    "Boleto",
                    JOptionPane.INFORMATION_MESSAGE);
                break;

                case "Pinxar":
                    System.exit(0);
                break;
        
            default:
                break;
                
        }
    }

    public static String listagemDeConvenio() {
        try {
            
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJzbTA1UEFTcU5XenR6dFBxb0RBNlg0Ulo0ckVmMmUySEg3dXlSNW53Rkt3VWtVUXFpWEVrYXd2dkg0YjZPMkw3K21SMnAxTHlPQVZwS1dLL1ZSZWpFL08xYUFmR0dxMGNFTTJldGxDaGdrY2dMaUQ2OXBrWEticGpxK1hZTW9CWEdZR2tIQlAzb2FnanFnc0xNZDNJVXRxcEZyNnkrNngybk56cWtadmU3QU0vaHBOWUpMemJBdDlkdzREcDE5djBEdGpPdExpVzB0TXZQcjBZU29JVm10akozUGxWYkY1S0VZMy81R01VRG1YZGFBVVdONDNOUDkvTnM1eU1OeHpLdEVkalJXbkVldTNtanJBMGRaZGZFNTNrL093WjdWcnpFcWdrL1kxYndyUFBidnFLU2JIMlZXNnF6MlcrQndsM1JReGJzKzNkMDgvT3BhS0tScU4vMkprVDdnUGM2YmN3U2x5MEFWa1hPbXRtZ1dXWlY4anBleU1idk5PaXNuLzYxVnFLL1Rickh3T0trNkxST3NyUkVFSDFqRmlOd1JXREJGeThsUkl4b2d4VXZBb0lvUnI3T1N2Mi93TXVvTk1NNGR4c0pieUtSL1pEVWpnbTB6dW5FY3puZEtCc3VRdkJqL2h6SmtIZ21ON2QzTnhHeGcwMW9DakpSK3pxOERkN0xleFdpeEo4cHh2bmhmdFBxWUlGVXhRS1FLeVZpSXlXVnJCem5zd3lkQlIxSFBIYlNFWEFpQkgyWmFqMVVCVW9nN0RrQWRZU01WWnpic2tDajU0Rm9nPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNDY5MmRhZDhkNThiNGVlMmJmNGYiLCJleHAiOjE3MTkzNDkwODcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.sJZRpxNSxDI9N4bdqyoLO1hxlxq3yVvkEe-Bw4fliF4");


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
        }
        return null;
    }

    public static String consultaBoleto() {

        try {
            
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String dadosBoleto = JOptionPane.showInputDialog(null,
            "Insira o codigo do Boleto",
            "😈",
            JOptionPane.QUESTION_MESSAGE);

            String json = "{\n" + //
                                "  \"barCode\": {\n" + //
                                "    \"type\": 0,\n" + //
                                "    \"digitable\": \"" + dadosBoleto + "\"\n" + //
                                "  }\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-type", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJzbTA1UEFTcU5XenR6dFBxb0RBNlg0Ulo0ckVmMmUySEg3dXlSNW53Rkt3VWtVUXFpWEVrYXd2dkg0YjZPMkw3K21SMnAxTHlPQVZwS1dLL1ZSZWpFL08xYUFmR0dxMGNFTTJldGxDaGdrY2dMaUQ2OXBrWEticGpxK1hZTW9CWEdZR2tIQlAzb2FnanFnc0xNZDNJVXRxcEZyNnkrNngybk56cWtadmU3QU0vaHBOWUpMemJBdDlkdzREcDE5djBEdGpPdExpVzB0TXZQcjBZU29JVm10akozUGxWYkY1S0VZMy81R01VRG1YZGFBVVdONDNOUDkvTnM1eU1OeHpLdEVkalJXbkVldTNtanJBMGRaZGZFNTNrL093WjdWcnpFcWdrL1kxYndyUFBidnFLU2JIMlZXNnF6MlcrQndsM1JReGJzKzNkMDgvT3BhS0tScU4vMkprVDdnUGM2YmN3U2x5MEFWa1hPbXRtZ1dXWlY4anBleU1idk5PaXNuLzYxVnFLL1Rickh3T0trNkxST3NyUkVFSDFqRmlOd1JXREJGeThsUkl4b2d4VXZBb0lvUnI3T1N2Mi93TXVvTk1NNGR4c0pieUtSL1pEVWpnbTB6dW5FY3puZEtCc3VRdkJqL2h6SmtIZ21ON2QzTnhHeGcwMW9DakpSK3pxOERkN0xleFdpeEo4cHh2bmhmdFBxWUlGVXhRS1FLeVZpSXlXVnJCem5zd3lkQlIxSFBIYlNFWEFpQkgyWmFqMVVCVW9nN0RrQWRZU01WWnpic2tDajU0Rm9nPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNDY5MmRhZDhkNThiNGVlMmJmNGYiLCJleHAiOjE3MTkzNDkwODcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.sJZRpxNSxDI9N4bdqyoLO1hxlxq3yVvkEe-Bw4fliF4");
            connection.setDoOutput(true);

            try (OutputStream os =connection.getOutputStream()) {
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

            return response.toString();
        } catch (Exception e) {
           e.printStackTrace();
           return null;
        }
    }


    /* 

    ***TENTEI PROCURAR ALGUMAS MANEIRAS PARA FAZER A QUEBRA NO PRINT DO BOLETO MAS NAO ACHEI NENHUMA, SOMENTE ESSA Q O CHATGPT ME AJUDOU,
    SE VOCE QUISER UTILIZAR PARA FACILITAR NA LEITURA PODE USAR, POREM VOU DEIXAR TRIPAO MESMO PORQUE ISSO AQUI É MALUQICE TOTAL GRATO***

    public static String formatJson(String jsonString) {
        StringBuilder formattedJson = new StringBuilder();
        String indentString = "";
        boolean inQuotes = false;

        for (char charFromJson : jsonString.toCharArray()) {
            switch (charFromJson) {
                case '"':
                    inQuotes = !inQuotes;
                    formattedJson.append(charFromJson);
                    break;
                case ' ':
                    if (inQuotes) {
                        formattedJson.append(charFromJson);
                    }
                    break;
                case '{':
                case '[':
                    formattedJson.append(charFromJson);
                    if (!inQuotes) {
                        indentString = indentString + "  ";
                        formattedJson.append("\n").append(indentString);
                    }
                    break;
                case '}':
                case ']':
                    if (!inQuotes) {
                        indentString = indentString.substring(0, indentString.length() - 2);
                        formattedJson.append("\n").append(indentString);
                    }
                    formattedJson.append(charFromJson);
                    break;
                case ',':
                    formattedJson.append(charFromJson);
                    if (!inQuotes) {
                        formattedJson.append("\n").append(indentString);
                    }
                    break;
                case ':':
                    if (!inQuotes) {
                        formattedJson.append(charFromJson).append(" ");
                    } else {
                        formattedJson.append(charFromJson);
                    }
                    break;
                default:
                    formattedJson.append(charFromJson);
            }
        }

        return formattedJson.toString();
    }*/
}

