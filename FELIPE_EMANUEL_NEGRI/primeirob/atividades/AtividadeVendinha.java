package primeirob.atividadeum;

import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        System.out.println("Bem vindo a lojinha da Dona Gabrielinha");
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        int Plantas = 0;
        double Recebido = 0;
        double subtotal = 0;
        double troco = 0;

        int[] qntPlantas = new int[99];
        double[] vlrVendas = new double[99];
        double[] vlrDesconto = new double[99];

        int i = 0;
        while (opcao != 3) {
            MostraMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Quantas plantas você vai querer?");
                    Plantas = input.nextInt();
                    qntPlantas[i] = Plantas;

                    System.out.println("Quanto custa a planta?");
                    float Custo = input.nextFloat();
                    subtotal = Plantas * Custo;
                    double desconto = 0;
                    if (Plantas >= 10) {
                        desconto = subtotal * 0.05;
                        subtotal = subtotal - desconto;
                        troco = subtotal;
                    } 
                    
                    vlrVendas[i] = subtotal;
                    vlrDesconto[i] = desconto;
                    i++;
                    System.out.println("Valor total: " + subtotal);
                    break;
                case 2:
                    System.out.println("Quantos reais foram recebidos?");
                    Recebido = input.nextFloat();
                    troco = Recebido - subtotal;
                    if (subtotal > Recebido) {
                        System.out.println("Dinheiro insuficiete");
                    } else

                        System.out.println("Troco: " + troco);
                    break;
                case 3:
                    System.out.println("Volte sempre :)");
                    System.out.println("Registro ");
                    break;
                case 5:
                    for (int c = 0; c <= 99; c++) {
                        if (qntPlantas[c] == 0) {
                            break;
                        } else {
                            System.out.println("----------------------");
                            System.out.println("Quantidade de plantas: " + qntPlantas[c]);
                            System.out.println("O valor da venda é: " + vlrVendas[c]);
                            System.out.println("O desconto aplicado é: " +vlrDesconto[c]);
                            System.out.println("----------------------");
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        input.close();
    }

    public static void MostraMenu() {
        System.out.println("|MENU:");
        System.out.println("|OPÇÃO [1] Comprar plantinhas");
        System.out.println("|OPÇÃO [2] Calcular o Troco");
        System.out.println("|OPÇÃO [3] Sair");
        System.out.println("|OPCÃO [5] quantas plantas foi vendida???");
    }

}
