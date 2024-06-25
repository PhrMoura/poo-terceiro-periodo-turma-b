package segundob.listas.lista4pt2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            escolha();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(boleto(null, 20d));
    }
    public static void escolha() {
        String[] operacoes = {"Listar Convênios", "Consulta de Boleto"};
            int esc = JOptionPane.showOptionDialog(null, "Por favor, escolha a operação que deseja realizar", "Qual?", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

           switch (esc) {
            case 0:
            JOptionPane.showMessageDialog(null, "A opção escolhida foi convênio", "Escolha", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "" + getJsonConv(), "Convênio", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
            JOptionPane.showMessageDialog(null, "A opção escolhida foi boleto", "Escolha", JOptionPane.INFORMATION_MESSAGE);
            String codBarras = JOptionPane.showInputDialog(null, "Informe o código de barras: ");
            String bol = boleto(codBarras, 20d);
            JOptionPane.showMessageDialog(null, bol);
            break;
            default:
                break;
           }
    }

    public static String getJsonConv() {
        try {
            //URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            //criando conexão HTTP para a URL especificada
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //config método da requisição(GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJGa1ZNeVVsY2FUdE9sN1JTbDFPMzNsSVNkQmc0UmNaR0RSTGZrM04za3laMno4OEU3TlA5ZGptVTJabEhQY0NHdkxmZVQ2c0o2MkNLSm9kcTAwaW50UmhmYmpZNlljZ3pnQ1V3cDFSSmwxNmFwb1ZONEgxbUdkUDBQVlRJclpidnhJaGpqcEpwVjBObE9vK3BCVlB5cHk3QmpFYnZkakZCejgybGY4NVUvOG9jQ3JEVHdzSmwvSlRKUXRyTmR0UlJrSk4xT25HYWVtcU8wekxTMzZxMlpRNXM2ejkxY0VESW1sUDNvQWF3SUtLN2owQXZacnlaVHl0UzdubXorNUhPcUdZU1ZTOTNQTng0Y0RmUDZZUDcrZlZyaE9uTzlmRTZJZGJ6eSs1WUd3N015bVRmZkZKdytWYXJLZ1pBcURyOWRvMXIyeW5YWUhEcHgxK2d1RE1TRGc1K3RiUHZkVmNvd2p1aGsyeFI5WFhKMWt1bWMwNmVJbEMvZFJYSjlMTW1CSjM3UFRKS2RxRy9XaWpwVDRzRFFaTzFDSVhXOWFPL2dMTjdaUGQwMVVLM1lIc0JiczdGSFp0Sk56clRqcDYvKzlQeWF2Wm4xU2JIRlhBc25JVTNCWEtSbHlTSjRhOCtIUERBZUM2Zlppd2tmaWhNdUdmYWNCc3kvb29kK1dWSWlCY0xNTWd0eDg4ZmY2TExGREpVdmRROWNzaDZFU252amJCMVMraFhPSTRKRmpNTlhiWDVjaUp4MEQ3K3RZME1MTStPekxjNTQ1K29VNitxclVDNGlRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMDYyYTliNWE4YjNkNGZhYWFiNDgiLCJleHAiOjE3MTkyODYwMzUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.IOzIx56u-pL86yMWBypj9Suafe8BZC3QDiDdyoF0cbQ");

            //lendo response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            //fechando a conexão
            connection.disconnect();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    public static String boleto(String token, Double amount) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String json = "{\r\n" + //
                                "  \"barCode\": {\r\n" + //
                                "    \"type\": 0,\r\n" + //
                                "    \"digitable\": \"23793381286008301352856000063307789840000150000\"\r\n" + //
                                "  }\r\n" + //
                                "}";

            // Dados da Headers da nossa request & configs
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJGa1ZNeVVsY2FUdE9sN1JTbDFPMzNsSVNkQmc0UmNaR0RSTGZrM04za3laMno4OEU3TlA5ZGptVTJabEhQY0NHdkxmZVQ2c0o2MkNLSm9kcTAwaW50UmhmYmpZNlljZ3pnQ1V3cDFSSmwxNmFwb1ZONEgxbUdkUDBQVlRJclpidnhJaGpqcEpwVjBObE9vK3BCVlB5cHk3QmpFYnZkakZCejgybGY4NVUvOG9jQ3JEVHdzSmwvSlRKUXRyTmR0UlJrSk4xT25HYWVtcU8wekxTMzZxMlpRNXM2ejkxY0VESW1sUDNvQWF3SUtLN2owQXZacnlaVHl0UzdubXorNUhPcUdZU1ZTOTNQTng0Y0RmUDZZUDcrZlZyaE9uTzlmRTZJZGJ6eSs1WUd3N015bVRmZkZKdytWYXJLZ1pBcURyOWRvMXIyeW5YWUhEcHgxK2d1RE1TRGc1K3RiUHZkVmNvd2p1aGsyeFI5WFhKMWt1bWMwNmVJbEMvZFJYSjlMTW1CSjM3UFRKS2RxRy9XaWpwVDRzRFFaTzFDSVhXOWFPL2dMTjdaUGQwMVVLM1lIc0JiczdGSFp0Sk56clRqcDYvKzlQeWF2Wm4xU2JIRlhBc25JVTNCWEtSbHlTSjRhOCtIUERBZUM2Zlppd2tmaWhNdUdmYWNCc3kvb29kK1dWSWlCY0xNTWd0eDg4ZmY2TExGREpVdmRROWNzaDZFU252amJCMVMraFhPSTRKRmpNTlhiWDVjaUp4MEQ3K3RZME1MTStPekxjNTQ1K29VNitxclVDNGlRPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMDYyYTliNWE4YjNkNGZhYWFiNDgiLCJleHAiOjE3MTkyODYwMzUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.IOzIx56u-pL86yMWBypj9Suafe8BZC3QDiDdyoF0cbQ");
            connection.setDoOutput(true);

            // Escrevendo JSON na request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Lendo retorno Json da request e atribuindo em uma String
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            // String com nosso Json
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

}
