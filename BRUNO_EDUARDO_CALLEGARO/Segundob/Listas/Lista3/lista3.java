import javax.swing.JOptionPane;

public class lista3 {
       
    public static void main(String[] args) {
       
        //atividade 01
        showMessage("Olá, Mundo!");
 }
 public static void showMessage(String message) {
    JOptionPane.showMessageDialog(null, message);
}


        //Atividade 02
        public class WelcomeMessage {
            public static void main(String[] args) {
                String name = askName();
                showMessage("Bem-vindo, " + name + "!");
            }
       
            public static String askName() {
                return JOptionPane.showInputDialog("Qual é o seu nome?");
            }
       
            public static void showMessage(String message) {
                JOptionPane.showMessageDialog(null, message);
            }
        }


                   
       //Atividade 03


       public class ContinueOrNot {
        public static void main(String[] args) {
            int choice = askToContinue();
            showMessage(choice);
        }
   
        public static int askToContinue() {
            return JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        }
   
        public static void showMessage(int choice) {
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Continuando...");
            } else {
                JOptionPane.showMessageDialog(null, "Saindo...");
            }
        }
    }




          //Atividade 04


          public class OptionList {
            public static void main(String[] args) {
                String[] options = {"Opção 1", "Opção 2", "Opção 3"};
                int choice = presentOptions(options);
                showMessage(options[choice]);
            }
       
            public static int presentOptions(String[] options) {
                return JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            }
       
            public static void showMessage(String option) {
                JOptionPane.showMessageDialog(null, "Opção selecionada: " + option);
            }
        }










             
          //Atividade 05


          public class Atividade5 {
            public static void main(String[] args) {
                try {
                    verificarErro();
                } catch (MinhaExcecaoPersonalizada e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            public static void verificarErro() throws MinhaExcecaoPersonalizada {
                @SuppressWarnings("unused")
                boolean erroOcorrido = true;
            }
        }
       
        class MinhaExcecaoPersonalizada extends Exception {
            public MinhaExcecaoPersonalizada(String mensagem) {
                super(mensagem);
            }
        }






        //Atividade 06


        public class Atividade6 {
            public static void main(String[] args) throws lista3.minhaExcecaoPersonalizada, lista3.MinhaExcecaoPersonalizada {
                String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
                int escolha = JOptionPane.showOptionDialog(null, "Escolha uma operação:", "Calculadora",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);
       
                if (escolha >= 0 && escolha < operacoes.length) {
                    try {
                        String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
                        String num2 = JOptionPane.showInputDialog("Digite o segundo número:");
                        double numero1 = Double.parseDouble(num1);
                        double numero2 = Double.parseDouble(num2);
                        double resultado = 0;
       
                        switch (escolha) {
                            case 0:
                                resultado = numero1 + numero2;
                                break;
                            case 1:
                                resultado = numero1 - numero2;
                                break;
                            case 2:
                                resultado = numero1 * numero2;
                                break;
                            case 3:
                                if (numero2 == 0) {
                                }
                                resultado = numero1 / numero2;
                                break;
                        }
                        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma operação foi escolhida.");
                }
            }
           
           
    }


    public class minhaExcecaoPersonalizada extends Exception {
        public minhaExcecaoPersonalizada(String string) {
        }


        public void MinhaExcecaoPersonalizada(String mensagem) {
           
        }
    }


}
   



