import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------");
        System.out.println("--- LOJA DA GABRIELINHA ---");
        System.out.println("---------------------------");

        System.out.println("");
        System.out.println("");

        System.out.println("SELECIONE UMA OPÇÃO:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco  ");
        System.out.println("[3] - Sair");

        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.print("OPÇÃO DESEJADA: ");

        int opcaoSelecionada = scanner.nextInt();

        System.out.println("");

        System.out.print("A OPÇÃO SELECIONADA FOI: ");

        switch (opcaoSelecionada) {
            case 1:
                calculaPrecoTotal(scanner);
                break;

            case 2:
                calculaTroco(scanner);
                break;

            case 3:
                System.out.println("Sair");

                break;

            default:
                break;
        }

        scanner.close();
    }

    public static void calculaPrecoTotal(Scanner scanner) {
        System.out.println("Calcular Preço Total \n \n");

        System.out.print("Informe a quantidade de plantas: ");
        int qtdePlanta = scanner.nextInt();

        System.out.print("Informe o valor de cada planta: ");
        double valorPlanta = scanner.nextDouble();

        System.out.println("");

        double valorTotalVenda = qtdePlanta * valorPlanta;

        System.out.println("Valor total da venda: " + valorTotalVenda);

        System.out.println("");
    }

    public static void calculaTroco(Scanner scanner) {
        System.out.println("Calcular Troco  \n \n");

        System.out.print("Informe o valor recebido pelo cliente: ");
        double valorRecebido = scanner.nextDouble();

        System.out.print("Informe o valor total da venda: ");
        double valorVenda = scanner.nextDouble();

        double valorTroco = valorRecebido - valorVenda;

        System.out.println("Valor a ser devolvido: " + valorTroco);

        System.out.println("");
    }
}
