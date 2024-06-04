package primeiroB.listaSete;

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


        // Loja
        Endereco enderecoLoja = new Endereco("Acre", 1561, "Ipê", "Medianeira", "PR", "Sala comercial");
        Loja loja = new Loja("MyyPlant" , "MyyPlant LTDA" , "74.920.581/0001-36" , enderecoLoja);
        System.out.println("\n\n------ LOJA  ------\n");
        loja.apresentarse();
        loja.adicionarCliente(clienteUm);
        loja.adicionarCliente(clienteDois);
        loja.adicionarCliente(clienteTres);
        loja.adicionarVendedor(vendedorUm);
        loja.adicionarVendedor(vendedorDois);
        loja.adicionarVendedor(vendedorTres);
        loja.adicionarGerente(gerenteUm);
        loja.adicionarGerente(gerenteDois);
        loja.adicionarGerente(gerenteTres);
        loja.contarCliente();
        loja.contarVendedor();
        loja.contarGerente();


        // Pedido
        System.out.println("\n\n------ Pedido ------\n");

        Item[] itens = {new Item(01, "Samambaia", "Planta", 50.0),
                        new Item(02, "Suculenta", "Planta", 5.0),
                        new Item(03, "Tulipa", "Flor", 25.0)};

        ProcessarPedido processador = new ProcessarPedido();
        Pedido pedido = new Pedido(01, clienteUm, vendedorUm, loja, itens);
        pedido.gerarDescricaoVenda();
        System.out.println("Pedido criado com sucesso!");
        boolean pagamentoConfirmado = processador.confirmarPagamento(pedido);
        if (pagamentoConfirmado) {
            System.out.println("Pagamento confirmado.");
        } else {
            System.out.println("Erro ao confirmar o pagamento. A reserva está vencida.");
        }
    }
}
