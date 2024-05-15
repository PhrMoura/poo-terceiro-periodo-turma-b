package primeirob.listaSeis;

public class teste {
    public static void main(String[] args) {

        // Cliente
        System.out.println("------ CLIENTES ------\n");
        Endereco enderecoClienteUm = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 01");
        Cliente clienteUm = new Cliente("Larissa", 19, enderecoClienteUm);

        Endereco enderecoClienteDois = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 02");
        Cliente clienteDois = new Cliente("Matheus", 30, enderecoClienteDois);

        Endereco enderecoClienteTres = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 03");
        Cliente clienteTres = new Cliente("Pedro", 23, enderecoClienteTres);

        clienteUm.apresentarse();
        System.out.println();
        clienteDois.apresentarse();
        System.out.println();
        clienteTres.apresentarse();


        // Vendedor
        System.out.println("\n\n------ VENDEDORES ------\n");
        Endereco enderecoVendedorUm = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 04");
        Vendedor vendedorUm = new Vendedor("José" , 30 , "MyyPlant", 1800, enderecoVendedorUm);

        Endereco enderecoVendedorDois = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 05");
        Vendedor vendedorDois = new Vendedor("Fernanda" , 29 , "MyyPlant", 1800, enderecoVendedorDois);

        Endereco enderecoVendedorTres = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 06");
        Vendedor vendedorTres = new Vendedor("Luiza" , 26 , "MyyPlant", 1800, enderecoVendedorTres);

        vendedorUm.apresentarse();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();
        System.out.println();
        vendedorDois.apresentarse();
        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();
        System.out.println();
        vendedorTres.apresentarse();
        vendedorTres.calcularMedia();
        vendedorTres.calcularBonus();
        System.out.println();


        // Gerente
        System.out.println("\n\n------ GERENTES ------\n");

        Endereco enderecoGerenteUm = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 07");
        Gerente gerenteUm = new Gerente("Jessica", 36, "MyyPlant", 2400, enderecoGerenteUm);

        Endereco enderecoGerenteDois = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 08");
        Gerente gerenteDois = new Gerente("Jessica", 36, "MyyPlant", 2400, enderecoGerenteDois);

        Endereco enderecoGerenteTres = new Endereco("Getúlio Vargas", 2230, "Cidade Alta", "Medianeira", "PR", "Apartamento 09");
        Gerente gerenteTres = new Gerente("Jessica", 36, "MyyPlant", 2400, enderecoGerenteTres);

        gerenteUm.apresentarse();
        gerenteUm.calcularMedia();
        gerenteUm.calcularBonus();
        System.out.println();
        gerenteDois.apresentarse();
        gerenteDois.calcularMedia();
        gerenteDois.calcularBonus();
        System.out.println();
        gerenteTres.apresentarse();
        gerenteTres.calcularMedia();
        gerenteTres.calcularBonus();


        // Pedido
        System.out.println("\n\n------ Pedido ------\n");

        Item itemUm = new Item(01, "Samambaia", "Planta", 10);

        ProcessarPedido processaPedido = new ProcessarPedido();
        Pedido pedido = processaPedido.processar(clienteTres, vendedorTres, new Item[] {itemUm});

        processaPedido.confirmarPagamento(pedido);
        System.out.println(pedido.dataPagamento);

        itemUm.gerarDescricao();

    }
}
