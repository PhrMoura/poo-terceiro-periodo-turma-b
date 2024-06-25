package segundob.listas.listaQuatroDois;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Atividade {

    public static void main(String[] args) {
        String[] options = { "Consultar Boleto", "Listar Convênio" };
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (opcao) {
            case 0:
                String digitable = JOptionPane.showInputDialog(null, "Digite o código:");

                String jsonData = Boleto(digitable);
                String maxCaracteres = maxCaracteres(jsonData, 100);
                JOptionPane.showMessageDialog(null, maxCaracteres, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 1:
                try {
                    String jsonDataB = Convenio();
                    if (jsonDataB != null) {

                        String maxCaracteresB = maxCaracteres(jsonDataB, 100);
                        JOptionPane.showMessageDialog(null, maxCaracteresB, "JSON",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao obter dados", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Exceção",
                            JOptionPane.ERROR_MESSAGE);
                }
                break;

            default:

                break;
        }
    }

    public static String Convenio() {
        try {
    
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJEL3dSdTJNMnZyNjl3MHU5RnBURnNxczE5MDRkOU5XSFNlR3BPQTdGY3FBWnk0ZjA0bHVhZHcwMVdEaTZoUkswQTlDV0hEcU9nVjRxYUtmU0JJeUxRZm1OWFltTjMzeXczclc3RGtxZWN0azJIcVlqNlUvNVUzYUJ2aGhOY044UnMveTduYmxXb3VVL254MXV4aXhQc3kySkFyTDV6WUxueFdDVkFHMzNKQ3BlWG1xMW8xTFBJbkJmUGxXZ2hUOUo2ZG1Ga2tUMFREQnZ1RktiSUlVQ0Q1TkFKbTQrZCt4OHp5OEMyS29mWDA5MEI0eHk5NklYNjcyRm80RjZVY3VROGZRMnJmb3pIOHBueXV3K3dSbU1GTnU2R1B0MnpZc2V4T3R3WmhGWFJQMW1aVnRPcDlEM2VYTHdIZVdCSzc0a0M3QmhTYXRkejduN3hHc2YvVUZIOU50a1p6YmFjRkxIT2pTTzQzbXI5WEszZzAvclhoYW96dVIzTVgxQjBhbHVEOWxlbnVaRmJyV1dBT2JkV0dJTlplcFl3Tmh3MUF6TjNnVGQweitqcnRKWkF5QlVRcjl1aFVYRHRwOTdkUmFQSW9MTDZIVTlKcEgvb0tGcFBpV2gwTkZnczZHWDNVeHdUaW15eG9QcFVxZzZZNnRWRnl5L2wwYkdITldkdDVEZGtJWG9NU29aanoyeDVha3lDVEw2RjkrNGlNSVAvM3BJSnFHeW1QK1VBbXJJZFg4dWNYcWRNb0dabko4dlBmaTBlam4wd1hMNHR1cjFhU0lXWXF1VmR3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZDdmMzA4NWI3NGI4NDY4NWEwMWYiLCJleHAiOjE3MTkxNzQ0MzIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.sik-WF8AIA3TlYL98YqXwJdYLAMjgDWflp8BsAUUNYg");
            connection.setDoOutput(true);

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

    public static String Boleto(String token) {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String json = "{\r\n" +
                    "  \"barCode\": {\r\n" +
                    "    \"type\": 0,\r\n" +
                    "    \"digitable\": \"" + token + "\"\r\n" +
                    "  }\r\n" +
                    "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJEL3dSdTJNMnZyNjl3MHU5RnBURnNxczE5MDRkOU5XSFNlR3BPQTdGY3FBWnk0ZjA0bHVhZHcwMVdEaTZoUkswQTlDV0hEcU9nVjRxYUtmU0JJeUxRZm1OWFltTjMzeXczclc3RGtxZWN0azJIcVlqNlUvNVUzYUJ2aGhOY044UnMveTduYmxXb3VVL254MXV4aXhQc3kySkFyTDV6WUxueFdDVkFHMzNKQ3BlWG1xMW8xTFBJbkJmUGxXZ2hUOUo2ZG1Ga2tUMFREQnZ1RktiSUlVQ0Q1TkFKbTQrZCt4OHp5OEMyS29mWDA5MEI0eHk5NklYNjcyRm80RjZVY3VROGZRMnJmb3pIOHBueXV3K3dSbU1GTnU2R1B0MnpZc2V4T3R3WmhGWFJQMW1aVnRPcDlEM2VYTHdIZVdCSzc0a0M3QmhTYXRkejduN3hHc2YvVUZIOU50a1p6YmFjRkxIT2pTTzQzbXI5WEszZzAvclhoYW96dVIzTVgxQjBhbHVEOWxlbnVaRmJyV1dBT2JkV0dJTlplcFl3Tmh3MUF6TjNnVGQweitqcnRKWkF5QlVRcjl1aFVYRHRwOTdkUmFQSW9MTDZIVTlKcEgvb0tGcFBpV2gwTkZnczZHWDNVeHdUaW15eG9QcFVxZzZZNnRWRnl5L2wwYkdITldkdDVEZGtJWG9NU29aanoyeDVha3lDVEw2RjkrNGlNSVAvM3BJSnFHeW1QK1VBbXJJZFg4dWNYcWRNb0dabko4dlBmaTBlam4wd1hMNHR1cjFhU0lXWXF1VmR3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZDdmMzA4NWI3NGI4NDY4NWEwMWYiLCJleHAiOjE3MTkxNzQ0MzIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.sik-WF8AIA3TlYL98YqXwJdYLAMjgDWflp8BsAUUNYg");
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

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

    public static String maxCaracteres(String jsonData, int maxLength) {
        if (jsonData.length() <= maxLength) {
            return jsonData;
        } else {
            return jsonData.substring(0, maxLength) + "...";
        }
    }

}