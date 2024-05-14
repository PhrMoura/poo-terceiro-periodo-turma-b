package listaseis;

import java.util.Date;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Cliente cliente = new Cliente();

        cliente.setNome("Roberto");
        cliente.setIdade(23);
        cliente.setEndereco(new Endereco("Grécia", "Rio", "Jardim", "Pinheiro", 300, "Caverna"));

        Gerente gerente = new Gerente();

        gerente.setNome("Luiz");
        gerente.setIdade(25);
        gerente.setLoja("Myy Plant");
        gerente.setEndereco(new Endereco("Grécia", "Rio", "Pedras", "Cachoeira", 350, "Topo da Árvore"));
        gerente.setSalarioBase(2000);
        gerente.setSalarioRecebido(new double[] { 2000, 2100, 2150 });

        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Gustavo");
        vendedor.setIdade(22);
        vendedor.setLoja("Myy Plant");
        vendedor.setEndereco(new Endereco("Grécia", "Rio", "Centro", "Lago", 400, "Submerso"));
        vendedor.setSalarioBase(1800);
        vendedor.setSalarioRecebido(new double[] { 1700, 1800, 1850 });

        Loja loja = new Loja();

        loja.setNomeFantasia("Myy Plant");
        loja.setCnpj("71.558.827/0001-63");
        loja.setRazaoSocial("Industrias Plant");
        loja.setVendedores(new Vendedor[] { vendedor });
        loja.setClientes(new Cliente[] { cliente });

        Item item = new Item();

        item.setId(727);
        item.setNome("Rosa");
        item.setTipo("Planta");
        item.setValor(10d);

        Item itemDois = new Item();

        itemDois.setId(728);
        itemDois.setNome("Azul");
        itemDois.setTipo("Planta");
        itemDois.setValor(15d);

        ProcessaPedido processaPedido = new ProcessaPedido();
        Prateleira prateleira = new Prateleira(new Item[] { item, itemDois });

        Pedido pedido = null;

        int opcao = 0;

        while (opcao != 6) { // Menu
            System.out.println("\nMenu:\n");
            System.out.println("[1] - Criar pedido");
            System.out.println("[2] - Confirmar pagamento");
            System.out.println("[3] - Exibir dados do pedido");
            System.out.println("[4] - Exibir dados dos itens");
            System.out.println("[5] - Exibir dados dos funcionários e clientes");
            System.out.println("[6] - Sair\n");

            opcao = leitor.nextInt();

            if (opcao == 1) { // Envia as informações para a criação do pedido.
                pedido = processaPedido.processar(cliente, vendedor, new Item[] { item, itemDois }, loja);

            }

            else if (opcao == 2) { // Confirma o pagamento do pedido
                processaPedido.confirmarPagamento(pedido);
            }

            else if (opcao == 3) { // Printa dados do pedido criado.
                System.out.println("ID do pedido: " + pedido.getId());

                processaPedido.mostrarDatas(pedido);
                System.out.println("Valor total da compra R$ " + pedido.calcularValorTotal());

                if (pedido.getDataPagamento() != null) {
                    if (pedido.getDataPagamento().getTime() < pedido.getDataVencimentoReserva().getTime()) {
                        System.out.println("Data de pagamento: " + pedido.getDataPagamento());
                    } else {
                        System.out.println("O pagamento não foi realizado, data de vencimento cumprida.");
                    }
                } else {
                    System.out.println("Pagamento: Não realizado");
                }
            } else if (opcao == 4) {    // Printa dados dos itens.
                for (Item itens : prateleira.getItens()) {
                    itens.gerarDescricao();
                }
            } else if (opcao == 5) {  // Printa informações dos funcionários e clientes.
                vendedor.apresentarse();
                System.out.println(String.format("Média de salário do vendedor: %.2f", vendedor.calcularMedia()));
                System.out.println(String.format("Bônus do vendedor: %.2f\n", vendedor.calcularBonus()));
                vendedor.getEndereco().apresentarLogradouro();

                System.out.println("\n");
                gerente.apresentarse();
                System.out.println(String.format("Média de salário do gerente: %.2f", gerente.calcularMedia()));
                System.out.println(String.format("Bônus do gerente: %.2f\n", gerente.calcularBonus()));
                gerente.getEndereco().apresentarLogradouro();

                cliente.apresentarse();
                cliente.getEndereco().apresentarLogradouro();
            } else if (opcao == 6) { // Finaliza a operação.
                System.out.println("Finalizando...");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
