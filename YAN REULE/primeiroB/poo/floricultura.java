package poo;

import java.util.Scanner;

public class floricultura {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int opcao;

        System.out.println("Menu:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = entradaTeclado.nextInt();

        switch (opcao) {
            case 1:
                calcularPrecoTotal(entradaTeclado);
                break;
            case 2:
                calcularTroco(entradaTeclado);
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

    }

    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Digite a quantidade da planta vendida: ");
        int quantidade = scanner.nextInt();

        if (quantidade > 10) {
            System.out.print("Parabéns, compras acima de 10 quantidades ganham 5% de desconto!!");

            System.out.print("Digite o preço unitário da planta: ");
            double precoUnitario = scanner.nextDouble();

            double precoTotal = quantidade * precoUnitario;
            double desconto = 0.05;
            double valorComDesconto = precoTotal * desconto;

            System.out.println("O preço total com desconto é: " + valorComDesconto);
        } else if (quantidade < 10) {
            System.out.print("Digite o preço unitário da planta: ");
            double precoUnitario = scanner.nextDouble();

            double precoTotal = quantidade * precoUnitario;

            System.out.println("O preço total da venda é: " + precoTotal);
        }
    }

    public static void calcularTroco(Scanner scanner) {
        System.out.print("Digite o valor recebido pelo cliente: ");
        double valorRecebido = scanner.nextDouble();

        System.out.print("Digite o valor total da compra: ");
        double valorTotalCompra = scanner.nextDouble();

        double troco = valorRecebido - valorTotalCompra;

        if (troco >= 0) {
            System.out.println("O troco a ser dado ao cliente é: " + troco);
        } else {
            System.out.println("O valor recebido é insuficiente para cobrir o total da compra.");
        }
    }
}
