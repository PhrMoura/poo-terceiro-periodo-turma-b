package primeirob.Atividade;

import java.util.Scanner;

public class TerceiraAtividade {

static int[][] totalArvoresVendidas = new int[12][30];
static double[][] totalValorVendido = new double[12][30];

    public static void main(String[] args) {
        int escolha;    
        Scanner input = new Scanner(System.in);   

            do {
                exibirMenu();
                escolha = input.nextInt();
                    switch (escolha) {
                        case 1:
                            calcularPrecoTotal();
                            break;

                        case 2:
                            calcularTroco();
                            break;

                        case 3:
                            registrarVendas();
                            break;

                        case 4:
                            buscarVenda();
                            break;   

                        default:
                        System.out.println("Finalizando execução");
                            break;
                    }
                }while (escolha != 5);

                input.close();
        }

    public static void exibirMenu() {
        System.out.println("Menu da Calculadora");
        System.out.println("1 - Calcular Preço Total");
        System.out.println("2 - Calcular Troco");
        System.out.println("3 - Registrar Venda no Sistema");
        System.out.println("4 - Buscar Quantidade Vendida em Determinado Dia do Mês");
        System.out.println("5 - Sair");
        System.out.println("Selecione a opção: 1, 2, 3, 4 ou 5");
    }

    public static void calcularPrecoTotal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de plantas vendidas");
        int quantidadePlantas = input.nextInt();


        System.out.println("Insira o valor unitários das plantas");
        double valorPlanta = input.nextDouble();


        double precoTotal = (quantidadePlantas * valorPlanta);


        if (quantidadePlantas > 10) {
            precoTotal = precoTotal * 0.95;
        }


        System.out.println("O preço total da compra é de: R$" + precoTotal);


        input.close();
         
    }


    public static void calcularTroco() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor pago pelo cliente");
        double valorPago = input.nextDouble();


        System.out.println("Insira o valor da compra");
        double valorCompra = input.nextDouble();        


        double troco = (valorPago - valorCompra);
        System.out.println("O valor do troco é de: R$" + troco);


        input.close();
       
    }


    public static void registrarVendas() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o mês (1-12) e o dia (1-30) da venda");
        int mes = input.nextInt();
        int dia = input.nextInt();

        if (mes < 1 || mes > 12 || dia < 1 || dia > 30) {
            System.out.println("Data inválida, tente novamente");
            input.close();
            return;
        }

        System.out.println("Insira a quantidade de árvores vendidas na data");
        int quantidadeArvoresVendidas = input.nextInt();
        totalArvoresVendidas[mes - 1][dia - 1] += quantidadeArvoresVendidas;
        
        System.out.println("Insira a quantidade de dinheiro obtido nas vendas feitas na data");
        double quantidadeDinheiroObtido = input.nextDouble();
        totalValorVendido[mes - 1][dia - 1] += quantidadeDinheiroObtido;

        System.out.println("Venda registrada com sucesso");

        input.close();
    }

    public static void buscarVenda() {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o mês (1-12) e o dia (1-30) para buscar as vendas");
        int mes = input.nextInt();
        int dia = input.nextInt();

        if (mes < 1 || mes > 12 || dia < 1 || dia > 30) {
            System.out.println("Data inválida, tente novamente");
            input.close();
            return;
        }

        System.out.println("Quantidade de árvores vendidas nesse dia: " + totalArvoresVendidas[mes - 1][dia - 1]);
        System.out.println("Quantidade de dinheiro obtido nesse dia: " + totalValorVendido[mes - 1][dia - 1]);
        
        input.close();
    }
}