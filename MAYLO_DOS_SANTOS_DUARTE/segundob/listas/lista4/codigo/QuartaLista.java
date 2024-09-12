package segundob.listas.lista4.codigo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuartaLista {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Quarta Lista");
        int escolha = 0;

        do {

            escolha = Integer.parseInt(JOptionPane.showInputDialog(frame,
            "Bem vindo \n" +
            "[1] - Listar Convênios para pagamentos\n" +
            "[2] - Consultar Boleto\n" +
            "[3] - Sair",
            "Selecione uma opção: ",
            JOptionPane.QUESTION_MESSAGE
            ));

            switch (escolha) {
                case 1:
                    try {
                        HttpRequestConvenios.convenios();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    String number = JOptionPane.showInputDialog(frame, 
                    "Informe o número do boleto: ",
                    "Consulta Boletos",
                    JOptionPane.QUESTION_MESSAGE);
    
                    try {
                        HttpRequestBoleto.boleto(number);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
               
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
