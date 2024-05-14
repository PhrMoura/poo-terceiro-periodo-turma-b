import java.util.Scanner;

public class DonaGaby {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    calcularPrecoTotal();
                    break;

                case 2:
                    calcularTroco();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void exibirMenu() {

        System.out.println("Menu:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Sair");
        System.out.print("Escolha uma opção: ");

    }

    public static void calcularPrecoTotal() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade da planta vendida: ");

        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço unitário da planta: ");

        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;
        System.out.println("O preço total é: R$ " + precoTotal);

    }

    public static void calcularTroco() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: R$ ");

        double valorCompra = scanner.nextDouble();
        System.out.print("Digite o valor recebido pelo cliente: R$ ");

        double valorRecebido = scanner.nextDouble();

        double troco = valorRecebido - valorCompra;

        if (troco >= 0) {

            System.out.println("O troco a ser dado ao cliente é: R$ " + troco);

        } else {

            System.out.println("O valor recebido é insuficiente. Por favor, insira um valor válido.");

        }
    }
}
