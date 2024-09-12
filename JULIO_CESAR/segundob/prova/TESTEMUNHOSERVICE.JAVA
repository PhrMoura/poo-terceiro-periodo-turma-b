import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestemunhoService {
    private static final String API_URL = "https://avatars.githubusercontent.com/u/162383724?v=4&size=64"; 

    public boolean criarTestemunho(Testemunho testemunho) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

           
            String jsonInputString = "{"
                    + "\"urlFoto\": \"" + testemunho.getUrlFoto() + "\","
                    + "\"raAluno\": \"" + testemunho.getRaAluno() + "\","
                    + "\"texto\": \"" + testemunho.getTexto() + "\""
                    + "}";

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Testemunho criado com sucesso!");
                return true;
            } else {
                throw new IOException("Erro na comunicação com a API. Código de resposta: " + responseCode);
            }
        } catch (IOException e) {
            System.err.println("Erro ao criar testemunho: " + e.getMessage());
            return false;
        }
    }
}