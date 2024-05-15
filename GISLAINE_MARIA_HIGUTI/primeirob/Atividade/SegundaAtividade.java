package primeirob.Atividade;


import java.util.Scanner;


public class SegundaAtividade {
   
static int[] totalArvoresVendidas = new int[1];
static double[] totalValorVendido = new double[1];
static int numeroDeVendas = 0;

    public static void main(String[] args) {
               
                System.out.println("Menu da Calculadora");
                System.out.println("1 - Calcular Preço Total");
                System.out.println("2 - Calcular Troco");
                System.out.println("3 - Registrar Venda no Sistema");
                System.out.println("4 - Sair");


                Scanner input = new Scanner(System.in);
                System.out.println("Selecione a opção: 1, 2, 3 ou 4");
                int escolha = input.nextInt();


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


                        default:
                        System.out.println("Finalizando execução");
                            break;
                    }


                    input.close();


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

        System.out.println("Insira a quantidade de árvores vendidas na última transação");
        int quantidadeArvoresVendidas = input.nextInt();

        System.out.println("Insira o valor, em reais, obtido na última transação");
        double valorVendido = input.nextDouble();

        totalArvoresVendidas[numeroDeVendas] = quantidadeArvoresVendidas;
        totalValorVendido[numeroDeVendas] = valorVendido;

        numeroDeVendas ++;

        System.out.println("Venda registrada com sucesso!");
        System.out.println(totalArvoresVendidas);
        System.out.println(totalValorVendido);

        input.close();

    }


}

