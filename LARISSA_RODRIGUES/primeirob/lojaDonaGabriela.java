package primeirob;
import java.util.Scanner;

public class lojaDonaGabriela {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bem vindo(a) à floricultura da dona Gabriela!");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Calcular valor da venda.\n2- Calcular troco.\n3- Sair.");
            System.out.println("Opção desejada: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("\nInsira a quantidade de plantas: ");
                int quantPlanta = input.nextInt();
                System.out.println("Insira o valor da planta: ");
                float valorPlanta = input.nextFloat();
        
                float valorTotal = quantPlanta * valorPlanta;
                System.out.println("\nValor total da venda: R$" + valorTotal + "\n\n");
                break;
                
                case 2:
                System.out.println("\nInsira o valor recebido pelo cliente: ");
                float valorRecebido = input.nextFloat();
                System.out.println("Insira o valor total da compra: ");
                valorTotal = input.nextFloat();
    
                float valorTroco = valorRecebido - valorTotal;
                System.out.println("\nO valor a ser retornado é de: R$" + valorTroco + "\n\n");
                break;
    
                case 3:
                System.out.println("\nObrigada!");
                break;
            }

        } while (opcao != 3);
        input.close();
    }
}
