package primeirob.atividades;

import java.util.Scanner;

public class AttDois {
    public static void main (String[] args) {
        
    int contMenu = 0, posicao =0, num = 0, quantPlanta = 0;
    double precoTotal = 0.00d;
    double precoPlanta, valor, troco = 0.00d;
    double desconto = 0.00d;
    int[] vetor = new int [99];
    double[] vetorPreco = new double[99];
    double[] vetorDesconto = new double[99];

    while (num!=3) {
        System.out.println("\nMenu\n [1] Calcular Preço Total\n [2] Calcular Troco\n [3] Sair\n [4] Registro de vendas");

        Scanner demo = new Scanner(System.in);
        
        num = demo.nextInt();
    
        if (num==1) {
            System.out.print("Digite a quantidade de plantas: ");
            quantPlanta=demo.nextInt();
            System.out.print("Digite o preço de cada planta: ");
            precoPlanta=demo.nextDouble();
            if (quantPlanta > 10) {
                precoPlanta = quantPlanta * precoPlanta;
                desconto = precoPlanta * 0.05;
                precoTotal = precoPlanta - desconto;
                vetorDesconto[posicao] = desconto;
            }
            else {
                precoTotal = (precoPlanta * quantPlanta);
            }
            System.out.print("O preço total é: " + precoTotal);
            contMenu++;
            vetor[posicao] = quantPlanta;
            vetorPreco[posicao] = precoTotal;
            posicao++;
        }
        if (num==2) {
            System.out.print("Digite o valor que o cliente pagou: ");
            valor=demo.nextDouble();
            troco = (valor - precoTotal);
            System.out.print("O troco é: " + troco);
        }
        if (num==3) {
            
        }
        if (num==4) {
            
            for (int i = 0; i < contMenu; i++) {
                System.out.println("Quantidade de planta vendida: " + vetor [i]);
                System.out.println("Valor total da venda: " + vetorPreco [i]);
                System.out.println("Desconto aplicado: " + vetorDesconto [i]);
            }
             
        }
    }
    

    System.exit(3);
    }
}

