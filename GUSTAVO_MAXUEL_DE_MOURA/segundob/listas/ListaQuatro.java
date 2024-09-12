package segundob.listas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class ListaQuatro {
    public static void main(String[] args) {
        Opcoes();   
    }
    
    public static void Opcoes() {
        String[] opcoes = {"Listar Convênios", "Consulta de Boletos"};
        
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Escolha",
                                                   JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        
        switch (escolha) {
            case 0:
                String convenios = ConsultarConvenio();
                JOptionPane.showMessageDialog(null, convenios);
                break;
            case 1:
                String codigoDeBarra = JOptionPane.showInputDialog(null, "Digite o código de barras:");
                String boleto = ConsultaDeBoletos(codigoDeBarra, 0.0);  // Ajuste o valor do amount conforme necessário
                JOptionPane.showMessageDialog(null, boleto);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você não fez uma escolha válida.");
                break;
        }
    }

    public static String ConsultarConvenio() {
        HttpURLConnection connection = null;
    
        try {
            // URL alvo da request
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");
    
            // Criando conexão HTTP para a URL especificada
            connection = (HttpURLConnection) url.openConnection();
    
            // Configurando o método da requisição (GET)
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJLZVgzbW9sK1k1bFl6dm56Q2YwamFPYUVsbjJ1bEFFWUUwSEtJU1JFVVZXb0FtZUhIRnJmRGZKS0JoQWc0RmsvVjlYMXd0dm9hdUtBcWx3K3czY3RyUVBwZGNtNGJ3Nm12TFNzMkN2dmlTNllRS082RDVZaWU2THhWdFc2Z1JzUG0xQ2NodDhDZUErTzJWeXdRc1VTQyt2WnhNVnBJMUxYYkMyV3Z2aUlVYk5nellhYk4wY2RrL0dTeXhNeXR6WlhkR0xRTXBodWc4K1VRWDk1YzRLODBmclptZnJMWjRwRlJzODRMSEpPNnEvQzJvUzUzdlo5Mk1VVFVnbzhwR2IvaHV0UGFOTlNsNHFSbDVuQzRocnRlS0VscEpYZFA1Y1BVckM2aFhRaGNYYS82TVI2bE15a2hRWWRhblBxN1ErQ3RyUkIzZnFzWVZkNTMxcklTKzRVZXdwRUxMN2VpckxuUko5akJrMWZ6ZVJ5S0t3UktjUTlndDlOQ1JrVkVUa3dyTVJHWnFsTjU2MzNsN1ovV25QK3JTbXNKcG9VUU1ndGNBYkFtNzl2NGw1ZVBnY2I1RmlCdVArWFM5b3o0SHVtd0xCV3hxR2ttTmFGa2JwbldGNTNCQ3h2STh3WU9GUnJMSFBZenplMG93TmJFUEtIQzBuenpxVEpKbDFHeWRrcmxwVy9Lck1NWFJTMG5wcFlBQ1RUQkVWK1A5b3RrNWI4UzRLc0FnblpCcS9MOWJJVGNVbjQrL3dHMU84MTlWR2laUmNBblBtYWlOUHUwYXJIbXJFV1hBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMzQ1YWY3MjM4Njc5NDg0MzhiOTIiLCJleHAiOjE3MTkyODI5NDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.wRaIk07gq21c7VDLuj7infIuJKqjfDpoQbRRGRcBY-c");
    
            // Lendo a resposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
    
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
    
            reader.close();
            connection.disconnect();
    
            // Formatando a resposta JSON com quebras de linha para exibição
            String formattedResponse = response.toString();
            formattedResponse = formatJson(formattedResponse); // Utiliza a função auxiliar para formatar o JSON
    
            return formattedResponse;
    
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
    
    // Função auxiliar para formatar o JSON com quebras de linha
    private static String formatJson(String json) {
        StringBuilder formattedJson = new StringBuilder();
        int level = 0;
        boolean inQuotes = false;
    
        for (int i = 0; i < json.length(); i++) {
            char ch = json.charAt(i);
    
            switch (ch) {
                case '{':
                case '[':
                    formattedJson.append(ch).append('\n');
                    level++;
                    appendIndent(formattedJson, level);
                    break;
                case '}':
                case ']':
                    formattedJson.append('\n');
                    level--;
                    appendIndent(formattedJson, level);
                    formattedJson.append(ch);
                    break;
                case ',':
                    formattedJson.append(ch).append('\n');
                    if (!inQuotes) {
                        appendIndent(formattedJson, level);
                    }
                    break;
                case '"':
                    formattedJson.append(ch);
                    // Ignora as aspas dentro das strings
                    if (i > 0 && json.charAt(i - 1) != '\\') {
                        inQuotes = !inQuotes;
                    }
                    break;
                default:
                    formattedJson.append(ch);
            }
        }
    
        return formattedJson.toString();
    }
    
    // Função auxiliar para adicionar indentação
    private static void appendIndent(StringBuilder sb, int level) {
        for (int i = 0; i < level; i++) {
            sb.append("    "); // Usa quatro espaços para cada nível de indentação
        }
    }
    

    public static String ConsultaDeBoletos(String codigoDeBarra, Double amount) {
        HttpURLConnection connection = null;

        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

            connection = (HttpURLConnection) url.openConnection();

            // Dados do JSON
            String json = "{\n" +
                "  \"barCode\": {\n" +
                "    \"type\": 0,\n" +
                "    \"digitable\": \"" + codigoDeBarra + "\"\n" +
                "  },\n" +
                "  \"amount\": " + amount + "\n" +
                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJLZVgzbW9sK1k1bFl6dm56Q2YwamFPYUVsbjJ1bEFFWUUwSEtJU1JFVVZXb0FtZUhIRnJmRGZKS0JoQWc0RmsvVjlYMXd0dm9hdUtBcWx3K3czY3RyUVBwZGNtNGJ3Nm12TFNzMkN2dmlTNllRS082RDVZaWU2THhWdFc2Z1JzUG0xQ2NodDhDZUErTzJWeXdRc1VTQyt2WnhNVnBJMUxYYkMyV3Z2aUlVYk5nellhYk4wY2RrL0dTeXhNeXR6WlhkR0xRTXBodWc4K1VRWDk1YzRLODBmclptZnJMWjRwRlJzODRMSEpPNnEvQzJvUzUzdlo5Mk1VVFVnbzhwR2IvaHV0UGFOTlNsNHFSbDVuQzRocnRlS0VscEpYZFA1Y1BVckM2aFhRaGNYYS82TVI2bE15a2hRWWRhblBxN1ErQ3RyUkIzZnFzWVZkNTMxcklTKzRVZXdwRUxMN2VpckxuUko5akJrMWZ6ZVJ5S0t3UktjUTlndDlOQ1JrVkVUa3dyTVJHWnFsTjU2MzNsN1ovV25QK3JTbXNKcG9VUU1ndGNBYkFtNzl2NGw1ZVBnY2I1RmlCdVArWFM5b3o0SHVtd0xCV3hxR2ttTmFGa2JwbldGNTNCQ3h2STh3WU9GUnJMSFBZenplMG93TmJFUEtIQzBuenpxVEpKbDFHeWRrcmxwVy9Lck1NWFJTMG5wcFlBQ1RUQkVWK1A5b3RrNWI4UzRLc0FnblpCcS9MOWJJVGNVbjQrL3dHMU84MTlWR2laUmNBblBtYWlOUHUwYXJIbXJFV1hBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMzQ1YWY3MjM4Njc5NDg0MzhiOTIiLCJleHAiOjE3MTkyODI5NDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.wRaIk07gq21c7VDLuj7infIuJKqjfDpoQbRRGRcBY-c");
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
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
