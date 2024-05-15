package primeirob.lista02;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        /*
         * 2. Registro de Vendas:
            - Dona Gabrielinha deseja manter um registro das vendas, incluindo 
                a quantidade de plantas vendidas, o valor venda e os descontos aplicados.
                
            - Entrada: Venda realizada sistema
            - Saída: Armazenamento desses dados no sistema.
         */
        System.out.println("Quantidade de Vendas " +
            "(independente da quantidade de plantas vendidas por venda): ");
        Scanner qtdVendasInput = new Scanner(System.in);
        int qtdVendas = qtdVendasInput.nextInt();
        
        int[] qtdVendasArr = new int[qtdVendas];
        float[] valorVendasArr = new float[qtdVendas];
        int[] descontosArr = new int[qtdVendas];

        Scanner valuePlantasInput = new Scanner(System.in);
        Scanner qtdPlantasInput = new Scanner(System.in);

        for (int index = 0; index < qtdVendas; index++) {
            System.err.println("Quantidade de plantas vendidas: ");
            
            int qtdPlantas = qtdPlantasInput.nextInt();

            System.err.println("Preço da planta vendida: ");
            
            float valuePlantas = valuePlantasInput.nextFloat();

            qtdVendasArr[index] = qtdPlantas;
            valorVendasArr[index] = valuePlantas;

            if (qtdPlantas > 10) {
                descontosArr[index] = 5;
            } else {
                descontosArr[index] = 0;
            }
        }

        System.out.println("\n\n===============\n\n");
        for (int index = 0; index < qtdVendas; index++) {
            System.err.println("=====================");
            System.err.println("Venda " + (index+1) + ": ");
            System.err.println("Qtd de Plantas Vendidas: " + qtdVendasArr[index]);
            System.err.println("Preço das Plantas Vendidas: " + valorVendasArr[index]);
            System.err.println("Desconto da venda: " + descontosArr[index] + "%");
        }

        qtdVendasInput.close();
        qtdPlantasInput.close();
        valuePlantasInput.close();
    }
}
