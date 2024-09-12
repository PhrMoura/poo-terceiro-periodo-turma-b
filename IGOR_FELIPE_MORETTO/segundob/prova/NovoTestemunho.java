package IGOR_FELIPE_MORETTO.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class NovoTestemunho{
    
     public static String testemunho() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            JOptionPane.showMessageDialog(null, "A opção escolhida foi Criar Novo Testemunho", "Escolha", JOptionPane.INFORMATION_MESSAGE);
            String imagem = JOptionPane.showInputDialog(null, "Informe a URL da imagem: ");
            String novoTest = JOptionPane.showInputDialog(null, "Informe o novo testemunho: ");
            String infoRA = JOptionPane.showInputDialog(null, "Informe seu RA: ");
            JOptionPane.showMessageDialog(null, "Sucesso meu querido", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            // Dados do json
            String json = "{\r\n" + //
                                "  \"imageUrl\": \"" + imagem + "\",\r\n" + //
                                "  \"description\":  \"" + novoTest + "\",\n" + //
                                "  \"ra\": \"" + infoRA + "\"\r\n" + //
                                "}";

            // Dados da Headers da nossa request & configs
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
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
            JOptionPane.showMessageDialog(null, e, "DEU ERRO PIAZÃO", 0);
            return null;
        }
    }
}
