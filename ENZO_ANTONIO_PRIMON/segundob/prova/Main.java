package ENZO_ANTONIO_PRIMON.segundob.prova;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prova uau");
        int opção = 0;

        while (opção != 3) {

            opção = Integer.parseInt(JOptionPane.showInputDialog(frame,
            "Escolha uma das seguintes opçoes \n" +
            "[1] Listagem de alunos \n" +
            "[2] Testemunho ebaa \n" +
            "[3] Sair",
            JOptionPane.QUESTION_MESSAGE));

            switch (opção) {
                case 1:
                    try {
                        StudentsRequest.Students();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(frame, 
                    "Erro ao buscar alunos", 
                    "Erro", 
                    JOptionPane.WARNING_MESSAGE);
                        e.printStackTrace();
                    }
                    break;

                case 2:
                String imgUrl = JOptionPane.showInputDialog(frame, 
                "Passa o link da imagem: ",
                "Imagem",
                JOptionPane.QUESTION_MESSAGE);

                String description = JOptionPane.showInputDialog(frame, 
                "Qual o seu testemunho?: ",
                "Testemunhos",
                JOptionPane.QUESTION_MESSAGE);

                String ra = JOptionPane.showInputDialog(frame, 
                "Informe sua ra: ",
                "RA",
                JOptionPane.QUESTION_MESSAGE);
                try {
                    TestimonialsConsulta.getJsonTestimonials(imgUrl, description, ra);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(frame, 
                    "Erro ao postar testemunho", 
                    "Erro", 
                    JOptionPane.WARNING_MESSAGE);
                    e.printStackTrace();
                }
                    break;
                case 3:
                JOptionPane.showMessageDialog(frame, "Saindo", "Tchauu", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                    break;
                default:
                System.out.println("Opção inválida");
                    break;
            }

        }
        
    }
}
