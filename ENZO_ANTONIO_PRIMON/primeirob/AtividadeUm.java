package primeirob;

import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        
        System.out.println("Calculadora da Dona Gabrielinha");
        System.out.println("Insira 1 para calcular o valor total da compra");
        System.out.println("Insira 2 para calcular o troco");
        System.out.println("Insira 3 para sair");

        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Insira o numero de produtos comprados");
                int produtos = leitor.nextInt();
                
                System.out.println("Insira o valor dos produtos");
                double valor = leitor.nextDouble();

                double valorTotal = produtos * valor;
                System.out.println("O valor total da compra é de: " + valorTotal + " reais");
                break;
            
            case 2:
                System.out.println("Insira o valor dado pelo cliente");
                double valorCliente = leitor.nextDouble();

                System.out.println("Insira o valor total dos produtos");
                double valorTotal2 = leitor.nextDouble();

                double troco = valorCliente - valorTotal2;

                System.out.println("O troco é de: " + troco + " reais");

                break; 
            
            case 3:
                System.out.println("Fechando a aplicação");
                break;
            default:
                break;
        }
            leitor.close();
    }
}
