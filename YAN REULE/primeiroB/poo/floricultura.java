package poo;

import java.util.Scanner; 

public class floricultura {
    static double[] registro = new double[100];

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Registro de Vendas");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entradaTeclado.nextInt();

            switch (opcao) {
                case 1:
                    calcularPrecoTotal(entradaTeclado);
                    break;
                case 2:
                    exibirRegistroVendas();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    public static void calcularPrecoTotal(Scanner scanner) {
        System.out.print("Digite a quantidade da planta vendida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();

        double precoTotal = quantidade * precoUnitario;

        if (quantidade > 10) {
            double desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            System.out.println("Desconto de 5% aplicado.");
        }

        int index = proximoIndiceDisponivel();
        registro[index] = precoTotal;

        System.out.println("O preço total da venda é: " + precoTotal);
    }

    public static int proximoIndiceDisponivel() {
        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void exibirRegistroVendas() {
        boolean vazio = true;
        System.out.println("Registro de Vendas:");
        for (double venda : registro) {
            if (venda != 0) {
                System.out.println("Valor: " + venda);
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("Nenhuma venda registrada.");
        }
    }
}
