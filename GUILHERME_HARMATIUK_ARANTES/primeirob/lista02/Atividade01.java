package primeirob.lista02;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        /*
         * 1. Desconto Especial:
            - Quando um cliente compra mais de 10 plantas, Dona Gabrielinha 
                oferece um desconto especial de 5% no valor total da compra.

            - Entrada: Receber dois valores, primeiro a quantidade da referida 
                planta, segundo a valor o preço da mesma.
            - Saída: Retornar caso a quantidade informada for maior que 10 realizar 
                o desconto.
         */
        System.out.println("Quantidade de Plantas x Vendidas: ");
        Scanner qtdInput = new Scanner(System.in);
        int qtd = qtdInput.nextInt();

        System.out.println("Preço da Planta x que foi vendida: ");
        Scanner valueInput = new Scanner(System.in);
        float value = valueInput.nextFloat();

        if (qtd > 10) {
            double total = qtd * value;
            double desconto = ((qtd * value) * 0.05);
            System.err.println("total: " + total);
            System.err.println("desconto (5%): " + desconto);
            System.out.println("Valor Total com desconto: " + (total - desconto));
        } else {
            float total = qtd * value;
            System.out.println("Valor Total sem desconto: " + total);
        }
        qtdInput.close();
        valueInput.close();
    }
}
