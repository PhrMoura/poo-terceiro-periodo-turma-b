package listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class lista4 {

    private static final String ENDPOINT_INSTITUICOES = "https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions";
    private static final String ENDPOINT_PAGAMENTOS = "https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize";
    private static final String TOKEN_AUTENTICACAO = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiIwVXMxS3lCak9vdTkyeldlWVdqV2M3dVRVRDNCT2g4d2RuZ3JsWmRMUk9wazRrUUZXL0xBa1ZtZmVmcDl4d0hXanRTVFNLa0FqcEcwL3owQnMycHdOV3FuQ21UY2dJS01QWGdhY0dlay90bWd2Z3FQa0tFdlJyR2RpZmt2YmRtMk9GQXJHWUpFSDZLNmNHNWlmc1hHN2xkMVovSXJNaW1GQ0F6SGgrVGpzNUdrMG5sbU1NdkVTTVZTODFHOUpUcDdqdGZpaVEraHl1OHlsbUVhcERhOXNzekNWRkYrbHRUeHZObHliSzk5bnhZVzREUVZwZ0VueHQ3VEQwQXFJL2M3SU1iL0cvaTJiNy9qM0JrWUdqVWxTVWRyc1NTY281ME5WbUtIUDNzR0ZtWlVDZk1Xb3B0eGYvaWkvR2hxVFZjMVpoQWZRdG5lODdUc0RkcUtWaUIzelVrVCtVTitFREtjSDI1ZjVyaUJRZGRZbXFIdDNsM0VUbVBMRWkraDZpVmI3ZWMzcEFlNVh6SXNtVUkxSGQwYXpDTU1OVC81VjlvTmRMNWhCa1ZCSjJIMTg1N3VxcWExZ0NEY3k1ME1RVXFLUmNFWTF3YVY1ZnpxTDN0eXBQNlpmeUpTT0tLczJjMFJFaVRNNFlNK0hHNG1BSzY5NEs1TDZVeklXcFRsSG1EK0dnMzZtcTQ4a1E1UzQ0TjJHQVFhOThjY3ZCdk4yWUVNY3BiNytVZm1tS1g0K2YyaEtzc1NJSjFSbGkwc2kwaEMyTmdlSGdGdzhMTW9pL2lINkkyQXZnPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiZjc4ZjI0OGFjNDg5NGI4NmJmZGMiLCJleHAiOjE3MTkzMzI3NDcsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.eUtwOqkccJA9X3SIQbUXU0YgwDFa5YQKB8V-JOqM1xE";

    public static void main(String[] args) {
        try {
            int escolha = getEscolhaMenu();

            JFrame frameCarregando = criarCarregamentoJFrame();

            switch (escolha) {
                case 1:
                    new CarregarDados(frameCarregando, ENDPOINT_INSTITUICOES, "GET", null).execute();
                    break;
                case 2:
                    String linhaDigitavel = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
                    if (linhaDigitavel != null && !linhaDigitavel.trim().isEmpty()) {
                        String corpo = String.format("{\"barCode\": {\"type\": 0, \"digitable\": \"%s\"}}", linhaDigitavel.trim());
                        new CarregarDados(frameCarregando, ENDPOINT_PAGAMENTOS, "POST", corpo).execute();
                    } else {
                        JOptionPane.showMessageDialog(null, "Linha digitável inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getEscolhaMenu() {
        String[] opcoes = { "Consulta de Instituições", "Pagamento de Contas" };
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        return escolha + 1; // Retorna 1 para a primeira opção, 2 para a segunda
    }

    public static String chamarEndpoint(String endpoint, String metodo, String corpo) throws Exception {
        URL url = new URL(endpoint);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

        conexao.setRequestMethod(metodo);
        conexao.setRequestProperty("Content-Type", "application/json");
        conexao.setRequestProperty("Authorization", TOKEN_AUTENTICACAO);
        conexao.setDoOutput(true);

        if (corpo != null) {
            try (OutputStream os = conexao.getOutputStream()) {
                byte[] input = corpo.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
        }

        BufferedReader leitor = new BufferedReader(
                new InputStreamReader(conexao.getInputStream(), StandardCharsets.UTF_8));
        StringBuilder resposta = new StringBuilder();
        String linha;

        while ((linha = leitor.readLine()) != null) {
            resposta.append(linha.trim());
        }

        leitor.close();
        conexao.disconnect();

        return resposta.toString();
    }

    public static JFrame criarCarregamentoJFrame() {
        JFrame frameCarregando = new JFrame("Carregando...");
        JPanel painelCarregando = new JPanel(new BorderLayout());
        JLabel labelCarregando = new JLabel("Carregando, por favor aguarde...", JLabel.CENTER);
        painelCarregando.add(labelCarregando, BorderLayout.CENTER);
        painelCarregando.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frameCarregando.getContentPane().add(painelCarregando);
        frameCarregando.setSize(new Dimension(300, 150));
        frameCarregando.setLocationRelativeTo(null);
        frameCarregando.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        return frameCarregando;
    }

    public static void exibirResposta(String dadosResposta) {
        if (dadosResposta != null) {
            String dadosFormatados = formatarResposta(dadosResposta, 100);
            exibirNoJPanel(dadosFormatados);
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao obter dados da API", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String formatarResposta(String resposta, int maximoPorLinha) {
        StringBuilder respostaFormatada = new StringBuilder();
        int comprimento = resposta.length();
        for (int i = 0; i < comprimento; i += maximoPorLinha) {
            if (i + maximoPorLinha < comprimento) {
                respostaFormatada.append(resposta, i, i + maximoPorLinha).append("\n");
            } else {
                respostaFormatada.append(resposta.substring(i)).append("\n");
            }
        }
        return respostaFormatada.toString();
    }

    public static void exibirNoJPanel(String dadosFormatados) {
        JTextArea areaTexto = new JTextArea(dadosFormatados);
        areaTexto.setEditable(false);
        JScrollPane painelRolagem = new JScrollPane(areaTexto);
        painelRolagem.setPreferredSize(new Dimension(800, 600));
        JOptionPane.showMessageDialog(null, painelRolagem, "Resposta", JOptionPane.INFORMATION_MESSAGE);
    }

    static class CarregarDados extends SwingWorker<String, Void> {
        private JFrame frameCarregando;
        private String endpoint;
        private String metodo;
        private String corpo;

        public CarregarDados(JFrame frameCarregando, String endpoint, String metodo, String corpo) {
            this.frameCarregando = frameCarregando;
            this.endpoint = endpoint;
            this.metodo = metodo;
            this.corpo = corpo;
        }

        @Override
        protected void done() {
            frameCarregando.dispose();
            try {
                String resposta = get();
                exibirResposta(resposta);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao obter resposta da API", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        @Override
        protected String doInBackground() throws Exception {
            frameCarregando.setVisible(true);
            return chamarEndpoint(endpoint, metodo, corpo);
        }
    }
}
