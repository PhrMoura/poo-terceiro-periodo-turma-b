package Atividades;
import java.util.ArrayList;
import java.util.List;

public class Atividadeextra01 {
    private static List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora da Dona Gabrielinha!");
        System.out.println("1. Adicionar pedido");
        System.out.println("2. Calcular preço total");
        System.out.println("3. Calcular troco");
        System.out.println("4. Total de vendas");
        System.out.println("5. Sair");

        int opcao = 1;

        switch (opcao) {
            case 1:
                adicionarPedido(12, 50.0);
                break;
            case 2:
                calcularPrecoTotal();
                break;
            case 3:
                calcularTroco();
                break;
            case 4:
                System.out.println("Total de vendas: " + getTotalVendas());
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void adicionarPedido(int quantidade, double precoUnitario) {
        pedidos.add(new Pedido(quantidade, precoUnitario));
        System.out.println("Pedido adicionado com sucesso!");
    }

    private static void calcularPrecoTotal() {
        double total = pedidos.stream()
                .mapToDouble(pedido -> pedido.getQuantidade() * pedido.getPrecoUnitario())
                .sum();
        System.out.println("O preço total é: " + total);
    }

    private static void calcularTroco() {
        double valorCompra = 30.0;
        double valorPago = 50.0;
        double troco = valorPago - valorCompra;
        System.out.println("O troco é: " + troco);
    }

    public static double getTotalVendas() {
        return pedidos.stream()
                .mapToDouble(pedido -> pedido.getQuantidade() * pedido.getPrecoUnitario())
                .sum();
    }

    private static class Pedido {
        private int quantidade;
        private double precoUnitario;

        public Pedido(int quantidade, double precoUnitario) {
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public double getPrecoUnitario() {
            return precoUnitario;
        }
    }
}