package listas.Lista1CalculadoradaDonaGabrielinha;

import java.util.Scanner;

public class CalculadoraDaDonaGabrielinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int usuario = 0;

        String mensagem = """
                \n*Digite sua opção*
                1- Calcular o preço total
                2- Calcular troco
                3- Sair
                """;

        while (true) {
            System.out.println(mensagem);
            usuario = entrada.nextInt();

            if (usuario == 3) {
                break;
            }

            switch (usuario) {
                case 1:
                    System.out.println("quantidade do mesmo item");
                    int quantidadeItem = entrada.nextInt();

                    System.out.println("Valor do item");
                    double valorItem = entrada.nextDouble();

                    double total = quantidadeItem * valorItem;
                    System.out.println("\nO total é: " + total + " reais\n");
                    break;
                case 2:
                    System.out.println("Valor da conta");
                    double valorConta = entrada.nextDouble();

                    System.out.println("Valor recebido do cliente");
                    double valorRecebido = entrada.nextDouble();

                    double troco = valorRecebido - valorConta;
                    System.out.println("\nTroco do cliente é: " + troco + " reais\n");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.\n");
                    break;
            }
        }
        entrada.close();
        System.out.println("\nSaindo\n");
    }
}