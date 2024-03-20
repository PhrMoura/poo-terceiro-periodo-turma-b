package primeirob.exemplos;

import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class attUm {
    public static void main (String[] args) {
        
    int num = 0, quantPlanta = 0;
    double precoTotal = 0.00d;
    double precoPlanta, valor, troco = 0.00d;

    while (num!=3) {
        System.out.println("\nMenu\n [1] Calcular Preço Total\n [2] Calcular Troco\n [3] Sair");

        Scanner demo = new Scanner(System.in);
        
        num = demo.nextInt();
    
        if (num==1) {
            System.out.print("Digite a quantidade de plantas: ");
            quantPlanta=demo.nextInt();
            System.out.print("Digite o preço de cada planta: ");
            precoPlanta=demo.nextDouble();
            precoTotal=(precoPlanta * quantPlanta);
            System.out.print("O preço total é: " + precoTotal);
        }
        if (num==2) {
            System.out.print("Digite o valor que o cliente pagou: ");
            valor=demo.nextDouble();
            troco = (valor - precoTotal);
            System.out.print("O troco é: " + troco);
        }
        if (num==3) {
            
        }
    
    }
    System.exit(3);
    }
}
