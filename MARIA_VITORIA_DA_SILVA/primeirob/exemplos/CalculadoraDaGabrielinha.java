package primeirob.exemplos;

import java.util.Scanner;

public class CalculadoraDaGabrielinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Olá Gabrielinha! O que você deseja fazer?");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Fechar sistema");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(entrada);
                    break;
                case 2:
                    calcularTroco(entrada);
                    break;
                case 3:
                    System.out.println("Até a próxima!\nEncerrando sitema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        entrada.close();
    }

    public static void calcularPrecoTotal(Scanner entrada) {
        System.out.print("Digite a quantidade da planta: ");
        int quantidade = entrada.nextInt();
        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = entrada.nextDouble();
        double total = quantidade * precoUnitario;
        System.out.println("Preço total: " + total);
    }

    public static void calcularTroco(Scanner entrada) {
        System.out.print("Digite o valor recebido pelo cliente: ");
        double valorRecebido = entrada.nextDouble();
        System.out.print("Digite o valor total da compra: ");
        double valorCompra = entrada.nextDouble();
        double troco = valorRecebido - valorCompra;
        System.out.println("Troco: " + troco);
    }
}