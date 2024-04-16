package Atividades;
public class listadadonagabrielinha {

    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora da dona gabrielinha!");
        System.out.println("1. Calcular preço total");
        System.out.println("2. Calcular troco");
        System.out.println("3. Sair");

        int opcao = 1;

        switch (opcao) {
            case 1:
                calcularPrecoTotal();
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
    private static void calcularPrecoTotal() {
        int quantidadeItens = 8;  
        double valorUnitario = 50.0; 

        double precoTotal = quantidadeItens * valorUnitario;
        System.out.println("O preço total é: " + precoTotal);
    }

    private static void calcularTroco() {
        double valorCompra = 30.0; 
        double valorPago = 5.0;  

        double troco = valorPago - valorCompra;
        System.out.println("O troco é: " + troco);
    }
}

