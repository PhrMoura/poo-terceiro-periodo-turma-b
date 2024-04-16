package primeirob.ListaCinco;

public class SoftwareExecutavel {
    public static void main(String[] args) {
        
        Cliente clienteUm = new Cliente("José", 28);
        Cliente clienteDois = new Cliente("Ana", 23);
        Cliente clienteTres = new Cliente("Roberto", 28);
        
        clienteUm.apresentarse();
        clienteDois.apresentarse();
        clienteTres.apresentarse();

        System.out.println();

        Vendedor vendedorUm = new Vendedor("Jhonny", 22, "MyPlant");
        Vendedor vendedorDois = new Vendedor("Mariana", 23, "MyPlant");
        Vendedor vendedorTres = new Vendedor("Sasha", 24, "MyPlant");

        vendedorUm.apresentarSe();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();

        vendedorDois.apresentarSe();
        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();

        vendedorTres.apresentarSe();
        vendedorTres.calcularMedia();
        vendedorTres.calcularBonus();

        System.out.println();

        Loja lojaMyPlant = new Loja("MyPlant", 444444444, "Cascavel", "Centro", "Av. Brasil");
        
        lojaMyPlant.adicionarCliente(vendedorUm);
        lojaMyPlant.adicionarCliente(vendedorUm);
        lojaMyPlant.adicionarCliente(vendedorUm);

        lojaMyPlant.adicionarVendedor(clienteUm);
        lojaMyPlant.adicionarVendedor(clienteDois);
        lojaMyPlant.adicionarVendedor(clienteTres);

        lojaMyPlant.apresentarse();
        System.out.println("Número de Clientes da loja" + lojaMyPlant.contarClientes());
        System.out.println("Número de Vendedores da loja" + lojaMyPlant.contarVendedores());

    }
    
}
