package ProvaSegundoB;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        TestimonialService testimonialService = new TestimonialService();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Listagem dos alunos");
            System.out.println("2. Criar registro de testemunho");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    try {
                        List<Student> students = studentService.getStudents();
                        System.out.println("Lista de Alunos:");
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    } catch (Exception e) {
                        System.err.println("Erro ao listar alunos: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        Testimonial testimonial = new Testimonial();
                        System.out.print("Informe a URL da foto: ");
                        testimonial.setPhotoUrl(scanner.nextLine());
                        System.out.print("Informe o RA do aluno: ");
                        testimonial.setStudentRa(scanner.nextLine());
                        System.out.print("Informe o texto do testemunho: ");
                        testimonial.setText(scanner.nextLine());
                        testimonialService.createTestimonial(testimonial);
                        System.out.println("Testemunho criado com sucesso!");
                    } catch (Exception e) {
                        System.err.println("Erro ao criar testemunho: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
