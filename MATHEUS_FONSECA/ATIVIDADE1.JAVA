import java.util.Scanner;

public class CalculadoraPlantas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
           
            System.out.println("=== Calculadora de Vendas de Plantas ===");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Sair");

          
            System.out.print("Escolha uma opção: ");
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
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

      
        scanner.close();
    }

    
    private static void calcularPrecoTotal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Calcular Preço Total ===");

        System.out.print("Digite a quantidade de plantas vendidas: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

       
        double precoTotal = quantidade * precoUnitario;

       
        System.out.println("O preço total é: " + precoTotal + "\n");

       
        scanner.close();
    }

    
    private static void calcularTroco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Calcular Troco ===");

        System.out.print("Digite o valor pago pelo cliente: ");
        double valorPago = scanner.nextDouble();

        System.out.print("Digite o preço total da venda: ");
        double precoTotal = scanner.nextDouble();

       
        double troco = valorPago - precoTotal;

      
        System.out.println("O troco a ser dado ao cliente é: " + troco + "\n");

     
        scanner.close();
    }
}
