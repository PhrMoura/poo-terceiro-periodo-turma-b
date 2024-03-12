package primeirob;

import java.util.Scanner;

public class PrimeiraAtividade {

    public static void main(String[] args) {

        System.out.println("Selecione uma opção:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");

        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();
        
        switch(opcao) 
        {
            case 1:
                System.out.print("Insira a quantidade de plantas compradas: ");
                int quantidadePlantas = leitor.nextInt();
                System.out.print("Insira o valor das plantas: ");
                double valorPlantas = leitor.nextDouble();
                
                double valorTotal = (quantidadePlantas * valorPlantas);

                System.out.println("O valor total da compra é: " + valorTotal);
                break;

            case 2:
                System.out.print("Insira o valor do pagamento do cliente: ");
                double valorPagamento = leitor.nextDouble();
                System.out.print("Insira o valor total da compra: ");
                double valorTotalCompra = leitor.nextDouble();

                double troco = (valorPagamento - valorTotalCompra);

                System.out.println("O valor do troco do cliente: " + troco);
                break;

             case 3:
                System.out.println("Encerrando o sistema...");
                break;

            default:
                System.out.println("Opção inexistente, encerrando o sistema...");
                break;
        }
        leitor.close();
    }
}
