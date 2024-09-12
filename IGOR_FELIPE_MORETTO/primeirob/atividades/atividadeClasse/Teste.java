package primeirob.atividades.atividadeclasse;


public class Teste {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Yuri Alberto", 20);
        Cliente clienteDois = new Cliente("Cássio", 35);
        Cliente clienteTres = new Cliente("Fagner", 48);
        Loja loja = new Loja();
        Vendedor vendedor = new Vendedor();
        Item item = new Item();
        Gerente gerente = new Gerente();
        Pedido pedido = new Pedido();
        ProcessaPedido procPedido = new ProcessaPedido();
        

        vendedor.nome = "Roger Guedes";
        vendedor.idade = 18;
        vendedor.bairro = "São José Operário";
        vendedor.cidade = "Capanema";
        vendedor.rua = "Tamoios";
        vendedor.loja = loja ;
        loja.contadorVendedor++;
        
        vendedor.apresentarse();

        System.out.println("Cliente: " + cliente.nome + " com " + cliente.idade + " anos");
        loja.contadorCliente++;
        System.out.println("Cliente: " + clienteDois.nome + " com " + clienteDois.idade + " anos");
        loja.contadorCliente++;
        System.out.println("Cliente: " + clienteTres.nome + " com " + clienteTres.idade + " anos");
        loja.contadorCliente++;

        loja.nomeFantasia = "Myy Plant";
        loja.razaoSocial = "Floricultura Dona Gabrielinha LTDA.";
        loja.bairro = "Parque Verde";
        loja.cidade = "Cascavel - PR";
        loja.cnpj = "00.000.000/0001-01";
        loja.numero = 1010;
        loja.complemento = "Casa A";
        loja.rua = "Avenida da Torres";

        loja.apresentarLogradouro();
        loja.contarClientes();
        loja.contarVendedores();

        gerente.nome = "Neymar";
        gerente.idade = 32;
        gerente.loja = loja;

        gerente.apresentarse();

        //pedido.calcularValorTotal();
        //pedido.gerarDescricaoVenda();

        procPedido.cadastrarItem();
        procPedido.processar();
        procPedido.confirmarPagamento();

        System.out.println(item.getId());
        System.out.println(item.getNome());
        System.out.println(item.getTipo());
        System.out.println(item.getValor());
    }
}
