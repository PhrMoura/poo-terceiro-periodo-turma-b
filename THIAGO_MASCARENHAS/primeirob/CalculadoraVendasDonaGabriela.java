    
     import java.util.Scanner;

public class CalculadoraVendasDonaGabriela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de plantas vendida: ");
                    int quantidade = input.nextInt();
                    System.out.print("Digite o preço unitário da planta: ");
                    double precoUnitario = input.nextDouble();
                    System.out.println("O preço total da venda é: " + calcularPrecoTotal(quantidade, precoUnitario));
                    break;
                case 2:
                    System.out.print("Digite o valor recebido pelo cliente: ");
                    double valorRecebido = input.nextDouble();
                    System.out.print("Digite o valor total da compra: ");
                    double valorTotalCompra = input.nextDouble();
                    System.out.println("O troco a ser dado ao cliente é: " + calcularTroco(valorRecebido, valorTotalCompra));
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 3);
        input.close();
    }
    public static double calcularPrecoTotal(int quantidade, double precoUnitario) {
        return quantidade * precoUnitario;
    }

    public static double calcularTroco(double valorRecebido, double valorTotalCompra) {
        return valorRecebido - valorTotalCompra;
    }
}