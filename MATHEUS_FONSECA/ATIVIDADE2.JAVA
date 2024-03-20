import java.util.Scanner;

public class CalculadoraPlantas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        
        do {
          
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cálculo de Preço Total");
            System.out.println("2 - Cálculo de Troco");
            System.out.println("0 - Sair");

            
            opcao = scanner.nextInt();

            
            switch (opcao) {
                case 1:
                    calcularPrecoTotal();
                    break;
                case 2:
                    calcularTroco();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void calcularPrecoTotal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de plantas vendidas:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço unitário da planta:");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;

        System.out.println("O preço total é: " + precoTotal);

        scanner.close();
    }

    private static void calcularTroco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor pago pelo cliente:");
        double valorPago = scanner.nextDouble();

        System.out.println("Digite o preço total da venda:");
        double precoTotal = scanner.nextDouble();

        double troco = valorPago - precoTotal;

        System.out.println("O troco a ser dado ao cliente é: " + troco);

        scanner.close();
    }
}
