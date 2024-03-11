package primeirob.AtividadeUm;

import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {

        System.out.println("Bem vindo a lojinha da Dona Gabrielinha");

        System.out.println("quantas plantas voce vai querer?");
        Scanner input = new Scanner(System.in);
        int Plantas = input.nextInt();
        
        System.out.println("quanto custa a planta?");
        float Custo = input.nextFloat();
        
        System.out.println("Quantos reais foi recebido?");
        float Recebido = input.nextFloat();
        
        
        System.out.println("OPÇÃO [1] Calcular o preço total");
        System.out.println("OPÇÃO [2] Calcular o Troco");
        System.out.println("OPÇÃO [3] Sair");
        
        float subtotal = Plantas * Custo;
        float troco = Recebido - subtotal;
        
        Scanner scanner = new Scanner(System.in);
        int opcao = input.nextInt();

        if (opcao == 1) {
            System.out.println("Valor total: " + subtotal);
        }
        if (opcao == 2) {
            System.out.println("Troco: " + troco);
        }
        if (opcao == 3 ) {
            System.out.println("Volte sempre :)");
        }
    }
}
