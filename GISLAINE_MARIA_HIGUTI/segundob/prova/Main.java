package GISLAINE_MARIA_HIGUTI.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] opcoes = {"Listagem de Alunos", "Criar Registro de Testemunho", "Sair"};
        int escolha;

        do {
            escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch (escolha) {
                case 0:
                    listarAlunos();
                    break;
                case 1:
                    criarTestemunho();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo da aplicação.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (escolha != 2);
    }

    private static void listarAlunos(){ 
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

            String formattedResponse = "<html>" + formatStringBuilder(response, 60) + "</html>";
            JOptionPane.showMessageDialog(null, formattedResponse);

        } catch (Exception e) {
            e.printStackTrace();

            return;
        }
    }

    public static String solicitarImagem() {
        return JOptionPane.showInputDialog("Insira a url da imagem!");
    }

    public static String solicitarDescricao() {
        return JOptionPane.showInputDialog("Insira a sua descrição!");
    }

    public static String solicitarRa() {
        return JOptionPane.showInputDialog("Insira o seu RA!");
    }

    public static void criarTestemunho(){
            try {
                URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
    
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                String imageUrl = solicitarImagem();
                String descricao = solicitarDescricao();
                String ra = solicitarRa();

                String json = "{\n" +
                            "  \"imageUrl\":\"" + imageUrl + "\",\n" +
                            "  \"description\":\"" + descricao + "\",\n" +
                            "  \"ra\":\"" + ra + "\"\n" +
                            "}";

                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/json");
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

                JOptionPane.showMessageDialog(null, "Testemunho Criado!");
    
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static String formatStringBuilder(StringBuilder sb, int lineLength) {
        StringBuilder result = new StringBuilder();

        int length = sb.length();
        for (int i = 0; i < length; i += lineLength) {
            if (i + lineLength < length) {
                result.append(sb.substring(i, i + lineLength)).append("<br>");
            } else {
                result.append(sb.substring(i));
            }
        }

        return result.toString();
    }
}