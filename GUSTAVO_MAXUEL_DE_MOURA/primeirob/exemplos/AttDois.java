package primeirob.exemplos;

import java.util.Scanner;

public class AttDois {
    public static void main(String[] args) {
        int numero = 0, cont = 0;
        double valorPago, precoPlanta, desconto = 0, precoTotal = 0.00d;
        int quantidadePlanta, posicao = 0;
        int[] arrayVendas = new int[99];
        double[] arrayDesconto = new double[99];
        double[] arrayPreco = new double[99];
        while (numero != 3) {
            Scanner menu = new Scanner(System.in);

            System.out.println(
                    "Menu de pagamentos do café Dona Gabrielinha\nEscolha a opção que deseja\n[1]-Calcular preço total\n[2]-Calcular troco\n[3]-Sair\n[4]-Ver todas as vendas");
            numero = menu.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Cálculo do preço da planta\nDigite a quantidade da planta:");
                    quantidadePlanta = menu.nextInt();

                    System.out.println("Digite o preço da planta");
                    precoPlanta = menu.nextDouble();
                    if (quantidadePlanta > 10) {
                        desconto = (precoPlanta * quantidadePlanta);
                        precoTotal = ((precoPlanta * quantidadePlanta) * 0.95);
                        desconto = (desconto - precoTotal);
                        arrayDesconto[posicao] = desconto;
                    } else {
                        precoTotal = (precoPlanta * quantidadePlanta);
                    }

                    arrayPreco[posicao] = precoTotal;
                    arrayVendas[posicao] = quantidadePlanta;

                    System.out.println("O desconto foi de:" + arrayDesconto[posicao]);
                    System.out.println("A quantidade de plantas vendidas foi de:" + arrayVendas[posicao]);
                    System.out.println("O preço com desconto foi de:" + arrayPreco[posicao]);

                    posicao++;

                    System.out.println("O preço total é " + precoTotal);
                    cont++;
                    break;
                case 2:
                    System.out.println("Cálculo do troco para o cliente\nDigite o valor recebido:");
                    valorPago = menu.nextDouble();
                    valorPago = (valorPago - precoTotal);
                    System.out.println("O troco é " + valorPago);
                    break;
                case 3:

                    break;
                case 4:
                    for (int i = 0; i < cont; i++) {
                        System.out.println("O desconto foi de:" + arrayDesconto[i]);
                        System.out.println("A quantidade de plantas vendidas foi de:" + arrayVendas[i]);
                        System.out.println("O preço com desconto foi de:" + arrayPreco[i]);
                    }
                    break;
                   
                default:
                    System.out.println("Opção não válida");
                    break;

            }
            menu.close();
        }

        System.exit(0);
       
    }

}
