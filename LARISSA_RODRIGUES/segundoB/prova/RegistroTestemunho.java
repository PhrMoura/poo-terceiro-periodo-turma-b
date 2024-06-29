package LARISSA_RODRIGUES.segundoB.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class RegistroTestemunho {
    
    public static void criarRegistro() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            String imagem = JOptionPane.showInputDialog("Insira o link da imagem:");
            String mensagem = JOptionPane.showInputDialog("Escreva sua mensagem:");
            String alunoRA = JOptionPane.showInputDialog("Insira seu RA:");

            String json = "{\r\n" + //
                                "  \"imageUrl\": \"" + imagem + "\",\r\n" + //
                                "    \"description\": \"" + mensagem + "\",\r\n" + //
                                "  \"ra\": \"" + alunoRA + "\"\r\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
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
            connection.disconnect();

            JOptionPane.showMessageDialog(null, "Registro realizado com sucesso.", "Registro", 1);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), null, 0);
            return;
        }
    }
}
