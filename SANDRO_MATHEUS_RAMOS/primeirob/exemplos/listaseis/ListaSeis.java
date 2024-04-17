package primeirob.exemplos.listaseis;

public class ListaSeis {

    public static void main(String[] args) {
        Loja lojaUm = new Loja();

        lojaUm.setNomeFantasia(null);
        lojaUm.setNomeFantasia("Nu Bank");
        lojaUm.setRazaoSocial("Nu Pagamentos S.A");
        lojaUm.setEndereco(new Endereco());

        Vendedor vendedorUm = new Vendedor();

        vendedorUm.setIdade(23);
        vendedorUm.setNome("Cleber");
        vendedorUm.setSalarioBase(2300d);
        vendedorUm.setLoja(lojaUm);
        vendedorUm.setEndereco(new Endereco());

        Cliente cliente = new Cliente();

        cliente.setIdade(23);
        cliente.setNome("Rafael");
        cliente.setEndereco(new Endereco());

        lojaUm.setVendedores(new Vendedor[] { vendedorUm });
        lojaUm.setClientes(new Cliente[] { cliente });

        ProcessaPedido processaPedido = new ProcessaPedido();

        Item item = new Item();
        item.setNome("Flor bala");
        item.setTipo("Flor");
        item.setValor(15d);
        item.setId(1);

        Pedido pedido = processaPedido.processar(
                cliente, vendedorUm,
                new Item[] { item });

        processaPedido.cofirmarPagamento(pedido);

        System.out.println(pedido.getDataPagamento());
    }

}
