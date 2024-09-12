package poo.ListaSete;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SistemaDaLoja {
    static int idItensCriados;
    static Date dataAtual = new Date();
    static long umDia = 86400000;
    static ProcessaPedido processaPedido = new ProcessaPedido();

    // static ArrayList<Item> itens ;
    public static void main(String[] args) {
        Endereco novoEndereco = new Endereco(null, null, null, null, null, null);
        Scanner entradaTeclado = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        Vendedor novoVendedor = new Vendedor();
        Gerente novoGerente = new Gerente();
        Loja novLoja = new Loja(null, null, null, null, null, null);
        Pedido pedidoCriado = new Pedido(1, novoCliente, novoVendedor, null);

        novoEndereco.setBairro("Centro");
        novoEndereco.setCidade("Palotina");
        novoEndereco.setComplemento("do lado ");
        novoEndereco.setEstado("Paraná");
        novoEndereco.setNumero("1234");
        novoEndereco.setRua("AV. presidente KND");

        novoVendedor.setNome("yan");
        novoVendedor.setIdade(21);

        novoCliente.setNome("nice");
        novoCliente.setIdade(42);

        novoGerente.setNome("Maciel");
        novoGerente.setIdade(40);

        novLoja.setNomeFantasia("MY Plant");
        novLoja.setRazaoSocial("minhas plantas S.a");
        novLoja.setCnpj("999 999 999-99");

        novLoja.setEndereco(novoEndereco);
        novoGerente.setEndereco(novoEndereco);
        novoCliente.setEndereco(novoEndereco);

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("[1] - Criar Pedido");
            System.out.println("[2] - Listar itens");
            // System.out.println("[3] - Processar Pedido");
            System.out.println("[4] - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entradaTeclado.nextInt();

            switch (opcao) {
                case 1:
                    pedidoCriado = criaPedido(entradaTeclado);
                    break;
                case 2:
                    listarItens(entradaTeclado, pedidoCriado);
                    break;
                case 3:
                    // processaPedidoacao(entradaTeclado, pedidoCriado);
                    break;
                case 4:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        entradaTeclado.close();
    }

    public static Item criarItem(Scanner scanner) {
        Item novoItem = new Item(idItensCriados, null, null, null);

        idItensCriados += 1;
        novoItem.setId(idItensCriados);
        novoItem.setTipo("tipoPredefinido");

        System.out.println("digite o nome do item: ");
        novoItem.setNome(scanner.next());
        System.out.println("digite o valor do produto:");
        novoItem.setValor(scanner.nextDouble());
        return novoItem;
    }

    // public static void processaPedidoacao(Scanner scanner, Pedido criadoPedido) {
    //     processaPedido.cofirmarPagamento(criadoPedido);
    // }

    public static void listarItens(Scanner scanner, Pedido criadoPedido) {

    }

    public static Pedido criaPedido(Scanner scanner) {
        Pedido novoPedido = new Pedido(idItensCriados, null, null, null);

        int acao;

        novoPedido.setId(1);

        do {
            System.out.println("Menu:");
            System.out.println("[1] - adicionar Item");
            System.out.println("[2] - calcula valor total");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    novoPedido.setItens(criarItem(scanner));
                    break;
                case 2:
                    System.out.println(novoPedido.calcularValorTotal());
                    break;
                case 3:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (acao != 3);

        return novoPedido;

    }
}
