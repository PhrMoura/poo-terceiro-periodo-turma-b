import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alunoservice {
    private static final String API_URL = "https://avatars.githubusercontent.com/u/162383724?v=4&size=64"; 

    public List<Aluno> listarAlunos() {
        List<Aluno> alunos = new ArrayList<>();

        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(connection.getInputStream());
                StringBuilder response = new StringBuilder();

                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }
                scanner.close();

           

               
                alunos.add(new Aluno("Irineu", "12345"));
                alunos.add(new Aluno("Lula da picanha", "67890"));
            } else {
                throw new IOException("Erro na comunicação com a API. Código de resposta: " + responseCode);
            }
        } catch (IOException e) {
            System.err.println("Erro ao listar alunos: " + e.getMessage());
            return null; 
        }

        return alunos;
    }
}
