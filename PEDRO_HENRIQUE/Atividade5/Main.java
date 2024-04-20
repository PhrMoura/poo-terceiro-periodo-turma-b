package Atividade5;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("João", 30, "Myy Plant", "São Paulo", "Centro", "Rua A", 2000);
        Vendedor vendedor2 = new Vendedor("Maria", 25, "Myy Plant", "São Paulo", "Centro", "Rua A", 2200);

        Cliente cliente1 = new Cliente("Pedro", 40, "São Paulo", "Centro", "Rua B");
        Cliente cliente2 = new Cliente("Ana", 35, "São Paulo", "Centro", "Rua C");

        Loja loja = new Loja("Myy Plant", "Razão Social da Myy Plant", "123456789", "São Paulo", "Centro", "Rua Principal");

        loja.adicionarVendedor(vendedor1);
        loja.adicionarVendedor(vendedor2);
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);

        loja.apresentarse();

        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());
        System.out.println("Quantidade de clientes: " + loja.contarClientes());

        System.out.println("\nVendedores:");
        for (Vendedor vendedor : loja.getVendedores()) {
            vendedor.apresentarse();
            System.out.println("Média de salários recebidos: " + vendedor.calcularMedia());
            System.out.println("Bônus: " + vendedor.calcularBonus());
            System.out.println();
        }

        System.out.println("\nClientes:");
        for (Cliente cliente : loja.getClientes()) {
            cliente.apresentarse();
            System.out.println();
        }
    }
}
