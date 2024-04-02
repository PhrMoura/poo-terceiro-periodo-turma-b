package poo;

import java.util.Scanner;
 
public class floricultura {
    static int numDias = 30;
    static int numMeses = 12;
    static double[][] totalVendas = new double[numDias][numMeses];

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int opcao;

        System.out.println("Informe o mês atual:");
        int mesInformado = entradaTeclado.nextInt();
        System.out.println("Informe o dia atual:");
        int diaInformado = entradaTeclado.nextInt();

        if (mesInformado >= 1 && mesInformado <= numMeses && diaInformado >= 1 && diaInformado <= numDias) {
            do {
                System.out.println("Menu:");
                System.out.println("[1] - Calcular Preço Total");
                System.out.println("[2] - Registro de Vendas por Data");
                System.out.println("[3] - Alterar data? data atual: " + diaInformado + "/" + mesInformado + "/2024");
                System.out.println("[4] - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = entradaTeclado.nextInt();

                switch (opcao) {
                    case 1:
                        calcularPrecoTotal(entradaTeclado, mesInformado, diaInformado);
                        break;
                    case 2:
                        exibirRegistroVendas(entradaTeclado);
                        break;
                    case 3:
                        System.out.println("Informe o mês atual:");
                        mesInformado = entradaTeclado.nextInt();
                        System.out.println("Informe o dia atual:");
                        diaInformado = entradaTeclado.nextInt();
                        break;
                    case 4:
                        System.out.println("Saindo...");
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 4);
        } else {
            System.out.println("Dia ou mês incorretos.");
        }

        entradaTeclado.close();
    }

    public static void calcularPrecoTotal(Scanner scanner, int mesInformado, int diaInformado) {
        System.out.print("Digite a quantidade da planta vendida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;

        if (quantidade > 10) {
            double desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            System.out.println("Desconto de 5% aplicado.");
        }

        totalVendas[diaInformado - 1][mesInformado - 1] += precoTotal;
        System.out.println("preço total: " + precoTotal);

    }

    public static void exibirRegistroVendas(Scanner scanner) {
        System.out.print("Deseja consultar todo o histórico? (1 - Sim, 2 - Não): ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            exibirMatrizVendas();
        } else {
            System.out.print("Qual o mês que deseja consultar?: ");
            int mesConsulta = scanner.nextInt();
            System.out.print("Qual o dia que deseja consultar?: ");
            int diaConsulta = scanner.nextInt();

            if (mesConsulta >= 1 && mesConsulta <= numMeses && diaConsulta >= 1 && diaConsulta <= numDias) {
                System.out.println("Total de vendas para o dia " + diaConsulta + " do mês " + mesConsulta + ": "
                        + totalVendas[diaConsulta - 1][mesConsulta - 1]);
            } else {
                System.out.println("Dia ou mês informado está fora dos limites.");
            }
        }

    }

    public static void exibirMatrizVendas() {
        System.out.println("Matriz de Vendas:");
        for (int dia = 0; dia < numDias; dia++) {
            System.out.print("Dia " + (dia + 1) + ": ");
            for (int mes = 0; mes < numMeses; mes++) {
                System.out.print(totalVendas[dia][mes] + "\t");
            }
            System.out.println();
        }
    }

}
