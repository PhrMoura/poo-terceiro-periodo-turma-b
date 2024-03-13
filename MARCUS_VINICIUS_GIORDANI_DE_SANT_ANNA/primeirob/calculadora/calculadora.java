
package primeirob.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int tipoOpe;

        System.out.print("Bem-vindo a Calculadora Java \n");
        System.out.print("Escolha uma das três opções de operação: \n");
        System.out.print("1: Calculo de Preço Total \n");
        System.out.print("2: Calculo de Troco \n");
        System.out.print("3: Sair \n");
        tipoOpe = leitor.nextInt();

        leitor.nextLine();

        if (tipoOpe == 1) {
            Scanner leitor1 = new Scanner(System.in);
            int quantidadePlanta;
            float valorPlanta;

            System.out.print("Qual a quantidade da planta vendida: \n");
            quantidadePlanta = leitor1.nextInt();

            leitor1.nextLine();

            System.out.print("Qual o valor unitario: \n");
            valorPlanta = leitor1.nextFloat();

            float valorTotal = quantidadePlanta * valorPlanta;

            System.out.print("\n Resultado: \n");
            System.out.println("Valor total a ser pago: " + valorTotal);

            leitor1.close();
        } else if (tipoOpe == 2) {
            Scanner leitor2 = new Scanner(System.in);
            float dinheiroCliente;
            float valorT;
            float valorCompra;

            System.out.print("Qual o valor total da compra: \n");
            valorCompra = leitor2.nextInt();

            leitor2.nextLine();

            System.out.print("Qual o valor dado pelo cliente: \n");
            dinheiroCliente = leitor2.nextFloat();

            valorT = dinheiroCliente - valorCompra;
            System.out.print("\n Resultado: \n");
            System.out.println("Valor do troco: " + valorT);

            leitor2.close();
        } else if (tipoOpe == 3) {

            System.exit(0);
        }

        leitor.close();

    }

}
