package segundob.Listas;

import java.util.List;

import javax.swing.JOptionPane;

public class ListaTres {
    
    public static void main(String[] args) {
        
        //Atividae Ⅰ

        JOptionPane.showMessageDialog(null, "Só salvin mundo 🔥", "(*✧×✧*)", JOptionPane.INFORMATION_MESSAGE);

        //Atividade Ⅱ

        JOptionPane.showInputDialog(null, "Qual teu vulgo smdd?", "＞.＜", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Ai sim bpns", "UwU", JOptionPane.INFORMATION_MESSAGE);

        //ATIVIDADE Ⅲ

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar ou vai arregar?", 
                                                    "E ai vai arregar?", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ai sim vambora 😈", "boa escolha ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Oloco dog 😣", "Achei paia", JOptionPane.ERROR_MESSAGE);
        }

        //ATIVIDADE Ⅳ

        List<String> opcoes = List.of("Masculino", "Feminino", "Helicoptero");
        
        String opcaoEscolhida = (String) JOptionPane.showInputDialog(
            null,
            "Qual seu sexo??",
            "Qual?",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes.toArray(),
            opcoes.toArray()[0]
        );

        JOptionPane.showMessageDialog(null, "Seu sexo é: " + opcaoEscolhida);
        
        //ATIVIDADE Ⅴ
        
        if (opcaoEscolhida.equals("Helicoptero")) {
            throw new CustomException("Q ISSO DOG ISSO NAO É UM SEXO NAO O.O");
        }

        //ATIVIDADE Ⅵ

        List<String> opcaoCalculadora = List.of("+", "-", "*", "/");

        String calculoMatematico = (String)  JOptionPane.showInputDialog(
            null,
            "Faz uma conta ai smdd",
            "Calculadora",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcaoCalculadora.toArray(),
            opcaoCalculadora.toArray()[0]
        );

        double numUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        double numDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));

        double resultado = 0;
        String operacao = "";

        switch (calculoMatematico) {
            case "+":
                resultado = numUm + numDois;
                break;
            case "-":
                resultado = numUm - numDois;
                break;
            case "*":
                resultado = numUm * numDois;
                break;
            case "/":
                if (numDois == 0) {
                    throw new CustomException("Proibido divisao por zero");
                }
                resultado = numUm / numDois;
                break;
            default:
                JOptionPane.showMessageDialog(null, "opcao invalida smdd");
                break;
        }

        JOptionPane.showMessageDialog(null,
        "O resultado da conta: " + operacao + " é: " + resultado,
        "Resultado da conta xD",
        JOptionPane.INFORMATION_MESSAGE);
    }
}