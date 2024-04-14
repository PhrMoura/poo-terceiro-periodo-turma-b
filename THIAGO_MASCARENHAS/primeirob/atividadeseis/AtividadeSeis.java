package atividadeseis;

public class AtividadeSeis {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Joao", 30, "Mercado Uniao", "Cascavel", "Santa Simone", "margarida", 2000.0);
        Cliente cliente = new Cliente("Maria", 25, "Corbelia", "Centro", "Aurora");
        Loja loja = new Loja("Mercado Uniao", "MercadoUniao LTDA", 123456789, "Cascavel", "Av. Brasil", "Joao moraes");

        loja.clientes.add(cliente);
        loja.clientes.add(cliente);
        loja.vendedores.add(vendedor);
        loja.vendedores.add(vendedor);

        vendedor.apresentarSe();
        System.out.println("Média dos salários recebidos: " + vendedor.calcularMedia());
        System.out.println("Bônus do vendedor: " + vendedor.calcularBonus());

        cliente.apresentarSe();

        loja.apresentarSe();
        System.out.println("Quantidade de clientes: " + loja.contarClientes());
        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());
    }
}
