package primeirob.lista01;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        System.out.println();
        /*
         * 2. Cálculo de Troco:
            - A calculadora deve calcular o troco a ser dado ao cliente, considerando o valor pago.
   s
            - Entrada: Receber dois valores, primeiro o valor recebido pelo cliente, 
                segundo o valor total da compra.
            - Saída: Retornar o resultado do cálculo.
         */

        System.out.println("Valor total da compra: ");
        Scanner total_input = new Scanner(System.in);
        float total = total_input.nextFloat();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Valor pago pelo cliente: ");
        Scanner valor_pago_input = new Scanner(System.in);
        float valor_pago = valor_pago_input.nextFloat();
        
        float resultado = total - valor_pago;
        if (resultado < 0) {
            System.out.println("O cliente precisa de troco de: " + (resultado * -1) + " reais");
        } else if (resultado == 0) {
            System.out.println("O cliente não precisa de ou deve troco. Ele pagou a quantia exata");
        } else if (resultado > 0) {
            System.out.println("O cliente ainda deve: " + (resultado) + " reais");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        total_input.close();
        valor_pago_input.close();
    }
}
