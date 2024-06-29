package PEDRO_HENRIQUE.segundob.prova;

import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void display() {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Listagem dos alunos");
            System.out.println("2. Criar registro de testemunho");
            System.out.println("3. Sair");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    listStudents();
                    break;
                case "2":
                    createTestimonial();
                    break;
                case "3":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void listStudents() {
        try {
            URL url = new URL("https://poo-exam.vercel.app/api/students");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                Modal.showError("Falha na comunicação com a API");
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();

            
            String jsonString = response.toString();
            jsonString = jsonString.substring(1, jsonString.length() - 1); // Remove brackets
            String[] students = jsonString.split("\\},\\{");
            for (String student : students) {
                student = student.replace("{", "").replace("}", "").replace("\"", "");
                String[] fields = student.split(",");
                String name = fields[0].split(":")[1];
                String ra = fields[1].split(":")[1];
                System.out.println("Aluno: " + name + ", RA: " + ra);
            }

        } catch (Exception e) {
            Modal.showError("Erro ao listar alunos: " + e.getMessage());
        }
    }

    private void createTestimonial() {
        try {
            System.out.println("Informe a URL da sua foto:");
            String photoUrl = scanner.nextLine();
            System.out.println("Informe seu RA:");
            String ra = scanner.nextLine();
            System.out.println("Informe o texto do testemunho:");
            String testimonialText = scanner.nextLine();

            String testimonial = "{\"photo\":\"" + photoUrl + "\",\"ra\":\"" + ra + "\",\"text\":\"" + testimonialText + "\"}";

            URL url = new URL("https://poo-exam.vercel.app/api/testimonial");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            OutputStream os = conn.getOutputStream();
            os.write(testimonial.getBytes());
            os.flush();
            os.close();

            if (conn.getResponseCode() != 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader((conn.getErrorStream())));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                br.close();
                Modal.showError("Falha na comunicação com a API: " + response.toString());
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();

            Modal.showMessage("Testemunho criado com sucesso: " + response.toString());
        } catch (Exception e) {
            Modal.showError("Erro ao criar testemunho: " + e.getMessage());
        }
    }
}
