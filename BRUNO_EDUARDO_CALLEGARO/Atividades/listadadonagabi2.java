package Atividades;
public class listadadonagabi2 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora da Dona Gabrielinha!");
        System.out.println("1. Calcular preço total");
        System.out.println("2. Calcular troco");
        System.out.println("3. Sair");

        int opcao = 1; 

        switch (opcao) {
            case 1:
                int quantidade = 12; 
                double precoUnitario = 50.0; 
                calcularPrecoTotal(quantidade, precoUnitario);
                break;
            case 2:
                calcularTroco();
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void calcularPrecoTotal(int quantidade, double precoUnitario) {
        double precoTotal;

        if (quantidade > 10) {
            double desconto = precoUnitario * quantidade * 0.05; 
            precoTotal = quantidade * precoUnitario - desconto;
        } else {
            precoTotal = quantidade * precoUnitario;
        }

        System.out.println("O preço total é: " + precoTotal);
    }

    private static void calcularTroco() {
        double valorCompra = 30.0;
        double valorPago = 50.0; 

        double troco = valorPago - valorCompra;
        System.out.println("O troco é: " + troco);
    }

    public static double getTotalVendas() {
        return getTotalVendas();

    }

    }

