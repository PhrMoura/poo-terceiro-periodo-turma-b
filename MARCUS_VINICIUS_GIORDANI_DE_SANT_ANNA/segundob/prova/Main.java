package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String[] options = { "Listar Alunos", "Criar registro de testemunho", "Sair" };
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                listarAlunos();
            } else if (choice == 1){
                criarRegistro();
            } else if (choice == 2){
                break;
            } else {
                break;
            }
        }
    }

    public static void listarAlunos() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String responseString = response.toString();
            
            JOptionPane.showMessageDialog(null, responseString, "Listagem de Alunos", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void criarRegistro() {
        String urlFoto = JOptionPane.showInputDialog("Digite o URL da sua foto:");
        String textoTestemunho = JOptionPane.showInputDialog("Digite seu texto de testemunho:");
        String raAluno = JOptionPane.showInputDialog("Digite o RA do aluno:");
        if (urlFoto != null && !urlFoto.isEmpty() && textoTestemunho != null && !textoTestemunho.isEmpty() && raAluno != null && !raAluno.isEmpty()) {
            try {
                URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setDoOutput(true);

                String json = "{\r\n" + //
                                        "  \"imageUrl\": \"" + urlFoto + "\",\r\n" + //
                                        "  \"description\": \"" + textoTestemunho + "\",\r\n" + //
                                        "  \"ra\": \"" + raAluno + "\"\r\n" + //
                                        "}";

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

                JOptionPane.showMessageDialog(null, response.toString(), "Testemunho",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao criar testemunho.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
