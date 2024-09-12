package primeirob.atividades;

import java.util.Scanner;

public class AtividadeVendinha {
    public static void main(String[] args) {
        System.out.println("Bem vindo a lojinha da Dona Gabrielinha");
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        int Plantas = 0;
        double Recebido = 0;
        double subtotal = 0;
        double troco = 0;
        int dia = 0, mes = 0;

        int[] qntPlantas = new int[99];
        double[] vlrVendas = new double[99];
        double[] vlrDesconto = new double[99];
        double[][] diaMes = new double[30][12];

        int i = 0;
        while (opcao != 3) {
            MostraMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o dia e mês da venda? ");
                    dia = input.nextInt();
                    mes = input.nextInt();

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

                    diaMes[dia - 1][mes - 1] += subtotal;
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
                case 4:
                    for (int c = 0; c <= 99; c++) {
                        if (qntPlantas[c] == 0) {
                            break;
                        } else {
                            System.out.println("Quantidade de plantas: " + qntPlantas[c]);
                            System.out.println("O valor da venda é: " + vlrVendas[c]);
                            System.out.println("O desconto aplicado é: " +vlrDesconto[c]);
                            System.out.println("----------------------");
                        }
                    }
                    break;
                case 5: 
                    System.out.println("Qual dia deseja verificar o total vendido? ");
                    dia = input.nextInt();
                    System.out.println("De qual mes? ");
                    mes = input.nextInt();
                    System.out.println("Dia " + dia + " Mês " + mes + " Valor total é " + diaMes[dia - 1][mes - 1]);
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
        System.out.println("|OPCÃO [4] Quantas plantas foi vendida?");
        System.out.println("|OPCÃO [5] Em que dia foi feito a compra?");
    }

}
