package MICHEL_LIBERALI_SANTOS.segundob.prova;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class TestemunhoService {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api";

    public static void criarTestemunho(String fotoUrl, String ra, String textoTestemunho) {
        String endpoint = BASE_URL + "{\r\n" + //
                        "  \"imageUrl\": \"https://avatars.githubusercontent.com/u/160680050?s=400&u=7f7f7df73389caf917426faf1179341926b39ae2&v=4\",\r\n" + //
                        "  \"description\": \"Nao aguento mais isso\",\r\n" + //
                        "  \"ra\": \"11767\"\r\n" + //
                        "}";

        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na comunicação com a API: " + e.getMessage());
        }
    }
}
