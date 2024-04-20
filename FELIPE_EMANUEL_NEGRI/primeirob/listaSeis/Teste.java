package primeirob.listaSeis;

public class Teste {
    public static void main(String[] args) {

        Endereco enderecoCliente = new Endereco("PQP", "Pariuzilandia", "Pariuzinho", 777, "Pqpdemais");

        Cliente cliente = new Cliente();
        cliente.nome = "Doida";
        cliente.idade = 25;
        cliente.endereco = enderecoCliente;

        Endereco enderecoVendedor = new Endereco("PQP", "Pariuzilandia", "Pariuzinho", 777, "Pqpdemais");

        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Doido";
        vendedor.idade = 30;
        vendedor.loja = null;
        vendedor.endereco = enderecoVendedor;
        vendedor.salarioBase = 2000.0;
        vendedor.salarioRecebido = new double[]{1500.0, 1600.0, 1700.0};

        Item item1 = new Item(1, "Planta do cabrunco", "Cabrunquinises", 50.0);
        Item item2 = new Item(2, "Planta da pqp", "Putaqueparienzes", 80.0);
        Item[] itens = {item1, item2};

        Gerente gerente = new Gerente();
        gerente.nome = "Maluco de mais";
        gerente.idade = 35;
        gerente.loja = "myyPlantz";
        gerente.endereco = enderecoVendedor;
        gerente.salarioBase = 3000.0;
        gerente.salarioRecebido = new double[]{2000.0, 2200.0, 2400.0};
        
        System.out.println("Nome: " + gerente.nome);
        System.out.println("Idade: " + gerente.idade);
        System.out.println("Loja: " + gerente.loja);
        System.out.println("Média dos salários recebidos: " + gerente.calcularMedia());
        System.out.println("Bônus do gerente: " + gerente.calcularBonus());

        System.out.println("-------------------");

        enderecoCliente.apresentarLogradouro();
        System.out.println("-------------------");
        enderecoVendedor.apresentarLogradouro();

        System.out.println("-------------------");

        item1.gerarDescricao();

        System.out.println("-------------------");

        item2.gerarDescricao();

        Pedido pedido = new Pedido(1, cliente, vendedor, itens);
        System.out.println("Valor total do pedido: " + pedido.calcularValorTotal());
        System.out.println("-------------------");
        pedido.gerarDescricaoVenda();

        ProcessaPedido.processar(2, cliente, vendedor, itens);
    }
}
