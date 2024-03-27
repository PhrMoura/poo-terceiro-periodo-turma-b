package lista2;

import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {

        static float[][] vendas = new float[99][4];
        static int indiceVenda = 0;

        System.out.println("Menu:");
        System.out.println("1: Calcular preço total");
        System.out.println("2: Calcular troco");
        System.out.println("3: Mostrar registro de vendas");
        System.out.println("4: Sair");
        System.out.print("Escolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
    

        switch (opcao) {
            case 1:
                 float valorTotal = calcularValor(0);
                 if (indiceVenda > 10) {
                 valorTotal = aplicarDesconto(valorTotal);
            }
            break;
            case 2:
                calcularTroco(0);
                break;
            case 3:
                mostrarRegistroVendas();
                break;
            case 4:
                sair();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida.");
        }
    }

    public static float calcularValor(float valorTotal) {

        System.out.println("Informe a quantidade a ser vendida: ");
        Scanner scanner = new Scanner(System.in);
        float quantidade = scanner.nextFloat();
        System.out.println("Agora informe o valor da planta:");
        float valor = scanner.nextFloat();
        valorTotal = valor * quantidade;
        System.out.println("O valor total da compra será de: R$ " + valorTotal);

        vendas[indiceVenda][0] = quantidade;
        vendas[indiceVenda][1] = valor;
        vendas[indiceVenda][2] = valorTotal;
        vendas[indiceVenda][3] = 0;

        indiceVenda++;

        scanner.close();
        return valorTotal;
    }

    public static float calcularTroco(float valorTroco) {

        System.out.println("Informe o valor total:");
        Scanner scanner = new Scanner(System.in);
        float valorTotal = scanner.nextFloat();
        System.out.println("Agora informe o valor pago:");
        float valorPago = scanner.nextFloat();

        valorTroco = valorPago - valorTotal;

        while (valorTroco % 5 != 0) {
            valorTroco++;
        }

        System.out.println("Valor do troco a ser recebido: R$ " + valorTroco);

        scanner.close();
        return valorTroco;
    }

    public static void mostrarRegistroVendas() {
        System.out.println("Registro de Vendas:");
        System.out.println("Quantidade | Valor Unitário | Valor Total | Desconto");
        for (int i = 0; i < indiceVenda; i++) {
            System.out.println(vendas[i][0] + " | " + vendas[i][1] + " | " +
                    vendas[i][2] + " | " + vendas[i][3]);
        }
    }

    public static void sair() {
        System.exit(0);
    }

    public static float aplicarDesconto(float valorTotal) {
        float desconto = valorTotal * 0.05f;
        valorTotal -= desconto;

        vendas[indiceVenda - 1][2] = valorTotal;
        vendas[indiceVenda - 1][3] = desconto;

        return valorTotal;
    }

    public static void sair() {
        System.exit(0);
    }
    }
    
}
