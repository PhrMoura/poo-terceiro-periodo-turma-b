package primeirob;
import java.util.Scanner;

public class LojaDonaGabriela {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bem vindo(a) à floricultura da dona Gabriela!");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Calcular valor da venda.\n2- Calcular troco.\n3- Registrar venda.\n4- Sair.");
            System.out.println("Opção desejada: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Insira a quantidade de plantas: ");
                int quantPlanta = input.nextInt();
                System.out.println("Insira o valor da planta: ");
                float valorPlanta = input.nextFloat();
                double valorTotal = quantPlanta * valorPlanta;
                if (quantPlanta > 10) {
                    double desconto = (valorTotal * 0.05);
                    valorTotal = (valorTotal - desconto);
                    System.out.println("\nVocê recebeu um desconto de 5%!");
                }
                System.out.println("\nValor total da venda: R$" + valorTotal + "\n\n");
                break;
                
                case 2:
                System.out.println("Insira o valor recebido pelo cliente: ");
                double valorRecebido = input.nextDouble();
                System.out.println("Insira o valor total da compra: ");
                valorTotal = input.nextDouble();
                if (valorRecebido < valorTotal) {
                    System.out.println("\nAtenção! O valor recebido pelo cliente é insuficiente.\n");
                } else {
                    double valorTroco = (valorRecebido - valorTotal);
                    System.out.println("\nO valor a ser retornado é de: R$" + valorTroco + "\n\n");
                }
                break;

                case 3:
                double[] vetor = new double[99];
                System.out.println("Insira o valor da venda a ser registrado:");
                valorTotal = input.nextDouble();
                vetor[0] = valorTotal;
                System.out.println("\nValor registrado: R$" + vetor[0] + "\n\n");
                break;
    
                case 4:
                System.out.println("\nObrigada!");
                break;

                default:
                System.out.println("Opção inválida.");
                break;
            }

        } while (opcao != 4);
        input.close();
    }
}