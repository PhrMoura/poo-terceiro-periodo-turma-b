package segundoB.listas.lista3;

import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class lista3 {
    public static void main(String[] args) {
        
        atvd1();

        atvd2();

        atvd3();

        atvd4();

        atvd6();
    }

    public static void atvd1() {
        JOptionPane.showMessageDialog(null, "Hello World");
    }

    public static void atvd2() {
        String nome = JOptionPane.showInputDialog(null, "Nome");
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome(nome);

        System.out.println(pessoa1.nome);

        JOptionPane.showMessageDialog(null, "Bem Vindo(a), " + nome);
    }

    public static void atvd3(){
        int confirm = JOptionPane.showConfirmDialog(null, "Beleza?", null, 0);
        System.out.println(confirm);
        if (confirm == 0) {
            JOptionPane.showMessageDialog(null, "Beleza :)", null, confirm);
        } else {
            JOptionPane.showMessageDialog(null, "Não ta beleza :(", null, confirm);
        }
    }

    public static void atvd4() {
        String[] options = {"Opção 1", "Opção 2", "Opção 3"};

        int choice = JOptionPane.showOptionDialog(null, 
        "Escolha uma opção", 
        "teste", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.INFORMATION_MESSAGE,
        null, 
        options, 
        options[0]);

        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(null, "Escolheu opção 1", null, choice);
                break;
            
            case 1:
                JOptionPane.showMessageDialog(null, "Escolheu opção 2", null, choice);
            break;

            case 2:
                JOptionPane.showMessageDialog(null, "Escolheu opção 3", null, choice);
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Erro", null, choice);
                break;
        }
    }

    public static void atvd6() {
        String n1 = JOptionPane.showInputDialog(null, "Insira o primeiro número:");
        String n2 = JOptionPane.showInputDialog(null, "Insira o segundo número:");
    
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
    
        String[] options = {"+", "-", "*", "/"};
    
        int choice = JOptionPane.showOptionDialog(null, 
        "Escolha a operação", 
        "Calculadora", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.INFORMATION_MESSAGE,
        null, 
        options, 
        options[0]);
    
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, (num1 + num2));
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, (num1 - num2));
        } else if (choice == 2) {
            JOptionPane.showMessageDialog(null, (num1 * num2));
        } else if (choice == 3) {
            if (num2 == 0) {
                try {
                    throw new Execao("Divisão por zero não é permitida.");
                } catch (Execao e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,(num1 / num2));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma operação foi selecionada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
