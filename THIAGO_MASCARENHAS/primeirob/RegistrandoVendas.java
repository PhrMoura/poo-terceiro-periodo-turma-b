import java.util.Scanner;

public class RegistrandoVendas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        double[][] vendasPorDiaEMes = new double[31][12]; // Matriz criada 1para armazenar as vendas por dia e mês
        double valorTotalVendido = 0;
        double totalDescontos = 0;
        int quantidadeTotalVendida = 0;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registrar Venda");
            System.out.println("[4] - Buscar Quantidade de Vendas por Mês e Dia");
            System.out.println("[5] - Sair");

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
                System.out.print("Digite o valor total da compra: ");
                double valorTotalCompra = input.nextDouble();
                System.out.println("O troco a ser dado ao cliente é: " + calcularTroco(valorRecebido, valorTotalCompra));
                    break;
                case 3:
                System.out.println("Registro de Venda");
                System.out.println("Digite o dia da venda.");
                int dia = input.nextInt();
                System.out.println("Digite o mês da venda");
                int mes = input.nextInt();
                System.out.println("Quantidade Total Vendida: " + quantidadeTotalVendida);
                System.out.println("Valor Total Vendido: " + valorTotalVendido);
                System.out.println("Total de Descontos: " + totalDescontos);
                vendasPorDiaEMes[dia][mes] = valorTotalVendido;
                    break;
                case 4:
                    System.out.print("Digite o dia (1-31): ");
                    dia = input.nextInt();
                    System.out.print("Digite o mês (1-12): ");
                    mes = input.nextInt();
                    System.out.println("Quantidade de vendas para o dia " + dia + " do mês " + mes + ": " + vendasPorDiaEMes[dia][mes]);
                    break;
                case 5:
                    System.out.println("Venda finalizada. Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (opcao != 5);
        input.close();
    }
    
    public static double calcularPrecoTotal(int quantidade, double precoUnitario) {
        return quantidade * precoUnitario;
    }

    public static double calcularTroco(double valorRecebido, double valorTotalCompra) {
        return valorRecebido - valorTotalCompra;
    }
}