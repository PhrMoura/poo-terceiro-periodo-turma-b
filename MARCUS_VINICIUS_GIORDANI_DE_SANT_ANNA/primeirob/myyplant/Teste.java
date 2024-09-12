package primeirob.myyplant;

import java.util.Date;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Testar Gerente");
            System.out.println("2. Testar Endereço");
            System.out.println("3. Testar Item");
            System.out.println("4. Testar Pedido");
            System.out.println("5. Testar Processa Pedido");
            System.out.println("6. Cadastro de Itens");
            System.out.println("7. Listar Itens");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    testarGerente();
                    break;
                case 2:
                    testarEndereco();
                    break;
                case 3:
                    testarItem();
                    break;
                case 4:
                    testarPedido();
                    break;
                case 5:
                    testarProcessaPedido();
                    break;
                case 6:
                    CadastroItem.cadastrarNovoItem();
                    break;
                case 7:
                    CadastroItem.listarItensCadastrados();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        scanner.close();
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
    
        // Criando um novo item para ser processado junto com o pedido
        Item itemNovo = new Item(3, "Tênis", "Calçados", 99.99f);
    
        // Testando o processamento do pedido com o novo item
        ProcessaPedido processador = new ProcessaPedido();
        processador.processarPedido(pedido, itemNovo, 1); // Supondo que 1 seja a quantidade desse novo item
        processador.testarConfirmarPagamento(pedido);
    }
    
    
}

