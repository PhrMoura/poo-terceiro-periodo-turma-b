import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1: Calcular preço total");
        System.out.println("2: Calcular troco");
        System.out.println("3: Sair");
        System.out.print("Escolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
    

        switch (opcao) {
            case 1:
                calcularValor(0);
                break;
            case 2:
                calcularTroco(0);
                break;
            case 3:
                sair();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida.");
        }
    }

    public static float calcularValor(float valorTotal) {

        System.out.println("Informe a quantidade a ser vendida: ");
        Scanner scanner = new Scanner(System.in);
        float quantidade = scanner.nextFloat();
        System.out.println("Agora informe o valor da planta:");
        float valor = scanner.nextFloat();

        valorTotal = valor * quantidade;

        System.out.println("O valor total da compra será de: R$ " + valorTotal);

        scanner.close();
        return valorTotal;
    }

    public static float calcularTroco(float valorTroco) {

        System.out.println("Informe o valor total:");
        Scanner scanner = new Scanner(System.in);
        float valorTotal = scanner.nextFloat();
        System.out.println("Agora informe o valor pago:");
        float valorPago = scanner.nextFloat();

        valorTroco = valorPago - valorTotal;

        while (valorTroco % 5 != 0) {
            valorTroco++;
        }

        System.out.println("Valor do troco a ser recebido: R$ " + valorTroco);

        scanner.close();
        return valorTroco;
    }

    public static void sair() {
        System.exit(0);
    }
}
