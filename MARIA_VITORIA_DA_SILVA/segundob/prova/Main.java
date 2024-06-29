package MARIA_VITORIA_DA_SILVA.segundob.prova;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Lista de Alunos", "Testimonial", "Sair"};
        int menu;
        do {
            menu = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção",
                "Menuzinho",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
            );

            switch (menu) {
                case 0:
                ListaAlunos.imprimiListaAlunos();
                    break;
                case 1:
                Testimonial.imprimiTestimonial();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Fechando Sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (menu != 2);
    }
}
