import javax.swing.JOptionPane;

public class lista3 {
    public static void main(String[] args) {
        atv1();
        System.out.println();
        atv2();
        System.out.println();
        atv3();
        System.err.println();
        atv4();
        System.err.println();


               //Atv5
        try {
            throw new CustomException("Ocorreu um erro adm não liberou baderna");
        } catch (CustomException e) {
        }

        atv6();
    
    }


               //Atv1
    public static void atv1() {
        JOptionPane.showMessageDialog(null, "AOOOOOO Mundão");
    }

               //Atv2
    public static void atv2() {

        String nome = JOptionPane.showInputDialog("Digite seu nome:");


        JOptionPane.showMessageDialog(null, "Opa " + nome + " seja bem vindo");
    }


               //Atv3
    public static void atv3() {
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar e tomar a red pill?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, "Você fez a escolha correta RECEBA O CONHENICEMTO");
        } else {

            JOptionPane.showMessageDialog(null, "Você fez a escolha errado seu beta BANIDO!");
        }
    }


               //Atv4
    public static void atv4() {

    String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        
    String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:", "Opções", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
    switch (escolha) {
        case "Opção 1":
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 1.");
            break;
        case "Opção 2":
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 2.");
            break;
        case "Opção 3":
            JOptionPane.showMessageDialog(null, "Você escolheu a Opção 3.");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Não pode essa não");
    }
}


               //Atv5
    public static class CustomException extends Exception {
    public CustomException(String mensagem) {
        super(mensagem);
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}


               //Atv6
    public static void atv6() {
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a operação:", "Calculadora", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (escolha != null) {
            double numero1 = solicitarNumero("Digite o primeiro número:");
            double numero2 = solicitarNumero("Digite o segundo número:");

            try {
                switch (escolha) {
                    case "Soma":
                        JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 + numero2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Subtração":
                        JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 - numero2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Multiplicação":
                        JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 * numero2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Divisão":
                        if (numero2 == 0) {
                            throw new CustomException("Não é possível dividir por zero.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 / numero2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                }
            } catch (CustomException e) {

                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static double solicitarNumero(String mensagem) {
        String input;
        double numero = 0;
        boolean valido = false;
        while (!valido) {
            input = JOptionPane.showInputDialog(mensagem);
            try {
                numero = Double.parseDouble(input);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        return numero;
    }
}
