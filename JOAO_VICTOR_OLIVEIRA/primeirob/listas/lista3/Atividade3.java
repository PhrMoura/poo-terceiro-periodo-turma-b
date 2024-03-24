package estudos.calculadora;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o número de acordo com a operação desejada.");
        System.out.println("1. Calcular Preço Total");
        System.out.println("2. Calcular Troco");
        System.out.println("3. Sair");
        int opcao = entrada.nextInt();

        switch (opcao){

            case 1:
            calcularPrecoTotal();
            break;

            case 2:
            System.out.println("Valor do troco a ser devoldido: R$ "+ calcularTroco());
            break;

            case 3:
            sair();
            break;

            default:
            System.out.println("Informe uma opção válida");
        }
        entrada.close();
    }

    public static void calcularPrecoTotal () {
        Scanner entrada = new Scanner(System.in);
        int quantidade_planta;
        float valor_planta;
        float desconto;
        float preco_desconto;

        System.out.println("Informe a quantidade da planta: ");
        quantidade_planta = entrada.nextInt();
        System.out.println("Agora informe o valor: ");
        valor_planta = entrada.nextFloat();
        entrada.close();
        float preco_total = valor_planta * quantidade_planta;

        if (quantidade_planta >= 10){
            desconto = preco_total / 100 * 5;
            preco_desconto = preco_total - desconto;
            System.out.println("Valor total da compra: R$ "+ preco_total);
            System.out.println("Valor com desconto: R$ "+ preco_desconto);
        }
        else {
            System.out.println("Valor total da compra: R$ "+ preco_total);
        }
    }

    public static float calcularTroco () {
        Scanner entrada = new Scanner(System.in);
        float valor_pago; 
        float preco_total;
        System.out.println("Informe o valor total da compra: ");
        preco_total = entrada.nextFloat();
        System.out.println("Agora informe o valor pago: ");
        valor_pago = entrada.nextInt();
        entrada.close();
        float troco = valor_pago - preco_total;
        return troco;
    }
    
    public static void sair () {
        System.exit(0);
    }
    
}
