package MAYLO_DOS_SANTOS_DUARTE.segundob.prova;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProvaMain {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Prova");

        String message = "[1] - Listar Alunos \n"
            .concat("[2] - Criar registro de testemunho\n")
            .concat("[3] - Sair \n");

        int escolha = 0;
        
        do {
            escolha = Integer.parseInt(JOptionPane.showInputDialog(frame,
                        message, 
                        "Escolha uma opção: ",
                        JOptionPane.QUESTION_MESSAGE
                        ));

            switch (escolha) {
                case 1:
                    JOptionPane.showMessageDialog(frame, HttpResquestLista.getJsonLista(), "Lista de Alunos", JOptionPane.DEFAULT_OPTION);
                    break;
                case 2:
                    String imageURL = JOptionPane.showInputDialog(frame,
                        "Insira o URL da imagem: ",
                        "Image", 
                        JOptionPane.QUESTION_MESSAGE);

                    String description = JOptionPane.showInputDialog(frame,
                        "Insira a descrição do testemunho: ",
                        "Testemunho", 
                        JOptionPane.QUESTION_MESSAGE);

                    String RA = JOptionPane.showInputDialog(frame, 
                        "Isira o seu RA:",
                        "RA",
                        JOptionPane.QUESTION_MESSAGE);
                    
                    RequestTestimonial.getTestimonial(imageURL, description, RA);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(frame, "Encerrando o sistema...", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(frame, "Opção Incorreta tente novamente...", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (escolha != 3);


    }
    
}
