package GUSTAVO_SERAPIAO_ALMEIDA.segundoB.prova;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

public class Prova {
    private static final String STUDENTS_URL = "https://poo-exam.vercel.app/api/students";
    private static final String TESTIMONIAL_URL = "https://poo-exam.vercel.app/api/testimonial";

    public static void main(String[] args) {
        try {
            while (true) {
                int escolha = getEscolhaMenu();

                switch (escolha) {
                    case 0:
                        String studentsData = makeGetRequest(STUDENTS_URL);
                        if (studentsData != null) {
                            exibirNoJPanel(studentsData);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao buscar dados dos alunos.", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                        break;

                    case 1:
                        String imageUrl = "https://avatars.githubusercontent.com/u/150818232?v=4";
                        String description = "English or Spanish?";
                        String ra = "10725";

                        String result = createNewTestimonial(TESTIMONIAL_URL, imageUrl, description, ra);
                        if (result != null) {
                            JOptionPane.showMessageDialog(null, "Testemunho criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao criar testemunho.", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                        
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String createNewTestimonial(String urlString, String imageUrl, String description, String ra) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
    
            // Monta o JSON conforme especificado pela API
            String jsonInputString = String.format("{\"imageUrl\": \"%s\", \"description\": \"%s\", \"ra\": \"%s\"}", imageUrl, description, ra);
    
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
    
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_CREATED) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                StringBuilder response = new StringBuilder();
                String line;
    
                while ((line = reader.readLine()) != null) {
                    response.append(line.trim());
                }
    
                reader.close();
                connection.disconnect();
                return response.toString();
            } else {
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), "utf-8"));
                StringBuilder errorResponse = new StringBuilder();
                String errorLine;
    
                while ((errorLine = errorReader.readLine()) != null) {
                    errorResponse.append(errorLine.trim());
                }
    
                errorReader.close();
                connection.disconnect();
                throw new Exception("Erro na criação do testemunho: HTTP " + responseCode + ", " + errorResponse.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    

    public static String makeGetRequest(String urlString) {
        try {
            URL url = new URL(urlString);
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
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getEscolhaMenu() {
        String[] opcoes = {"Listagem dos alunos", "Criar Registro de Testemunho", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        return escolha; // Retorna 1 para a primeira opção, 2 para a segunda
    }

    public static void exibirNoJPanel(String dadosFormatados) {
        JTextArea areaTexto = new JTextArea(dadosFormatados);
        areaTexto.setEditable(false);
        JScrollPane painelRolagem = new JScrollPane(areaTexto);
        painelRolagem.setPreferredSize(new Dimension(800, 600));
        JOptionPane.showMessageDialog(null, painelRolagem, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }
}