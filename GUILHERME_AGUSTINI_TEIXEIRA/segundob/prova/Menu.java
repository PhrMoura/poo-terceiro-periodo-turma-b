package ProvaSegundaChamada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        

        JFrame menuPet = new JFrame();
        String opcao = JOptionPane.showInputDialog(menuPet, "Selecione uma opção: \n[1] Lista de pets" + " \n [2] Adicionar pet \n [3] Sair" , "Selecione a opção", JOptionPane.QUESTION_MESSAGE );

        JOptionPane.showMessageDialog(menuPet, "usuário selecionou a opção: " + opcao);
        
            switch (opcao) {
                case "1": 
                System.out.println(listaPet());
                    
                    break;
            
                case "2":
                System.out.println(petData());
                JOptionPane.showInputDialog(menuPet, "informe \n id do pet \n" + "nome do pet \n" + "url de sua foto \n" + "descrição do pet \n", JOptionPane.QUESTION_MESSAGE );
                JOptionPane.showMessageDialog(menuPet, "Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3":
                    JOptionPane.showMessageDialog(menuPet, "Saindo", "Aviso", JOptionPane.WARNING_MESSAGE);
                    break;
                
                case "4":
                    JOptionPane.showMessageDialog(menuPet, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        
    }
         public static String petData() {
        

            try {
            URL url = new URL("https://poo-exam.vercel.app/api/messages");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Dados do json
            String jsonMsg= "{\r\n" + //
                                "  \"id\": \"1\",\r\n" + //
                                "  \"description\": \"Meu cachorro Bidu é meu melhor amigo\",\r\n" + //
                                "  \"name\": \"Bidu\",\r\n" + //
                                "  \"imageUrl\": \"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAjckOBgFs39Ih8BX0TYql2HnIYQ3at9DeEw&s\"\r\n" + //
                                "}";

            // Dados da Headers da nossa request & configs
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            

            // Escrevendo JSON na request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonMsg.getBytes(StandardCharsets.UTF_8);
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

            return null;
        }
    }
        public static String listaPet(){

                try {
                    URL url = new URL("https://poo-exam.vercel.app/api/pets");
        
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

                // String com nosso Json
                return response.toString();

            } catch (Exception e) {
                e.printStackTrace();

                return null;
            }

        }
    


    
    
}
