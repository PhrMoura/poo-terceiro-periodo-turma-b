package listaum;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Calculadora da Dona Gabrielinha\n");

        System.out.println("Quantidade de planta na compra:");
        float qtdPlanta = leitor.nextFloat();

        System.out.println("Valor da planta:");
        float valorPlanta = leitor.nextFloat();

        float valorTotal = qtdPlanta * valorPlanta;

        System.out.println("Valor recebido pelo cliente:");
        float valorCliente = leitor.nextFloat();

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\nMenu calculadora:");
            System.out.println("[1] - Calcular o preço total");
            System.out.println("[2] - Calcular o troco");
            System.out.println("[3] - Sair\n");

            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("O valor total da compra é: " + valorTotal);
            } else if (opcao == 2) {
                if (valorCliente >= valorTotal) {
                    float troco = valorCliente - valorTotal;
                    System.out.println("O troco é: " + troco);
                } else {
                    float falta = valorTotal - valorCliente;
                    System.out.println("O valor recebido pelo cliente é insuficiente, faltam R$" + falta);
                }
            } else if (opcao == 3) {
                System.out.println("Saindo da calculadora...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
        leitor.close();
    }
}