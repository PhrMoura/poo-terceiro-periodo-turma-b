package FELIPE_EMANUEL_NEGRI.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class RegistroTestemunho {
    
    public static String criaRegistro() {

        try {
            
            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            String imagemUrl = JOptionPane.showInputDialog(null,
            "Insira a url da sua picture",
            "Mostra a cara",
            JOptionPane.INFORMATION_MESSAGE);

            String descricaoAula = JOptionPane.showInputDialog(null,
            "Me conte um pouco sobre POO",
            "GOSTOU?",
            JOptionPane.INFORMATION_MESSAGE);

            String raAluno = JOptionPane.showInputDialog(null,
            "Insira o seu RA (n sei oq é isso dog pprt!!)",
            "RA?",
            JOptionPane.INFORMATION_MESSAGE);

            String json = "{\r\n" + //
                                "  \"imageUrl\": \"" + imagemUrl + "\",\r\n" + //
                                "  \"description\": \"" + descricaoAula + "\",\r\n" + //
                                "  \"ra\": \"" + raAluno + "\"\r\n" + //
                                "}";

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-type", "application/json");
            connection.setDoOutput(true);   

            try (OutputStream os =connection.getOutputStream()) {
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
            throw new Erro("Algo deu errado ai dog smdd!!");
        }

    }


    public static String criandoRegistro() {

        JOptionPane.showMessageDialog(null,
        criaRegistro(),
        "Criar registro aparecer na telinha ne pai",
        JOptionPane.INFORMATION_MESSAGE);

        return null;
    }


}
