package Listas;

import java.util.Scanner;

public class lista3 {

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

        float[][] registerDayMonth = new float[30][12];
        float[][] register = new float[99][2];
        float amount = 0f, value, valueClient, quantity, change, discount, monthAmount = 0; //Monthly é uma palavra reservada ao java aparentemente, por isso monthAmount
        int choice, day, month, cont = 0;
        boolean leave = false, checker1 = false, checker2 = false;



        do {
            System.out.println("Menu Console");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registro de Vendas");
            System.out.println("[4] - Registro de Vendas Totais Diárias e Mensais");
            System.out.println("[5] - Sair\n");

            choice = scanner.nextInt();

            switch (choice) {

                case 1: // Total da compra
                    System.out.println("\nInsira o preço do produto: ");
                    value = scanner.nextFloat();

                    System.out.println("Insira a quantidade de produtos: ");
                    quantity = scanner.nextFloat();

                    do {
                        System.out.println("Insira o dia da venda: (1 a 30)");
                        day = scanner.nextInt();
                        while (checker1 == true){
                            if (day > 30 || day < 1) {
                            System.out.println("Dia invalido por favor insira entre 1 a 30!\n");
                            } else {
                                checker1 = true;
                            }
                        }

                        day -= 1;

                        System.out.println("Insira o mês da venda: (1 a 12)");
                        month = scanner.nextInt();

                        while (checker2 == true) {
                            
                            if (month > 12 || month < 1) {
                                System.out.println("Mês invalido por favor insira entre 1 a 12!\n");
                            } else {
                                checker2 = true;
                            }
                        }

                        month -= 1;

                    } while (checker1 == true && checker2 == true);
 

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
                    registerDayMonth[day][month] += amount;

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
                
                case 4:
                    System.out.println("Digite 1 para ver as vendas do dia\n");
                    System.out.println("Digite 2 para ver as vendas mensais\n");

                    int choiceCase4 = scanner.nextInt();
                    int chooseDay;
                    int chooseMonth;
                    if (choiceCase4 == 1) {
                        System.out.println("Escolha o dia para ver o total (1 a 30):");
                        chooseDay = scanner.nextInt();
                        chooseDay -= 1;

                        System.out.println("Escolha o mês (1 a 12):");
                        chooseMonth = scanner.nextInt();
                        chooseMonth -= 1;

                        System.out.println("Total do dia " + (chooseDay + 1) + "/" + (chooseMonth + 1));
                        System.out.println(registerDayMonth[chooseDay][chooseMonth]);
                    } else if (choiceCase4 == 2){
                        System.out.println("Escolha o mês (1 a 12):");
                        chooseMonth = scanner.nextInt();
                        chooseMonth -= 1;

                        for (int i = 0; i <= 29; i++){
                            monthAmount += registerDayMonth[i][chooseMonth];
                        }

                        System.out.println("O valor total do mês " + chooseMonth + ":");
                        System.out.println("R$" + monthAmount);
                    }
                break;

                case 5: // Sair
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

