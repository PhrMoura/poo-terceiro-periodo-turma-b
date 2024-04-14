package Listas;

import java.util.Scanner;

public class lista1_lista2 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        /*Calculadora: 
          - Preço Total Qntd * preço
          - Troco Valor Cliente - preço
          - Menu Console:      
            [1] - Registro de Vendas
            [2] - Preço Total
            [3] - Calcular Troco
            [4] - Sair
         */

        float[][] register = new float[99][2];
        float amount = 0f, value, valueClient, quantity, change, discount;
        int choice, cont = 0;
        boolean leave = false;



        do {
            System.out.println("Menu Console");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registro de Vendas");
            System.out.println("[4] - Sair\n");

            choice = scanner.nextInt();

            switch (choice) {

                case 1: // Total da compra
                    System.out.println("\nInsira o preço do produto: ");
                    value = scanner.nextFloat();

                    System.out.println("Insira a quantidade de produtos: ");
                    quantity = scanner.nextFloat();

                    amount = quantity * value;
                    
                    if (quantity >= 10) {// Desconto de 5%
                        discount = amount * 0.05f;
                        amount = amount - discount;

                        System.out.println("\nValor total: " + amount + "(-5%)");
                    } else {
                        System.out.println("Valor total: " + amount);
                    }
                    
                    register[cont][0] = quantity;
                    register[cont][1] = amount;

                    cont++;

                    System.out.println("--- Venda Registrada ---");

                    break;
                
                case 2: // Troco
                    System.out.println("Insira o valor dado: ");
                    valueClient = scanner.nextFloat();

                    if (amount != 0) {
                        change = valueClient - amount;
                    } else {
                        System.out.println("Insira o valor total da compra: ");
                        amount = scanner.nextFloat();
                        change = valueClient - amount;
                    }

                    System.out.println("Troco: " + change);

                break;
                
                case 3: // exibir Registro de Vendas
                    if (cont >=1) {
                        System.out.println("--- Registro de Vendas ---");

                        for (int i=0; i<=cont; i++){
                            System.out.println("--------------------------");
                            System.out.println("Código de Venda: #" + cont);

                            if (register[i][0] != 0 && register[i][1] != 0) {
                                System.out.println("Quantidade: " + register[i][0]);
                                System.out.println("Total: " + register[i][1]);

                                if (register[i][0] >= 10) {
                                    System.out.println("Com desconto");
                                } else {
                                    System.out.println("Sem desconto");
                                }

                                System.out.println("--------------------------");
                                System.out.println("\n");
                            }
                            }

                    } else {
                        System.out.println("Realize uma venda para gerar um registro");
                    }
                break;

                case 4: // Sair
                    leave = true;
                break;

                default:
                    System.out.println("Insira um valor dentre (1, 2 e 3)");
                    break;
            }
            System.out.println("\n");

            } while (!leave);
        }
    }
