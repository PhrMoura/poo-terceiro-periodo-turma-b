package primeirob.lista03;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner actionInput = new Scanner(System.in);
        int action = 0;
        double[][] matrizVendas = new double[12][30];

        while (action != 3) {
            System.out.println("==================");
            System.out.println("Escolha uma ação: ");
            System.out.println("- [1]: Salvar Vendas ");
            System.out.println("- [2]: Buscar por Vendas ");
            System.out.println("- [3]: Sair ");
            System.out.println("==================");
            System.out.println("");

            action = actionInput.nextInt();

            switch (action) {
                case 1:
                    matrizVendas = primeirob.lista03.Atividade01.fillMatriz(matrizVendas);
                    break;
                case 2: 
                    primeirob.lista03.Atividade01.buscarValores(matrizVendas);
                    break;
                case 3:
                default:
                    break;
            }
    
        }   
        actionInput.close();
    }
}
