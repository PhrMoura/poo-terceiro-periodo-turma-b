package segundob.listas.listaquatro.codigo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainLista4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Lista 4");
        int opção = 0;

        while (opção != 3) {

            opção = Integer.parseInt(JOptionPane.showInputDialog(frame,
            "Escolha uma das seguintes opções \n" +
            "[1] Listar convênios de pagamento \n" +
            "[2] Listar boletos \n" +
            "[3] Sair",
            JOptionPane.QUESTION_MESSAGE));

            switch (opção) {
                case 1:
                    try {
                        ConvenioRequest.convenio();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                String code = JOptionPane.showInputDialog(frame, 
                "Informe o código do boleto: ",
                "Consulta Boletos",
                JOptionPane.QUESTION_MESSAGE);
                try {
                    BoletoRequest.boleto(code);
                } catch (Exception e) {
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
