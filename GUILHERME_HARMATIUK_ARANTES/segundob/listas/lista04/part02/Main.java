package segundob.listas.lista04.part02;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        String opcao = menuOpcoes();
        String response = "Erro ao obter dados";
        
        try {
            if (opcao == "Listar Convênios de Pagamento") {
                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");  
                HttpURLConnection connection = createApiRequest(url, "GET");
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder res = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) { res.append(line); }
                reader.close();
                connection.disconnect();
                response = res.toString();

                handleConvenioResponse(response);

            } else if (opcao == "Consulta de Boleto") {
                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");
                HttpURLConnection connection = createApiRequest(url, "POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setDoOutput(true);
                try (OutputStream os = connection.getOutputStream()) {
                    byte[] input = getConsultaBoletoJson().getBytes(StandardCharsets.UTF_8);
                    os.write(input, 0, input.length);
                }
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder res = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) { res.append(line); }
                reader.close();
                connection.disconnect();
                response = res.toString();

                handleBoleto(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void handleBoleto(String response) {
        Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(response);
        Map<String, Object> jsonData = new HashMap();
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);

            jsonData.put(key, value);
        }
        StringBuilder sb = new StringBuilder();

        String valor;
        if (jsonData.get("value") != null) { // Não entendi porq não vai direito
            valor = jsonData.get("value").toString();
        } else { valor = "Ocorreu um erro ao ler o valor do boleto"; }

        sb.append("Boleto:");
        sb.append("\nRecipiente: " + jsonData.get("recipient"));
        sb.append("\nPagador: " + jsonData.get("payer"));
        sb.append("\nValor: " + valor);

        JFrame frame = new JFrame("Informações Boleto");
        JOptionPane.showMessageDialog(frame, sb.toString(), "Informações Boleto", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String getConsultaBoletoJson() {
        JFrame frame = new JFrame("Convênios");
        String digitavel = JOptionPane.showInputDialog(frame, "Digiável", "Teste", JOptionPane.INFORMATION_MESSAGE);
        
        return "{\r\n  \"barCode\": {\r\n    \"type\": 0,\r\n    \"digitable\": \"" + digitavel + "\"\r\n  }\r\n}";
    }

    private static void handleConvenioResponse(String response) {
        Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(response);
        Map<String, Object> jsonData = new HashMap();


        List<String> listaConvenios = new ArrayList<String>();
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);
            if (key.contains("Nomeconvenant")) {
                listaConvenios.add(value);
            }
            jsonData.put(key, value);
        }

        StringBuilder sb = new StringBuilder();
        listaConvenios.forEach(convenio -> {
            sb.append(convenio + "\n");
        });
        JFrame frame = new JFrame("Convênios");
        JOptionPane.showMessageDialog(frame, sb.toString(), "Teste", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String menuOpcoes() {
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        List<String> listaOpcoes = List.of(
            "Listar Convênios de Pagamento", 
            "Consulta de Boleto" 
        );  
        
        return (String) JOptionPane.showInputDialog(
            null, 
            "Escolha a função da aplicação que deseja rodar.", 
            "Menu",
            JOptionPane.PLAIN_MESSAGE, 
            null,
            listaOpcoes.toArray(),
            null
        );
    }
    public static HttpURLConnection createApiRequest(
        URL url,
        String type
    ) throws ProtocolException, IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(type);
        connection.setRequestProperty("Authorization", "Bearer " + bearerToken());
        // connection.setDoOutput(true);
        return connection;
    }
    public static String bearerToken () {
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJsMUZLSXhzNTFxYVZBL3JZSldjZmZaTUFUbXVCM2pNcXY0cU5NbmZXUUtjaTZSU3BZMmtocmViZXc1M3hCNUVIaDFtYmgvZmZSS3gxNWxBS2Y0ejRONC9sQUw1d1laajcwSTJtTFFySG1aODM4eGdValhDdmlIWitRd3dLNWlBL3ZHbnlxcENpanlQTWJtLzhjUWxPK0NzSTFZZE91WHRUU3ZQNTk4Nitqc0dYbnZGeFlEdnV6ZFpnc1ZUQXhldXRWamxMRUlRTUs4NU5xYk8rMmVndk1qdlBHU1dMQWx3dnNnZ05NNldMSk9xWVRlMDJ4YytNTFhEcVRVT1BLMHQ1Sk9yY05rdkFNTUtOUzJPZmZUMVRQQ0Ywb0NwLytxTzk3cnVoa3N4UFpEWnFrTEtINng2MitoeWlkTFJTdEhQZC9nK0dyV2dRWkJWa2Y0UHlBYXcrVjBUZlZCSWRIUVZmRnVSNm1EK2hzRWJ3NW5XM2VnUlN1VFJ5ZHlVV3pveFMzR0ZwME1SN3R6eGQ2cjNTVkh4NFlmQ3dacnhrb0QvUDg3R3RuRyswQkJSVDZacGZIWlJ2MXUwai9jYTdqSWVrY2kxNklCdlJyaEpaKzNxRmhKNm04OUFqZDgxNVkwQzBtdVlXT3V5UW1ZQ1NaRURUTm5iaVduSmxxc2ZNWXM5OEtydktZUGFJa1lBb1hQR2dXbXRrTUFQbnRuZXRVSFNjOFQ5NWhxWVh2dWNQRk1NQTlvQUN4b3RYVTBWcVozTUtVR0IrRlRqR0J3UXg2T0d2cGdLWHZ3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZmRjMWEwZjQyYjQwNDkwYWE2MDIiLCJleHAiOjE3MTkzNTQ3NjUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.YVAsyBPoXY5U2gE4ROmHwiYJWjIYCHPwquMJ9OsNNTc";
    }
}