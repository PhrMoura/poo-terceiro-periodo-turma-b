import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static class Venda {
        int qtdePlantas;
        double valorTotal;
        double descontosTotal;
        LocalDate data;

        public Venda(int qtdePlantas, double valorTotal, double descontosTotal, LocalDate data) {
            this.qtdePlantas = qtdePlantas;
            this.valorTotal = valorTotal;
            this.descontosTotal = descontosTotal;
            this.data = data;
        }

        public LocalDate getData() {
            return data;
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

        while (opcaoSelecionada != 6) {
            System.out.println("SELECIONE UMA OPÇÃO:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco  ");
            System.out.println("[3] - Registrar Venda ");
            System.out.println("[4] - Listar Vendas Registradas");
            System.out.println("[5] - Listar Vendas por data");
            System.out.println("[6] - Sair");

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
                    listarVendasByDate(scanner, lVendas);

                    break;
                case 6:
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

    public static void listarVendasByDate(Scanner scanner, List<Venda> lVendas) {

        System.out.println("Listar Vendas por data.  \n \n");

        System.out.print("Informe uma data (yyyy-mm-dd): ");
        String dataLida = scanner.next();

        System.out.println(" \n");

        final DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final LocalDate dataVenda = LocalDate.parse(dataLida, formato);

        var vendasFiltradas = lVendas.stream().filter(venda -> venda.getData().isEqual(dataVenda)).toList();

        System.out.println("Total de Vendas do dia " + dataVenda.toString() + ": " + vendasFiltradas.size() + ".");

        for (Venda venda : vendasFiltradas) {
            System.out.println("Valor Venda: R$ " + venda.valorTotal + " Desconto Total: " + venda.descontosTotal
                    + " Qtde Plantas: " + venda.qtdePlantas);
        }

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

        System.out.print("Informe uma data (yyyy-mm-dd): ");
        String dataLida = scanner.next();

        final DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final LocalDate dataVenda = LocalDate.parse(dataLida, formato);

        System.out.println("");

        double valorTotalVenda = qtdePlanta * valorPlanta;

        double percentualDesconto = 0.05;
        double descontoTotal = 0;

        if (qtdePlanta > 10) {

            descontoTotal = valorTotalVenda * percentualDesconto;

            valorTotalVenda = valorTotalVenda - descontoTotal;
        }

        var newVenda = new Venda(qtdePlanta, valorTotalVenda, descontoTotal, dataVenda);

        lVendas.add(newVenda);

        System.out.println("Valor total da venda: " + valorTotalVenda);

        System.out.println("");
    }
}