import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {

        int vetorPlanta[] = new int[99];
        int vetorValor[] = new int[99];
        int vetorPagamento[] = new int[99];

        int i;

        int y = 0;

        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < 99; i++) {
            System.out.println("Digite quantas plantas você deseja comprar (ou digite 'x' para sair):");
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

        System.out.println("Digite [1] para ver quantas plantas foram vendidas: ");
        System.out.println("Digite [2] para mostrar o valor total de cada compra: ");
        System.out.println("Digite [3] para mostrar o valor do troco ou quanto faltou para o pagamento: ");
        System.out.println("Digite [4] para ver todas as informações: ");

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
            default:
                break;
        }

        scanner.close();
    }
}
