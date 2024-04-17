package primeirob.listaSeis;

import java.util.Scanner;

public class SoftwareExecutavel {
    
    public static void main(String[] args) {
    
    System.out.println("-------------------------");

    Endereco enderecoClienteUm = new Endereco("Paraná", "Cascavel", "Centro", "Minas Gerais", 694, "Casa");
    Cliente clienteUm = new Cliente("José", 20, enderecoClienteUm);

    Endereco enderecoClienteDois = new Endereco("Paraná", "Cascavel", "Centro", "Minas Gerais", 695, "Casa");
    Cliente clienteDois = new Cliente("Maria", 22, enderecoClienteDois);

    Endereco enderecoClienteTres = new Endereco("Paraná", "Cascavel", "Centro", "Minas Gerais", 696, "Casa");
    Cliente clienteTres = new Cliente("João", 24, enderecoClienteTres);
        
        System.out.println("~ ~ ~ ~ CLIENTES ~ ~ ~ ~");
        clienteUm.apresentarse();
        clienteDois.apresentarse();
        clienteTres.apresentarse();

        System.out.println();

        Endereco enderecoVendedorUm = new Endereco("Paraná", "Cascavel", "Centro", "Minas Gerais", 697, "Casa");
        Vendedor vendedorUm = new Vendedor("Jhonny", 24, "MyPlant", enderecoVendedorUm);

        Endereco enderecoVendedorDois = new Endereco("Paraná", "Cascavel", "Centro", "Minas Gerais", 698, "Casa");
        Vendedor vendedorDois = new Vendedor("Mariana", 26, "MyPlant", enderecoVendedorDois);

        Endereco enderecoVendedorTres = new Endereco("Paraná", "Cascavel", "Centro", "Minas Gerais", 699, "Casa");
        Vendedor vendedorTres = new Vendedor("Guti", 28, "MyPlant", enderecoVendedorTres);

        System.out.println("~ ~ ~ ~ VENDEDORES ~ ~ ~ ~");
        vendedorUm.apresentarSe();
        System.out.println("Média Salarial: R$" + vendedorUm.calcularMedia());;
        System.out.println("Bônus: R$" + vendedorUm.calcularBonus());
        System.out.println("-------------------------");


        vendedorDois.apresentarSe();
        System.out.println("Média Salarial: R$" + vendedorDois.calcularMedia());;
        System.out.println("Bônus: R$" + vendedorDois.calcularBonus());
        System.out.println("-------------------------");

        vendedorTres.apresentarSe();
        System.out.println("Média Salarial: R$" + vendedorTres.calcularMedia());;
        System.out.println("Bônus: R$" + vendedorTres.calcularBonus());
        System.out.println("-------------------------");

        System.out.println();

        Endereco enderecoGerenteUm = new Endereco("Paraná", "Cascavel", "Centro", "Minas Gerais", 697, "Casa");
        Gerente gerenteUm = new Gerente("Sovinha", 48, "MyPlant", null, enderecoGerenteUm);

        gerenteUm.apresentarSe();
        System.out.println("Média Salarial: R$" + gerenteUm.calcularMedia());;
        System.out.println("Bônus: R$" + gerenteUm.calcularBonus());
        System.out.println("-------------------------");

        Endereco enderecoLojaMyPlant = new Endereco("Paraná", "Cascavel", 
        "Centro", "Avenida Brasil", 444, "Loja");
        Loja lojaMyPlant = new Loja("Loja MyPlant", 444444444, enderecoLojaMyPlant);
        
        lojaMyPlant.adicionarVendedor(vendedorUm);
        lojaMyPlant.adicionarVendedor(vendedorDois);
        lojaMyPlant.adicionarVendedor(vendedorTres);

        lojaMyPlant.adicionarCliente(clienteUm);
        lojaMyPlant.adicionarCliente(clienteDois);
        lojaMyPlant.adicionarCliente(clienteTres);

        lojaMyPlant.apresentarse();
        System.out.println("Número de Clientes da loja: " + lojaMyPlant.contarClientes());
        System.out.println("Número de Vendedores da loja: " + lojaMyPlant.contarVendedores());
        System.out.println("-------------------------");


        Scanner input = new Scanner(System.in);
        
        Pedido pedidoUm = new Pedido(null, clienteTres, vendedorTres, null, null);

        System.out.println("Informações para o Pedido:");
        System.out.print("Informe o ID do Pedido: ");
        Integer id = input.nextInt();
        input.nextLine();
    
        pedidoUm.calcularValorTotal();
        pedidoUm.gerarDescricaoVenda();

        System.out.println("Informações para o Processador de Pedido:");
        System.out.print("Informe o ID do Item: ");
        Integer idItem = input.nextInt();
        input.nextLine(); 
        System.out.print("Informe o nome do Item: ");
        String nomeItem = input.nextLine();
        System.out.print("Informe o tipo do Item: ");
        String tipoItem = input.nextLine();
        System.out.print("Informe o valor do Item: ");
        Double valorItem = input.nextDouble();

        ProcessaPedido processadorPedidoUm = new ProcessaPedido(idItem, null, clienteTres, vendedorTres, tipoItem, null);

        input.close();

        processadorPedidoUm.processar(clienteTres, vendedorTres, null);
        processadorPedidoUm.confirmarPagamento(processadorPedidoUm);

    }
}