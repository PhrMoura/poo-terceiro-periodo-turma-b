package segundob.listas.lista3;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends Exception{
    
    public static void main(String[] args) {

        //Att 1
        JFrame ola = new JFrame("Exemplo JOptionPane - ShowMassageDialog");

        JOptionPane.showMessageDialog(ola, "Olá, Mundo!", "DEMO", JOptionPane.INFORMATION_MESSAGE);

        //Att 2
        JFrame bemVindo = new JFrame("Exemplo JOptionPane - ShowInputDialog");

        String nome = JOptionPane.showInputDialog(bemVindo, "Qual seu nome?", "Identificação", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(bemVindo, "Seja bem vindo(a) " + nome);

        //Att 3
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Continue or No?", JOptionPane.YES_NO_OPTION);
    
            if (resposta == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Ebaa, você escolheu continuar!");
            }
            else if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Aff, você escolheu não continuar :(");
            }

        //Att 4

        JFrame opcao = new JFrame("Exemplo JOptionPane - ShowInputDialog SelectOne");
        List<String> melhorJogadorBra = List.of("Pelé", "Neymar", "Zico", "Romário", "Ronaldo Fenômeno", "Ronaldinho Gaúcho");

        String melhorJogador = (String) JOptionPane.showInputDialog(opcao, "Qual é o melhor jogador brasileiro?", "Melhor Jogador", JOptionPane.QUESTION_MESSAGE, null, melhorJogadorBra.toArray(), melhorJogadorBra.toArray()[0]);

        JOptionPane.showMessageDialog(opcao, "Muito bem, o melhor jogador brasileiro é o " + melhorJogador);

        //Att 5
        
        try {
            realizaOperação();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Errouuuu", JOptionPane.ERROR_MESSAGE);
        }

        //Att 6

        try {
            String[] operacoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
            int esc = JOptionPane.showOptionDialog(null, "Por favor, escolha a operação que deseja realizar", "Calculador Java", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

            String primeiro = JOptionPane.showInputDialog("Informe o primeiro número");
            String segundo = JOptionPane.showInputDialog("Informe o segundo número");

            double num1 = parseInput (primeiro);
            double num2 = parseInput (segundo);
            double resultado = realizaCalculo (esc, num1, num2);

            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Este número é inválido. Digite outro número, por favor.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Errouuuu", JOptionPane.ERROR_MESSAGE);
        } 
        System.exit(0);
    }    

    //Extensão da att 5
    public static void realizaOperação() throws Excecao {
        boolean erro = true;

        if (erro) {
            throw new Excecao("Vishh mano, deu erro hein.");
        }
        System.out.println("Agora foi mano!");
    }

    //Extensão da att 6
    private static double parseInput(String input) throws Excecao {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
        throw new Excecao("O número: " + input + " é inválido. Digite outro número, por favor.");
        }
    }

    private static double realizaCalculo(int esc, double num1, double num2) throws Excecao{
        switch (esc) {
        case 0:
            return num1 + num2;
        case 1:
            return num1 - num2;
        case 2:
            return num1 * num2;
        case 3:
            if (num2 == 0) {
                throw new Excecao("Divisão por zero não é permitida.");
            }
            return num1 / num2;
        default:
            throw new Excecao("Operação escolhida é inválida.");
        }
    }
}
