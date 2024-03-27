package primeirob;

import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        int i = 0;

        int produtosVetor[] = new int[99];
        double descontoVetor[] = new double[99];
        double valorTotalVetor[] = new double[99];

        while (opcao != 4) {


            System.out.println("Calculadora da Dona Gabrielinha");
            System.out.println("Insira 1 para calcular o valor total da compra");
            System.out.println("Insira 2 para calcular o troco");
            System.out.println("Insira 3 para visualizar histórico de compras");
            System.out.println("Insira 4 para sair");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o numero de produtos comprados");
                    int produtos = leitor.nextInt();

                    produtosVetor[i] = produtos;

                    System.out.println("Insira o valor dos produtos");
                    double valor = leitor.nextDouble();

                    if (produtos > 10) {
                        double valorTotal = (produtos * valor) * 0.05;
                        System.out.println(
                                "A compra teve desconto de 5%. O valor total da compra é de: " + valorTotal + " reais");

                        valorTotalVetor[i] = valorTotal;
                        descontoVetor[i] = (produtos * valor) - valorTotal;

                    } else {
                        double valorTotal = produtos * valor;
                        System.out.println("O valor total da compra é de: " + valorTotal + " reais");

                        valorTotalVetor[i] = valorTotal;
                        descontoVetor[i] = 0;
                    }

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
                    for (int j = 0; j < 100; j++) {
                        if (produtosVetor[j] == 0) {
                            break;
                        } else {
                            System.out.println("-----------------");
                            System.out.println("Produtos comprados " + produtosVetor[j]);
                            System.out.println("Produtos valor total da compra: " + valorTotalVetor[j]);
                            System.out.println("Desconto da compra: " + descontoVetor[j]);
                            System.out.println("-----------------");
                        }
                    }

                    break;

                case 4:
                    System.out.println("Fechando a aplicação");
                    break;
                default:
                    break;
            }
            i++;
        }
        leitor.close();
    }
}