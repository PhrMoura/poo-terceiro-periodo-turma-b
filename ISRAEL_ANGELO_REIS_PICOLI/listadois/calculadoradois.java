package listadois;

import java.util.Scanner;

public class calculadoradois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;
        int pedidos = 0;
        float[] qtdPlanta = new float[50];
        float[] valorPlanta = new float[50];
        float[] valorTotal = new float[50];
        float[] valorCliente = new float[50];
        float[] desconto = new float[50];

        while (opcao != 5) {
            System.out.println("\nMenu calculadora:");
            System.out.println("[1] - Registrar pedido");
            System.out.println("[2] - Calcular o preço total");
            System.out.println("[3] - Calcular o troco");
            System.out.println("[4] - Abrir registro de vendas");
            System.out.println("[5] - Sair\n");

            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("Quantidade de planta na compra:");
                qtdPlanta[pedidos] = leitor.nextFloat();

                System.out.println("Valor da planta:");
                valorPlanta[pedidos] = leitor.nextFloat();

                System.out.println("Valor recebido pelo cliente:");
                valorCliente[pedidos] = leitor.nextFloat();

                pedidos++;
            }

            else if (opcao == 2) {
                int cont = pedidos - 1;
                valorTotal[cont] = qtdPlanta[cont] * valorPlanta[cont];

                if (qtdPlanta[cont] >= 10) {
                    desconto[cont] = valorTotal[cont] * 5 / 100;
                    valorTotal[cont] = valorTotal[cont] - desconto[cont];
                }

                System.out.println("O valor total da compra é R$: " + valorTotal[cont]);
                System.out.println("Desconto de R$: " + desconto[cont]);

            } else if (opcao == 3) {
                int cont = pedidos - 1;
                if (valorCliente[cont] >= valorTotal[cont]) {
                    float troco = valorCliente[cont] - valorTotal[cont];
                    System.out.println("O troco é: " + troco);

                } else {
                    float falta = valorTotal[cont] - valorCliente[cont];
                    System.out.println("O valor recebido pelo cliente é insuficiente, faltam R$" + falta);
                }

            }

            else if (opcao == 4) {
                for (int i = 0; i < pedidos; i++) {
                    System.out.println("Venda Nº " + (i + 1));
                    System.out.println("Quantidade de plantas vendidas: " + qtdPlanta[i]);
                    System.out.println("Valor da venda: " + valorTotal[i]);
                    System.out.println("Desconto aplicado: R$" + desconto[i]);
                    System.out.println("\n");
                }
            }

            else if (opcao == 5) {
                System.out.println("Saindo da calculadora...");

            } else {
                System.out.println("Opção inválida.");
            }
        }
        leitor.close();
    }
}
