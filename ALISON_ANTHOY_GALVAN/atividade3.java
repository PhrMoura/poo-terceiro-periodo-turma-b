import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        int[][] matrizVendas = new int[12][30];
        int[] totalVendasPorDia = new int[30];

        int[] vetorPlanta = new int[99];
        int[] vetorValor = new int[99];
        int[] vetorPagamento = new int[99];

        int i, j;
        int y = 0;

        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 99; i++) {
            System.out.println("Digite quantas plantas você deseja comprar (ou digite '0' para sair):");
            vetorPlanta[i] = scanner.nextInt();

            if (vetorPlanta[i] == 0) {
                break;
            }

            y++;

            System.out.println("Digite o valor da planta:");
            vetorValor[i] = scanner.nextInt();

            System.out.println("Digite o valor do pagamento:");
            vetorPagamento[i] = scanner.nextInt();

            System.out.println("Digite x para sair");
            String input = scanner.next();

            if (input.equals("x")) {
                break;
            }
        }

        for (i = 0; i < y; i++) {
            if (vetorPlanta[i] >= 10) {
                vetorValor[i] = (int) (vetorPlanta[i] * vetorValor[i] * 0.95);
            } else {
                vetorValor[i] = vetorPlanta[i] * vetorValor[i];
            }

            vetorPagamento[i] = vetorPagamento[i] - vetorValor[i];
        }

        while (true) {
            System.out.println("Digite o dia (1-30) e o mês (1-12) da venda (ou digite '0 0' para sair):");
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();

            if (dia == 0 && mes == 0) {
                break;
            }

            System.out.println("Digite quantas plantas você deseja comprar:");
            int quantidadeVendida = scanner.nextInt();

            System.out.println("Digite o valor da planta:");
            int valor = scanner.nextInt();

            matrizVendas[mes - 1][dia - 1] += quantidadeVendida;
            totalVendasPorDia[dia - 1] += quantidadeVendida;

            System.out.println("Venda registrada com sucesso!");
        }

        System.out.println("Digite [1] para ver quantas plantas foram vendidas: ");
        System.out.println("Digite [2] para mostrar o valor total de cada compra: ");
        System.out.println("Digite [3] para mostrar o valor do troco ou quanto faltou para o pagamento: ");
        System.out.println("Digite [4] para ver todas as informações: ");
        System.out.println("Digite [5] para ver as vendas de um dia específico: ");
        System.out.println("Digite [6] para ver as vendas de um mês específico: ");
        System.out.println("Digite [7] para sair: ");

        int receba = scanner.nextInt();

        switch (receba) {
            case 1:
                System.out.println("A quantia de plantas que foram vendidas foram respectivamente: ");
                for (i = 0; i < y; i++) {
                    System.out.println(vetorPlanta[i]);
                }
                break;
            case 2:
                System.out.println("O valor total de cada compra foi respectivamente de: ");
                for (i = 0; i < y; i++) {
                    System.out.println(vetorValor[i]);
                }
                break;
            case 3:
                System.out.println("O troco ou o valor que faltou para o pagamento foi respectivamente de: ");
                for (i = 0; i < y; i++) {
                    System.out.println(vetorPagamento[i]);
                }
                break;
            case 4:
                for (i = 0; i < y; i++) {
                    System.out.println("O valor de plantas foi de: " + vetorPlanta[i]);
                    System.out.println("O valor total da compra foi de: " + vetorValor[i]);
                    System.out.println("O valor do troco foi de: " + vetorPagamento[i]);
                }
                break;
            case 5:
                System.out.println("Digite o dia que deseja visualizar:");
                int diaConsulta = scanner.nextInt();
                System.out.println("Total de vendas no dia " + diaConsulta + ": " + totalVendasPorDia[diaConsulta - 1]);
                break;
            case 6:
                System.out.println("Digite o mês que deseja visualizar:");
                int mesConsulta = scanner.nextInt();
                int totalVendasMes = 0;
                for (j = 0; j < 30; j++) {
                    totalVendasMes += matrizVendas[mesConsulta - 1][j];
                }
                System.out.println("Total de vendas no mês " + mesConsulta + ": " + totalVendasMes);
                break;
            case 7:
                break;
            default:
                break;
        }

        scanner.close();
    }
}
