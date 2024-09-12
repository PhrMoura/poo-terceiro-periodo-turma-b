package MICHEL_LIBERALI_SANTOS.segundob.prova;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AlunoService {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api";

    public static void listarAlunos() {
        String endpoint = BASE_URL + "{\r\n" + //
                        "  \"data\": [\r\n" + //
                        "    {\r\n" + //
                        "      \"name\": \"Michel liberali Santos\",\r\n" + //
                        "      \"ra\": \"11767\"\r\n" + //
                        "    }\r\n" + //
                        "  ]\r\n" + //
                        "}";

        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(conn.getInputStream());
                StringBuilder response = new StringBuilder();
                while (scanner.hasNextLine()) {
                    response.append(scanner.nextLine());
                }
                scanner.close();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao listar alunos: " + responseCode);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na comunicação com a API: " + e.getMessage());
        }
    }
}
