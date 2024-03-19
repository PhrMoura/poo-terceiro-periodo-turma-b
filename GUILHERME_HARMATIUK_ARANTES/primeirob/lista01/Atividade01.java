package primeirob.lista01;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        /*
         * 1. Cálculo de Preço Total:
            - Dona Gabrielinha deseja calcular o preço total da venda de um item, 
                considerando a quantidade de uma planta vendida vezes seu preço unitário.
   
            - Entrada: Receber dois valores, primeiro a quantidade da referida planta, 
                segundo a valor o preço da mesma.
            - Saída: Retornar o resultado do cálculo.
         */

        System.out.println("Quantidade de Plantas x Vendidas: ");
        Scanner qtd_input = new Scanner(System.in);
        int qtd = qtd_input.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Preço de cada Planta x: ");
        Scanner valor_input = new Scanner(System.in);
        float valor = valor_input.nextFloat();
        float total = qtd * valor;
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Valor Total (qtd de plantas vendidas * preço da planta): " + total);
    }
}
