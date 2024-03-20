import java.util.Scanner;

public class MelhoriasDonaGabriela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        int quantidadeTotalVendida = 0;
        double valorTotalVendido = 0;
        double totalDescontos = 0;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registrar Venda");
            System.out.println("[4] - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantas plantas foram vendidas ?: ");
                    int quantidade = input.nextInt();
                    System.out.print("Qual o valor unitário desta planta ?: ");
                    double precoUnitario = input.nextDouble();
                    double precoTotal = calcularPrecoTotal(quantidade, precoUnitario);
                    if (quantidade > 10) {
                        double desconto = precoTotal * 0.05;
                        precoTotal -= desconto;
                        totalDescontos += desconto;
                    }
                    quantidadeTotalVendida += quantidade;
                    valorTotalVendido += precoTotal;
                    System.out.println("Valor da venda: " + precoTotal);
                    break;
                case 2:
                    System.out.print("Digite o valor recebido pelo cliente: ");
                    double valorRecebido = input.nextDouble();
                    System.out.print("Valor da compra: ");
                    double valorTotalCompra = input.nextDouble();
                    System.out.println("O troco a ser dado ao cliente é: " + calcularTroco(valorRecebido, valorTotalCompra));
                    break;
                case 3:
                    System.out.println("Registro de Venda");
                    System.out.println("Quantidade Total Vendida: " + quantidadeTotalVendida);
                    System.out.println("Valor Total Vendido: " + valorTotalVendido);
                    System.out.println("Total de Descontos: " + totalDescontos);
                    break;
                case 4:
                    System.out.println("Venda finalizada. Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 4);
        input.close();
    }

    public static double calcularPrecoTotal(int quantidade, double precoUnitario) {
        return quantidade * precoUnitario;
    }

    public static double calcularTroco(double valorRecebido, double valorTotalCompra) {
        return valorRecebido - valorTotalCompra;
    }
}