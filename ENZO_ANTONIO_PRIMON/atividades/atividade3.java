package atividades;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        int mes;
        int dia;
        double valorTotal;


        // int produtosVetor[] = new int[99];
        // double descontoVetor[] = new double[99];
        // double valorTotalVetor[] = new double[99];

        double[][] mesesDias = new double[12][30];

        while (opcao != 4) {


            System.out.println("Calculadora da Dona Gabrielinha");
            System.out.println("Insira 1 para registrar a compra ");
            System.out.println("Insira 2 para calcular o troco");
            System.out.println("Insira 3 para visualizar histórico de compras");
            System.out.println("Insira 4 para sair");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o mês e o dia respectivamente.");
                    mes = leitor.nextInt();
                    dia = leitor.nextInt();

                    System.out.println("Insira o numero de produtos comprados");
                    int produtos = leitor.nextInt();
            
                    System.out.println("Insira o valor dos produtos");
                    double valor = leitor.nextDouble();

                    if (produtos > 10) {
                        valorTotal = (produtos * valor) * 0.05;
                        System.out.println(
                                "A compra teve desconto de 5%. O valor total da compra é de: " + valorTotal + " reais");

                    } else {
                        valorTotal = produtos * valor;
                        System.out.println("O valor total da compra é de: " + valorTotal + " reais");
                    }

                    mesesDias[mes - 1][dia - 1] += valorTotal;
                    break;

                case 2:
                    System.out.println("Insira o valor dado pelo cliente");
                    double valorCliente = leitor.nextDouble();

                    System.out.println("Insira o valor total dos produtos");
                    double valorTotal2 = leitor.nextDouble();

                    double troco = valorCliente - valorTotal2;

                    System.out.println("O troco é de: " + troco + " reais");

                    break;

                case 3:
                    System.out.println("Insira o mes e dia para pesquisa de valor");

                    mes = leitor.nextInt();
                    dia = leitor.nextInt();

                    System.out.println("Vendas totais do dia selecionado: " + mesesDias[mes - 1][dia - 1]);

                    break;

                case 4:
                    System.out.println("Fechando a aplicação");
                    break;
                default:
                    break;
            }
        }
        leitor.close();
    }
}