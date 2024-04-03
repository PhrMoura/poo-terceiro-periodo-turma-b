package listatres;

import java.util.Scanner;

public class calculadoratres {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;
        int pedidos = 0;
        float[] qtdPlanta = new float[50];
        float[] valorPlanta = new float[50];
        float[] valorTotal = new float[50];
        float[] valorCliente = new float[50];
        float[] desconto = new float[50];
        float[][] matrizVendas = new float[12][30];
        float vendaTotal = 0;

        while (opcao != 7) {  // Menu da calculadora
            System.out.println("\nMenu calculadora:");
            System.out.println("[1] - Registrar pedido");
            System.out.println("[2] - Calcular o preço total");
            System.out.println("[3] - Calcular o troco");
            System.out.println("[4] - Abrir registro de vendas");
            System.out.println("[5] - Registrar venda total");
            System.out.println("[6] - Buscar venda total");
            System.out.println("[7] - Sair\n");

            opcao = leitor.nextInt();

            if (opcao == 1) {  // Valores do pedido
                System.out.println("Quantidade de planta na compra:");
                qtdPlanta[pedidos] = leitor.nextFloat();

                System.out.println("Valor da planta:");
                valorPlanta[pedidos] = leitor.nextFloat();

                System.out.println("Valor recebido pelo cliente:");
                valorCliente[pedidos] = leitor.nextFloat();

                pedidos++;
            }

            else if (opcao == 2) { // Cálculo do valor total da venda
                int cont = pedidos - 1;
                valorTotal[cont] = qtdPlanta[cont] * valorPlanta[cont];

                if (qtdPlanta[cont] >= 10) {
                    desconto[cont] = valorTotal[cont] * 5 / 100;
                    valorTotal[cont] = valorTotal[cont] - desconto[cont];
                }

                vendaTotal += valorTotal[cont];

                System.out.println("O valor total da compra é R$: " + valorTotal[cont]);
                System.out.println("Desconto de R$: " + desconto[cont]);

            } else if (opcao == 3) {  // Cálculo do troco do cliente
                int cont = pedidos - 1;
                if (valorCliente[cont] >= valorTotal[cont]) {
                    float troco = valorCliente[cont] - valorTotal[cont];
                    System.out.println("O troco é: " + troco);

                } else {
                    float falta = valorTotal[cont] - valorCliente[cont];
                    System.out.println("O valor recebido pelo cliente é insuficiente, faltam R$" + falta);
                }

            }

            else if (opcao == 4) { // Informações de vendas de pedidos passados
                for (int i = 0; i < pedidos; i++) {
                    System.out.println("Venda Nº " + (i + 1));
                    System.out.println("Quantidade de plantas vendidas: " + qtdPlanta[i]);
                    System.out.println("Valor da venda: " + valorTotal[i]);
                    System.out.println("Desconto aplicado: R$" + desconto[i]);
                    System.out.println("\n");
                }
            }

            else if (opcao == 5) { // Inserção do valor total de vendas no dia e mês
                System.out.println("[1 à 12] Escolha um mês para inserir a venda:");
                int mes = leitor.nextInt();

                System.out.println("[1 à 30] Escolha o dia do mês para inserir a venda:");
                int dia = leitor.nextInt();

                if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 30) {
                    matrizVendas[mes - 1][dia - 1] = vendaTotal;
                    System.out.println("\nVenda total registrada no dia " + dia + " do mês " + mes);
                } else {
                    System.out.println("Mês ou dia inválidos.");
                }
            }

            else if (opcao == 6) { // Pesquisa do valor total de vendas no dia e mês
                System.out.println("[1 à 12] Escolha um mês para buscar a venda:");
                int mesBuscar = leitor.nextInt();

                System.out.println("[1 à 30] Escolha o dia do mês para buscar a venda:");
                int diaBuscar = leitor.nextInt();

                if (mesBuscar >= 1 && mesBuscar <= 12 && diaBuscar >= 1 && diaBuscar <= 30) {
                    float buscarValor = matrizVendas[mesBuscar - 1][diaBuscar - 1];
                    if (buscarValor <= 0) {
                        System.out.println("Nenhum resultado encontrado.");
                    } else {
                        System.out.println("\nValor encontrado: R$" + buscarValor + " do dia " + diaBuscar + " do mês "
                                + mesBuscar);
                    }
                } else {
                    System.out.println("Mês ou dia inválidos.");
                }

            }

            else if (opcao == 7) { // Fechando a calculadora
                System.out.println("Saindo da calculadora...");

            } else {
                System.out.println("Opção inválida.");
            }
        }
        leitor.close();
    }
}
