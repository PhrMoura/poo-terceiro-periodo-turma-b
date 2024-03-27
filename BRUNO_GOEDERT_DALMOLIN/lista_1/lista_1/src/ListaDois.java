import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDois {

    public static class Venda {
        int qtdePlantas;
        double valorTotal;
        double descontosTotal;

        public Venda(int qtdePlantas, double valorTotal, double descontosTotal) {
            this.qtdePlantas = qtdePlantas;
            this.valorTotal = valorTotal;
            this.descontosTotal = descontosTotal;
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcaoSelecionada = 0;

        System.out.println("---------------------------");
        System.out.println("--- LOJA DA GABRIELINHA ---");
        System.out.println("---------------------------");

        System.out.println("");
        System.out.println("");

        var lVendas = new ArrayList<Venda>();

        while (opcaoSelecionada != 5) {
            System.out.println("SELECIONE UMA OPÇÃO:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco  ");
            System.out.println("[3] - Registrar Venda ");
            System.out.println("[4] - Listar Vendas Registradas");
            System.out.println("[5] - Sair");

            System.out.println("");

            System.out.print("OPÇÃO DESEJADA: ");

            opcaoSelecionada = scanner.nextInt();

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
                    registrarVenda(scanner, lVendas);

                    break;

                case 4:
                    listarVendasRegistradas(lVendas);

                    break;
                case 5:
                    System.out.print("Sair. ");

                    break;
                default:
                    break;
            }
        }

        scanner.close();
    }

    public static void calculaPrecoTotal(Scanner scanner) {
        System.out.println("Calcular Preço Total. \n \n");

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
        System.out.println("Calcular Troco.  \n \n");

        System.out.print("Informe o valor recebido pelo cliente: ");
        double valorRecebido = scanner.nextDouble();

        System.out.print("Informe o valor total da venda: ");
        double valorVenda = scanner.nextDouble();

        double valorTroco = valorRecebido - valorVenda;

        System.out.println("Valor a ser devolvido: " + valorTroco);

        System.out.println("");
    }

    public static void listarVendasRegistradas(List<Venda> lVendas) {

        System.out.println("Listar Venda Registrada.  \n \n");

        System.out.println("Total de Vendas: " + lVendas.size() + ".");

        for (Venda venda : lVendas) {
            System.out.println("Valor Venda: R$ " + venda.valorTotal + " Desconto Total: " + venda.descontosTotal
                    + " Qtde Plantas: " + venda.qtdePlantas);
        }

        System.out.println("");
    }

    public static void registrarVenda(Scanner scanner, List<Venda> lVendas) {
        System.out.println("Registrar Venda. \n \n");

        System.out.print("Informe a quantidade de plantas: ");
        int qtdePlanta = scanner.nextInt();

        System.out.print("Informe o valor de cada planta: ");
        double valorPlanta = scanner.nextDouble();

        System.out.println("");

        double valorTotalVenda = qtdePlanta * valorPlanta;

        double percentualDesconto = 0.05;
        double descontoTotal = 0;

        if (qtdePlanta > 10) {

            descontoTotal = valorTotalVenda * percentualDesconto;

            valorTotalVenda = valorTotalVenda - descontoTotal;
        }

        var newVenda = new Venda(qtdePlanta, valorTotalVenda, descontoTotal);

        lVendas.add(newVenda);

        System.out.println("Valor total da venda: " + valorTotalVenda);

        System.out.println("");
    }
}
