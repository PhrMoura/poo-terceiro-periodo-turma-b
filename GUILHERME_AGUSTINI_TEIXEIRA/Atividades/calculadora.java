package GUILHERME_AGUSTINI_TEIXEIRA.primeirob.Calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner gSel = new Scanner(System.in);
        int op;
        int qntPlanta;
        double valorPlanta;
        float precoTotal;
        double valorPago;
        double valorTroco;
        

        do {

        System.out.println(x:"Calculadora da Dona Gabrielinha");
        System.out.println(x:"Selecione a funcao");
        System.out.println(x:"1- Calcular Preço Total");
        System.out.println(x:"2- Calcular Troco");
        System.out.println(x:"3- Historico de Vendas");
        System.out.println(x:"4- Sair");

        op = gSel.nextInt();

      
            
        
        switch (op) {

            case 1: //Preco total 

                System.out.println(x:"Quantas plantas compradas:");
                qntPlanta = gSel.nextInt();
                System.out.println(x:"Valor da planta:");
                valorPlanta = gSel.nextDouble();
                precoTotal = qntPlanta * valorPlanta;
                
                if (qntPlanta > 10) {
                    precoTotal = precoTotal * 0.05
                    System.out.println("O desconto de 5% foi aplicado e o valor total ficou:" + precoTotal);
                }

                System.out.printl ("O valor total é:" + precoTotal);

                break;

            case 2: //Valor do troco

                System.out.println(x:"Valor pago:");
                valorPago = gSel.nextDouble();
                valorTroco = valorPago - precoTotal;
                System.out.println("O valor do troco sera:" + valorTroco);

                break;

            case 3: //Historico de vendas
                int desconto;
                
                System.out.println(x:"Insira a quantidades de plantas vendidas ");
                qntPlanta = qntPlanta.nextInt();

                System.out.println(x:"Insira o valor total da venda");

                precoTotal = precoTotal.nextfloat();

                System.out.println(x:"Insira o valor do desconto aplicado");
                
                desconto = desconto.nextInt();

                break;

            case 4: //Sair

                System.out.println(x:"Ate logo");

                break;

            default:

                System.out.println(x:"Opcao invalida selecione novamente...");

                break;
        }
        } while (op != 4);
        opSel.close();
    }
}
