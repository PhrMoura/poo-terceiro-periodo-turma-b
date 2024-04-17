package primeirob.myyplant;

import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        testarGerente();
        testarEndereco();
        testarItem();
        testarPedido();
        testarProcessaPedido();
    }

    public static void testarGerente() {
        Integer[] salarioBase = {2000, 2500, 2200};
        Integer[] salarioRecebido = {2200, 2300, 2400};
        Loja loja = new Loja("Minha Loja", "Empresa XYZ", "Minha Cidade", "Meu Bairro", "Minha Rua", 123456789);
        Gerente gerente = new Gerente("João", 40, "Minha Cidade", "Meu Bairro", "Minha Rua", loja, salarioBase, salarioRecebido);
        
        System.out.println("Testando Gerente:");
        gerente.apresentarse();
        System.out.println("Média salarial: " + gerente.calcularMedia());
        System.out.println("Bônus: " + gerente.calcularBonus());
        System.out.println();
    }

    public static void testarEndereco() {
        Endereco endereco = new Endereco("SP", "São Paulo", "Centro", 123, "Apto 101");
        
        System.out.println("Testando Endereço:");
        endereco.apresentarLogradouro();
        System.out.println();
    }

    public static void testarItem() {
        Item item = new Item(1, "Camiseta", "Vestuário", 49.99f);
        
        System.out.println("Testando Item:");
        item.gerarDescricao();
        System.out.println();
    }

    public static void testarPedido() {
        // Criando clientes e vendedores para usar no pedido
        Cliente cliente = new Cliente("Maria", 35, "São Paulo", "Centro", "Rua A");
        Vendedor vendedor = new Vendedor("João", 30, "São Paulo", "Centro", "Rua B", null, new Integer[]{2000, 2200, 2400}, new Integer[]{2200, 2300, 2400});
        
        // Criando uma loja para usar no pedido
        Loja loja = new Loja("Minha Loja", "Empresa XYZ", "Minha Cidade", "Meu Bairro", "Minha Rua", 123456789);
        
        // Criando alguns itens para usar no pedido
        ItemPedido item1 = new ItemPedido(new Item(1, "Camiseta", "Vestuário", 29.99f), 2);
        ItemPedido item2 = new ItemPedido(new Item(2, "Calça Jeans", "Vestuário", 59.99f), 1);
        ItemPedido[] itens = {item1, item2};
        
        // Criando uma data para o pedido
        Date dataCriacao = new Date(); // A data atual
        
        // Criando uma instância de Pedido
        Pedido pedido = new Pedido(1, dataCriacao, null, null, cliente, vendedor, loja, itens);
        
        // Testando os métodos da classe Pedido
        System.out.println("Testando Pedido:");
        System.out.println("Valor total do pedido: R$" + pedido.calcularValorTotal());
        System.out.println("Descrição do pedido: " + pedido.gerarDescricaoVenda());
        System.out.println("Confirmação de pagamento: " + pedido.confirmarPagamento());
    }
    
    

    public static void testarProcessaPedido() {
        // Implemente os testes aqui
    }
}
