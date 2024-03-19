package Listas;

import java.util.Scanner;

public class lista1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        /*Calculadora: 
          - Preço Total Qntd * preço
          - Troco Valor Cliente - preço
          - Menu Console:   [1] - Preço Total
                            [2] - Calcular Troco
                            [3] - Sair
         */

        float amount = 0f, value, valueClient, quantity, change;
        int choice;
        boolean leave = false;

        do {
            System.out.println("Menu Console\n");
            System.out.println("[1] - Calcular Preço Total\n[2] Calcular Troco\n[3] Sair");

            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Total da compra
                    System.out.println("Insira o preço do produto: ");
                    value = scanner.nextFloat();

                    System.out.println("Insira a quantidade de produtos: ");
                    quantity = scanner.nextFloat();

                    amount = quantity * value;

                    System.out.println("Valor total: " + amount);
                    System.out.println("\n");
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

                case 3: // Sair
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
