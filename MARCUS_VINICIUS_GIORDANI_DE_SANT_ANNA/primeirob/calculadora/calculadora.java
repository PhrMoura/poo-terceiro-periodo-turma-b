
package primeirob.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tipoOpe;
        int[] quantidadePlanta = new int[100];
        float[] valorPlanta = new float[100];
        float[] valorTotal = new float[100];
        float[][] vendasPorDiaEMes = new float[12][30]; // Array para armazenar as vendas por dia e mês

        int indiceVenda = 0;

        System.out.println("Bem-vindo a Calculadora Java");
        System.out.println("Escolha uma das seis opções de operação:");
        System.out.println("1: Calculo de Preço Total");
        System.out.println("2: Calculo de Troco");
        System.out.println("3: Verificar Registro de Vendas");
        System.out.println("4: Salvar Vendas do Dia");
        System.out.println("5: Buscar Vendas por Mês e Dia");
        System.out.println("6: Sair");

        tipoOpe = leitor.nextInt();
        leitor.nextLine();

        while (tipoOpe != 6) {
            switch (tipoOpe) {
                // Valor Total
                case 1:
                    float valorTotalVenda;

                    System.out.println("Qual a quantidade da planta vendida:");
                    quantidadePlanta[indiceVenda] = leitor.nextInt();
                    leitor.nextLine();

                    System.out.println("Qual o valor unitário:");
                    valorPlanta[indiceVenda] = leitor.nextFloat();

                    if (quantidadePlanta[indiceVenda] > 10) {
                        valorTotalVenda = quantidadePlanta[indiceVenda] * valorPlanta[indiceVenda] * 0.9f;
                    } else {
                        valorTotalVenda = quantidadePlanta[indiceVenda] * valorPlanta[indiceVenda];
                    }

                    valorTotal[indiceVenda++] = valorTotalVenda;

                    System.out.println("\nResultado:");
                    System.out.println("Valor total a ser pago: " + valorTotalVenda);
                    break;
                // Valor do Troco
                case 2:
                    float dinheiroCliente;
                    float valorTroco;
                    float valorCompra;

                    System.out.println("Qual o valor total da compra:");
                    valorCompra = leitor.nextFloat();
                    leitor.nextLine();

                    System.out.println("Qual o valor dado pelo cliente:");
                    dinheiroCliente = leitor.nextFloat();
                    valorTroco = dinheiroCliente - valorCompra;
                    System.out.println("\nResultado:");
                    System.out.println("Valor do troco: " + valorTroco);
                    break;

                case 3:
                    // Registro de vendas
                    System.out.println("Registro de Vendas:");
                    for (int i = 0; i < indiceVenda; i++) {
                        System.out.println("Venda " + (i + 1));
                        System.out.println("Quantidade: " + quantidadePlanta[i]);
                        System.out.println("Valor Unitário: " + valorPlanta[i]);
                        System.out.println("Valor Total: " + valorTotal[i]);
                        System.out.println();

                    }
                    break;

                case 4:
                    // Salvar vendas do dia
                    System.out.println("Digite o mês (1-12):");
                    int mes = leitor.nextInt();
                    System.out.println("Digite o dia (1-30):");
                    int dia = leitor.nextInt();

                    float totalVendasDia = 0;
                    for (int i = 0; i < indiceVenda; i++) {
                        totalVendasDia += valorTotal[i];
                    }
                    vendasPorDiaEMes[mes - 1][dia - 1] = totalVendasDia;
                    System.out.println("Vendas do dia " + dia + " do mês " + mes + " salvas com sucesso!");
                    break;

                case 5:
                    // Buscar vendas por mês e dia
                    System.out.println("Digite o mês (1-12):");
                    mes = leitor.nextInt();
                    System.out.println("Digite o dia (1-30):");
                    dia = leitor.nextInt();
                    System.out.println("Total de vendas do dia " + dia + " do mês " + mes + ": " + vendasPorDiaEMes[mes - 1][dia - 1]);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma das opções listadas.");
                    break;
            }

            System.out.println("\nEscolha uma das seis opções de operação:");
            System.out.println("1: Calculo de Preço Total");
            System.out.println("2: Calculo de Troco");
            System.out.println("3: Verificar Registro de Vendas");
            System.out.println("4: Salvar Vendas do Dia");
            System.out.println("5: Buscar Vendas por Mês e Dia");
            System.out.println("6: Sair");

            tipoOpe = leitor.nextInt();
            leitor.nextLine();
        }

        System.out.println("Saindo do programa. Obrigado!");
        leitor.close();
    }
}
