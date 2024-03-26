package primeirob.Atividade;

import java.util.Scanner;

public class PrimeiraAtividade {
    
    public static void main(String[] args) {
        

                System.out.println("Menu da Calculadora");
                System.out.println("1 - Calcular Preço Total");
                System.out.println("2 - Calcular Troco");
                System.out.println("3 - Sair");

                Scanner input = new Scanner(System.in);
                System.out.println("Selecione a opção: 1, 2 ou 3");
                int escolha = input.nextInt();

                    switch (escolha) {
                        case 1:
                            calcularPrecoTotal();
                            break;

                        case 2:
                            calcularTroco();
                            break;

                        default:
                        System.out.println("Opção Inválida");
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

}
