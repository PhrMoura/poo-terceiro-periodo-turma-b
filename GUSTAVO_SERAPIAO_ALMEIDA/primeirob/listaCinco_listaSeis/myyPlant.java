package listaCinco_listaSeis;

import java.util.Scanner;
import java.util.Date;

public class myyPlant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Parceiras parceiraUm = new Parceiras();
        parceiraUm.setNome("BioTechnica");

        Parceiras parceiraDois = new Parceiras();
        parceiraDois.setNome("Arasaka");

        Parceiras parceiraTres = new Parceiras();
        parceiraTres.setNome("Militech");


        Loja lojaUm = new Loja();

        lojaUm.setNomeFantasia("myyPlant");
        lojaUm.setRazaoSocial("Myyplant LTDA");
        lojaUm.setEndereco(new Endereco("rua X", "Cidade Y", "Bairro das Flores", "06", "Nenhum"));

        Gerente gerente = new Gerente(null, null, null, null, null, null, null, null);

        gerente.setNome("Prova");
        gerente.setIdade(24);
        gerente.setLoja(lojaUm);
        gerente.setSalarioBase(5200.00d);
        gerente.setEndereco(new Endereco("Rua Jardinagem", "Xique Xique", "Bairro", "05", "Nenhum"));

        Vendedor vendedorUm = new Vendedor(null, 0, null, null, 0);

        vendedorUm.setNome("Mathias");
        vendedorUm.setIdade(26);
        vendedorUm.setSalarioBase(2500.00);
        vendedorUm.setLoja("MyyPlant");
        vendedorUm.setEndereco(new Endereco("Rua x", "Cidade Y", "Bairro das Flores", "15", "Casa"));

        Cliente clienteUm = new Cliente(null, 0);

        clienteUm.setNome("Roberto");
        clienteUm.setIdade(85);
        clienteUm.setEndereco(new Endereco("Rua Batman", "Uberlandia", "Silvio Santos", "15", "Nada"));

        ProcessarPedido processarPedido = new ProcessarPedido();

        Item itemUm = new Item();
        Item itemDois = new Item();
        
        itemUm.setNome("Jabuticabero");
        itemUm.setId(01);
        itemUm.setTipo("Planta");
        itemUm.setValor(15.90d);

        itemDois.setNome("Pé de Acerola");
        itemDois.setId(02);
        itemDois.setTipo("Planta");
        itemDois.setValor(16.90d);

        Pedido pedido = processarPedido.processar(clienteUm, vendedorUm, new Item[] { itemUm, itemDois });

        processarPedido.confirmarPagamento(pedido);
        
        System.out.println(pedido.getDataCriacao());

        int opcaoCase;
        boolean encerrar = false;

        do {
            System.out.println("[1] Vendedor | [2] Cliente");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("[1] Cadastrar Item");
                    System.out.println("[2] Criar Pedido");
                    System.out.println("[3] Visualizar Itens"); //minimo 2 itens
                    System.out.println("[0] Sair");

                    opcaoCase = scanner.nextInt();

                    if (opcaoCase == 0) {
                        encerrar = true;
                    } else if (opcaoCase == 3) {

                    }
                    break;
                
                case 2:
                    System.out.println("[1] Pesquisar Item");
                    System.out.println("[2] Comprar (Item e quantidade)");
                    System.out.println("[3] Confirmar Pagamento");
                    System.out.println("[0] Sair");

                    opcaoCase = scanner.nextInt();

                    if (opcaoCase == 0) {
                        encerrar = true;
                    } else if (opcaoCase == 3){
                        //confirmarPagamento();
                    }
                    break;

                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        } while (encerrar != false); 
    }

    /*private static void cadastrarItem(Scanner scanner, Vendedor vendedor) {
        System.out.println("Digite o nome do item:");
        String nome = scanner.next();

        System.out.println("Digite o tipo do item:");
        String tipo = scanner.next();

        System.out.println("Digite o valor do item:");
        double valor = scanner.nextDouble();
    
        Item item = new Item(nome, tipo, valor); Deu ERRO
        
    
        System.out.println("Item cadastrado com sucesso!");
    }*/

    /*private static void visualizarItens() {
        if (todosItens.length > 0) {
            System.out.println("Itens disponíveis:");
            for (Item item : todosItens) {
                System.out.println(item);
            }
        } else {
            System.out.println("Nenhum item disponível.");
        }
    }                     Erro                       */ 
}
