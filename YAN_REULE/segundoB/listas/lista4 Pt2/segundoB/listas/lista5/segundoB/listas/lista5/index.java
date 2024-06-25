import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Consultas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JButton listConveniosButton = new JButton("Listar convênios de pagamento");
        JButton consultaBoletoButton = new JButton("Consulta de boleto");

        listConveniosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jsonResponse = pegaJson("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions"); // Altere para a URL real
                if (jsonResponse != null) {
                    JOptionPane.showMessageDialog(frame, jsonResponse, "Convênios de Pagamento",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Falha ao buscar convênios", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        consultaBoletoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String linhaDigitavel = JOptionPane.showInputDialog(frame, "Informe a linha digitável do boleto:");

                if (linhaDigitavel != null && !linhaDigitavel.isEmpty()) {
                    String jsonResponse = consultaBoleto(linhaDigitavel); // Altere para a URL real e o método correto
                    
                    if (jsonResponse != null) {
                        JOptionPane.showMessageDialog(frame, jsonResponse, "Consulta de Boleto",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Falha ao consultar boleto", "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Linha digitável inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(listConveniosButton);
        panel.add(consultaBoletoButton);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    public static String pegaJson(String urlString) {
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

    public static String consultaBoleto(String linhaDigitavel) {
        try {
            URL url = new URL(linhaDigitavel);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader( new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while((line = reader.readLine())!= null){
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            System.out.println(response.toString());


            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
       
    }

}
