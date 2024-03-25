package primeirob.exemplos;

import java.util.Scanner;

public class CalculadoraDaGabrielinha {
    static double [] registroDeVendas = new double [3];
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Olá Gabrielinha! O que você deseja fazer?");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Registro de vendas");
            System.out.println("[4] - Fechar sistema");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(entrada);
                    break;
                case 2:
                    calcularTroco(entrada);
                    break;
                case 3:
                    System.out.println("Registro de vendas: ");
                    for (int linha = 0; linha < registroDeVendas.length; linha++) {
                        System.out.println(registroDeVendas[linha]);
                        
                    }
                    break;
                case 4:
                    System.out.println("Até a próxima!\nEncerrando sitema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        entrada.close();
    }

    public static void calcularPrecoTotal(Scanner entrada) {
        System.out.print("Digite a quantidade de planta: ");
        int quantidade = entrada.nextInt();
        System.out.print("Digite o preço unitário da planta: R$");
        double precoUnitario = entrada.nextDouble();
        double total = quantidade * precoUnitario;
        System.out.println("Calculando valor total...");
        System.out.println("Preço total: R$" + total);

        registroDeVendas[2] = quantidade;

        if (quantidade >= 10) {
            System.out.println("===============================================");
            System.out.println("Desconto de 5% aplicado!");
            double desconto =  total - (total * 0.05);
            System.out.println("Preço total com desconto: R$" + desconto);
            System.out.println("===============================================");
            registroDeVendas[0] = desconto;
            registroDeVendas[1] = total;
        }else{
            System.out.println("===============================================");
            System.out.println("Nenhum desconto aplicado!");
            System.out.println("===============================================");
            registroDeVendas[1] = total;
        }


    }
    public static void calcularTroco(Scanner entrada) {
        System.out.print("Digite o valor recebido pelo cliente: ");
        double valorRecebido = entrada.nextDouble();
        System.out.print("Digite o valor total da compra: ");
        double valorCompra = entrada.nextDouble();
        double troco = valorRecebido - valorCompra;
        System.out.println("Troco: " + troco);
    }

}

