package GUILHERME_HARMATIUK_ARANTES.segundob.prova;

import java.awt.Color;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu {
    public static void main(String[] args) {
        String opcaoSelecionada = showFuncionalidadeMenu();

        URL url;
        HttpURLConnection connection;
        String response;
        try {
            switch (opcaoSelecionada) {
                case "Listagem dos Alunos":
                    url = new URL("https://poo-exam.vercel.app/api/students");  
                    connection = RequestMapper.createRequestSkeleton(url, "GET");
                    response = ResponseReader.readResponse(connection);  
                    showResponseDialog(response);
                    break;
                case "Criar registro de testemunho":
                    url = new URL("https://poo-exam.vercel.app/api/testimonial");
                    connection = RequestMapper.createRequestSkeleton(url, "POST");
                    RequestMapper.aditionalSettingsForPostRequest(connection);
                    response = ResponseReader.readResponse(connection);
                    // 11509 
                    // https://avatars.githubusercontent.com/u/146777128?s=400&v=4
                    break;
                case "Sair":
                default:
                    break;
            }
        } catch (Exception e) {
            showErrorDialog(e.getMessage());
        }
    }

    private static String showFuncionalidadeMenu() {
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        List<String> listaOpcoes = List.of(
            "Listagem dos Alunos", 
            "Criar registro de testemunho",
            "Sair"
        );  
        
        return (String) JOptionPane.showInputDialog(
            null, 
            "Escolha a função da aplicação que deseja utilizar.", 
            "Menu",
            JOptionPane.PLAIN_MESSAGE, 
            null,
            listaOpcoes.toArray(),
            null
        );
    }

    private static void showResponseDialog(String response) {
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        
        JLabel label = new JLabel(response);

        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);
    }

    private static void showErrorDialog(String errorMsg) {
        JFrame frame = new JFrame("Dialog de Erro");
        JOptionPane.showMessageDialog(
            frame, 
            "Houve um erro ao tentar realizar a função: " + errorMsg, 
            "Dialog de Erro", 
            JOptionPane.ERROR_MESSAGE
        );
    }

    public static String getUserInputAsJson() throws Exception {
        String imgUrl = openInputDialog("Digite a url da imagem que deseja utilizar", "URL DA IMAGEM");
        String description = openInputDialog("Digite a mensagem que irá usar na mensagem", "DESCRIÇÃO DA MENSAGEM");
        String ra = openInputDialog("Digite o RA que irá utilizar", "RA do Aluno");

        String json = "{";
        json += "\"imageUrl\": ";
        json += "\"" + imgUrl + "\", ";

        json += "\"description\": ";
        json += "\"" + description + "\", ";

        json += "\"ra\": ";
        json += "\"" + ra + "\" ";

        json += "}";

        System.out.println(json);
        
        // String json = 
            // "{ \"imageUrl\":\"" + imgUrl + 
            // "\",\"description\":\"" + description +  
            // "\",\"ra\":\"" + ra + "\"}";

        return json;
    } 

    public static String openInputDialog(String message, String title) throws Exception {
        JFrame frame = new JFrame();
        String input = JOptionPane.showInputDialog(
            frame, 
            message, 
            title, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (input == null) { throw new Exception("Valores nulos não são aceitos"); }
        return input;
    }
}
