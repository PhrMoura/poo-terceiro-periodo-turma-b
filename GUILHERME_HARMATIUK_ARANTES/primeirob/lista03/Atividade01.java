package primeirob.lista03;

import java.util.Scanner;


public class Atividade01 {
    public static void main(String[] args) {
        double[][] matrizVendas = fillMatriz();         

        buscarValores(matrizVendas);
    }

    public static void buscarValores (double[][] matriz) {
        boolean condition = false;
        Scanner mesInput = new Scanner(System.in);
        Scanner diaInput = new Scanner(System.in);
        Scanner checkInput = new Scanner(System.in);

        while (condition == false) {
            int check = 3;
            System.out.println("Pesquisar por valor? (0 - Não, 1 - Sim)");
            while (check != 1 && check != 0) {
                check = checkInput.nextInt();
            }
            if (check == 0) {condition = true;}
            else if (check == 1) {
                int mes = 0;
                int dia = 0;
                
                System.out.println("Digite o mês (1-12) em que a venda ocorreu:");
                while (mes < 1 || mes > 12) {mes = mesInput.nextInt();                }
                
                System.out.println("Digite o dia do mês (1-30) em que ocorreu a venda:");
                while (dia < 1 || dia > 30) {
                    dia = diaInput.nextInt();                
                }

                System.err.println("Valor total das vendas de " + dia + "/" + mes + ":" + matriz[mes-1][dia-1]);
            }
        }    
        System.err.println("Aplicação fechada.");
        // mesInput.close();
        // diaInput.close();
        // checkInput.close();
    }

    public static double[][] fillMatriz (double[][] matrizVendas) {
        Scanner valorTotalInput = new Scanner(System.in);
        Scanner mesInput = new Scanner(System.in);
        Scanner diaInput = new Scanner(System.in);
        Scanner checkInput = new Scanner(System.in);

        boolean condition = false;

        while (condition == false) {
            int mes = 0;
            int dia = 0;
            
            System.out.println("Digite o mês (1-12) em que a venda ocorreu:");
            while (mes < 1 || mes > 12) {
                mes = mesInput.nextInt();                
            }
            
            System.out.println("Digite o dia do mês (1-30) em que ocorreu a venda:");
            while (dia < 1 || dia > 30) {
                dia = diaInput.nextInt();                
            }

            System.out.println("Digite o valor total das vendas realizadas no dia:");
            double valorTotal = valorTotalInput.nextDouble();

            matrizVendas[mes-1][dia-1] = valorTotal;

            System.out.println("Deseja cadastrar vendas para outro dia? (0 - Não, 1 - Sim)");
            
            int check = 3;
            while (check != 0 && check != 1) {
                check = checkInput.nextInt();                
            }
            if (check == 0) {condition = true;}
        }
        
        // valorTotalInput.close();
        // mesInput.close();
        // diaInput.close();
        // checkInput.close();

        return matrizVendas;        
    }
}
