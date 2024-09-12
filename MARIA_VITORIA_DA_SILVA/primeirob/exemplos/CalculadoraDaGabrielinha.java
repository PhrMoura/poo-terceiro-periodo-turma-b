package primeirob.exemplos;

import java.util.Scanner;

public class CalculadoraDaGabrielinha {
    // static double[] registroDeQuantidade = new double[99]; 
    // static double[] registroDeDesconto = new double[99]; 
    // static double[] registroDePreco = new double[99]; 
    static double[] [] registroDoMes = new double[12][30]; 
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
                    exibirRegistroDeVendas(entrada);
                    // System.out.println("Registro de vendas: ");
                    // System.out.println("Quantidade de plantas vendidas: " + registroDeQuantidade[0]);
                    // System.out.println("Preço total sem desconto: R$" + registroDePreco[1]);
                    // System.out.println("Preço total com desconto: R$" + registroDeDesconto[2]);
                    break;
                case 4:
                    System.out.println("Até a próxima!\nEncerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        entrada.close();
    }

    public static void calcularPrecoTotal(Scanner entrada) {
        System.out.println("Infome o dia da venda: ");
        int dia = entrada.nextInt() -1;
        System.out.println("Infome o mês da venda: ");
        int mes = entrada.nextInt() -1;

        System.out.println("===============================================");
        System.out.print("Digite a quantidade de planta: ");
        int quantidade = entrada.nextInt();
        System.out.print("Digite o preço unitário da planta: R$");
        double precoUnitario = entrada.nextDouble();
        double total = quantidade * precoUnitario;
        System.out.println("Calculando valor total...");
        System.out.println("Preço total: R$" + total);


        // registroDeQuantidade[0] += quantidade; // Armazenar a quantidade de plantas vendidas

        if (quantidade >= 10) {
            System.out.println("===============================================");
            System.out.println("Desconto de 5% aplicado!");
            double desconto = total - (total * 0.05);
            System.out.println("Preço total com desconto: R$" + desconto);
            System.out.println("===============================================");
            // registroDePreco[1] += total; // Armazenar o preço total sem desconto
            // registroDeDesconto[2] += desconto; // Armazenar o preço total com desconto
            registroDoMes[mes][dia] += desconto;
        } else {
            System.out.println("===============================================");
            System.out.println("Nenhum desconto aplicado!");
            System.out.println("===============================================");
            // registroDePreco[1] += total; // Armazenar o preço total sem desconto
            // registroDeDesconto[2] += total; // Se não houver desconto, os dois preços são iguais
            registroDoMes[mes][dia] += total;
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

    public static void exibirRegistroDeVendas(Scanner entrada) {
        System.out.println("Exibindo o registro de vendas:");
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 30; dia++) {
                if (registroDoMes[mes][dia] > 0) {
                    System.out.println("Mês: " + (mes + 1) + ", Dia: " + (dia + 1) + " - Total de vendas: R$" + registroDoMes[mes][dia]);
                }
            }
        }
    }
}
