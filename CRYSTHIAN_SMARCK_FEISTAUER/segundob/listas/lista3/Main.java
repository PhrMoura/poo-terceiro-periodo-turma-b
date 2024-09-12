package listas.lista3;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        olaMundo();
        boasVindas();
        confirmar();
        lista();
        mensagemErro();
        calculadora();
        }
    
        //ATV1
        public static  void olaMundo(){
            JOptionPane.showMessageDialog(null,
                     "Olá mundo.");
        }
    
        //ATV2
        public  static void boasVindas(){
            String nome = JOptionPane.showInputDialog("Insira o nome");
            JOptionPane.showMessageDialog(null, "Boas vindas: " + nome);
        }
    
        //ATV3
        public static void confirmar(){
            int input = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if(input == YES_OPTION){
                JOptionPane.showMessageDialog(null, "Você escolheu: Sim");
            } else if (input == NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Você escolheu: Não");
            }else{
                JOptionPane.showMessageDialog(null, "Você escolheu: Cancelar");
            }
        }
    
        //ATV4
        public static void lista(){
            String [] opcao = {"Opção 1", "opção 2", "Opção 3"};
    
            int input = JOptionPane.showOptionDialog(null, "escolha apenas uma opção",
                    "Seleção de opção", DEFAULT_OPTION, INFORMATION_MESSAGE, null, opcao, opcao[0]);
            if (input >= 0 && input < opcao.length){
                JOptionPane.showMessageDialog(null, "Você escolheu a opção: " + opcao[input]);
            }else {
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada");
            }
        }
    
        //ATV5
        public  static void mensagemErro(){
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto!", "Exceção", ERROR_MESSAGE);
        }
    
        //ATV6
        public static void calculadora(){
        String[] opcao = {"Adição", "Subtração", "Divisão", "Multiplicação"};
    
        int input = JOptionPane.showOptionDialog(null, "Escolha uma opção", " Seleção de opção",
                DEFAULT_OPTION, INFORMATION_MESSAGE, null, opcao, opcao[0]);
    
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo número"));
    if(input >= 0 && input < opcao.length) {
        int entrada = input + 1;
        double resultado = 0;
    
        switch (entrada) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 / numero2;
                break;
            case 4:
                resultado = numero1 * numero2;
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "Resultado da " + opcao[input] + ": " + resultado);
    }else {
        JOptionPane.showMessageDialog(null, "Nenhuma opção escolhida");
    }
        }
}

