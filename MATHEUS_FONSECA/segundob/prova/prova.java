import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    private static final String BASE_URL = "https://poo-exam.vercel.app/api/students'"; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Listar alunos");
            System.out.println("2 - Criar registro de testemunho");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    listarAlunos();
                    break;
                case 2:
                    criarTestemunho();
                    break;
                case 0:
                    System.out.println("Encerre o programa.");
                    return;
                default:
                    System.out.println("Opção não validada. Tente novamente.");
            }
        }
    }
 
    private static void listarAlunos() {
        try {
            URL url = new URL(BASE_URL + "/students");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Lista de alunos:");
            System.out.println(response.toString());

            connection.disconnect();
        } catch (IOException e) {
            System.err.println("Erro ao listar alunos: " + e.getMessage());
        }
    }

    private static void criarTestemunho() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu RA: ");
        String ra = scanner.nextLine();

        System.out.print("Digite seu testemunho: ");
        String testemunho = scanner.nextLine();

        try {
            URL url = new URL(BASE_URL + "/testimonial");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String requestBody = "ra=" + ra + "&testimony=" + testemunho;
            connection.getOutputStream().write(requestBody.getBytes());

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            System.out.println("Testemunho criado com sucesso.");
            System.out.println("Resposta da API: " + response.toString());

            connection.disconnect();
        } catch (IOException e) {
            System.err.println("Erro ao criar testemunho: " + e.getMessage());

            
        }
    }
}


            