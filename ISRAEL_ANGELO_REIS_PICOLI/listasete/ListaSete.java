package listasete;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaSete {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Item> itensLista = new ArrayList<>();

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

        ProcessaPedido processaPedido = new ProcessaPedido();
        Pedido pedido = null;

        int opcao;
        do {
            System.out.println("\nMenu admin:"); // Menu
            System.out.println("[1] - Cadastrar item");
            System.out.println("[2] - Listar itens");
            System.out.println("[3] - Exibir dados dos funcionários e clientes");

            System.out.println("----------------------------------");

            System.out.println("Menu cliente:");
            System.out.println("[4] - Selecionar plantas e quantidade");
            System.out.println("[5] - Exibir dados do pedido");
            System.out.println("[6] - Confirmar pagamento\n");

            System.out.println("[0] - Sair do menu");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) { // Operação dos itens do menu.
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nome = leitor.nextLine();

                    System.out.println("Digite o tipo do item: ");
                    String tipo = leitor.nextLine();

                    System.out.println("Digite o valor do item: ");
                    double valor = leitor.nextDouble();

                    Item item = new Item(nome, tipo, valor);
                    itensLista.add(item);
                    break;

                case 2: // Lista de itens criados
                    if (!itensLista.isEmpty()) {
                        System.out.println("Lista de itens:\n");
                        for (Item itens : itensLista) {
                            itens.gerarDescricao();
                        }
                    } else {
                        System.out.println("Nenhum item foi cadastrado no sistema");
                    }
                    break;

                case 3: // Dados dos clientes e funcionários
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
                    break;

                case 4: // Selecionar plantas
                    if (!itensLista.isEmpty()) {
                        System.out.println("Plantas disponíveis para compra:");
                        for (Item itens : itensLista) {
                            itens.gerarDescricao();
                        }
                        System.out.println("Selecione a planta que você quer comprar pela posição do vetor");
                        int posicaoPlanta = leitor.nextInt();

                        System.out.println("Digite a quantidade de plantas que você deseja comprar:");
                        int quantidadePlanta = leitor.nextInt();

                        double valorTotalCompra = itensLista.get(posicaoPlanta).getValor() * quantidadePlanta;

                        double desconto = 0.0;
                        if (quantidadePlanta >= 10) {
                            desconto = valorTotalCompra * 0.05;
                            valorTotalCompra -= desconto;
                        }

                        System.out.println("Valor total da compra: R$" + valorTotalCompra);
                        System.out.println("Desconto aplicado: R$" + desconto);

                        System.out.println("Digite o valor recebido pelo cliente:");
                        double valorRecebido = leitor.nextDouble();

                        double troco = valorRecebido - valorTotalCompra;

                        if (troco >= 0) {
                            System.out.println("Troco: R$" + troco);
                            pedido = processaPedido.processar(cliente, vendedor,
                                    new Item[] { itensLista.get(posicaoPlanta) }, loja,
                                    itensLista.get(posicaoPlanta).getNome(), quantidadePlanta, valorTotalCompra,
                                    desconto, troco);
                        } else {
                            System.out.println("O valor para a compra dos produtos é insuficiente");
                        }
                    } else {
                        System.out.println("Estamos sem plantas no momento");
                    }
                    break;

                case 5: // Descrição do pedido
                    if (pedido != null) {
                        pedido.gerarDescricaoVenda();
                    } else {
                        System.out.println("Nenhum pedido foi criado");
                    }
                    break;
 
                case 6: // Confirmar pagamento
                    if (pedido != null) {
                        processaPedido.confirmarPagamento(pedido);
                    } else {
                        System.out.println("Nenhum pedido foi criado");
                    }
                    break;

                case 0: // Finalizar operação
                    System.out.println("Finalizando..."); // Finalizando o menu.
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
        leitor.close();
    }
}
