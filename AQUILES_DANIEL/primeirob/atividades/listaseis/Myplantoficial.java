package primeirob.atividades.listaseis;

import java.util.Scanner;

public class Myplantoficial {
  public static void main(String[] args) {
    // Classe de endereço //
    System.out.println("------------------------------");

    Endereco enderecoUm = new Endereco("Cascavel", "Santa cruz", "Rio da paz", 456);

    enderecoUm.apresentarse();

    // Classe de loja //
    System.out.println("------------------------------");

    Loja lojaUm = new Loja();

    lojaUm.setNomeFantasia("MyPlant");
    lojaUm.setRazaoSocial("My Plant Oficial");
    lojaUm.setEndereco(new Endereco());

    lojaUm.apresentarse();

    // Classe de vendedor //
    System.out.println("------------------------------");

    Vendedor vendedorUm = new Vendedor();
    vendedorUm.setNome("Bolsonaro 2077");
    vendedorUm.setIdade(137);
    vendedorUm.setSalarioBase(1000);
    vendedorUm.setLoja(lojaUm);

    vendedorUm.apresentarse();

    lojaUm.setVendedores(new Vendedor[] { vendedorUm });

    // Classe de gerente //
    System.out.println("------------------------------");

    Gerente gerenteUm = new Gerente();
    gerenteUm.setEndereco(new Endereco());

    gerenteUm.setNome("Aquiles");
    gerenteUm.setIdade(20);
    gerenteUm.setLoja(lojaUm);
    gerenteUm.setSalarioBase(3700);

    gerenteUm.apresentarse();

    gerenteUm.salarioRecebido[0] = 2500;
    gerenteUm.salarioRecebido[1] = 2400;
    gerenteUm.salarioRecebido[2] = 2600;

    System.out.println("Media salarial: " + gerenteUm.calcularMedia());
    System.out.println("Bonus: " + gerenteUm.calcularBonus());

    // Classe de cliente //
    System.out.println("------------------------------");

    Cliente clienteUm = new Cliente();
    clienteUm.setNome("Jorge");
    clienteUm.setIdade(24);
    clienteUm.setEndereco(new Endereco());

    clienteUm.apresentarse();

    lojaUm.setClientes(new Cliente[] { clienteUm });

    // Classe de item //

    Item itemUm = new Item(8, "Girassol", "Planta", 75);

    Item itemDois = new Item(9, "Rosa", "Planta", 100);

    // NAO TA PUXANDO OS ITENS
    itemUm.toString();
    itemDois.toString();

    // Classe de pedido //

    ProcessarPedido processarPedido = new ProcessarPedido();

    Pedido pedido = processarPedido.processar(clienteUm, vendedorUm);

    // Classe de processaPedido //
    System.out.println("------------------------------");

    processarPedido.cofirmarPagamento(pedido);

    pedido.getListaItens().add(itemUm);
    pedido.getListaItens().add(itemDois);

    // Menu //
    System.out.println("************************************");
    System.out.println("*               Menu               *");
    System.out.println("************************************");

    Scanner input = new Scanner(System.in);
    int escolha = 0;

    while (escolha != 4) {
      System.out.println("************************************");
      System.out.println("*  1 - Adicionar itens ao pedido   *");
      System.out.println("*  2 - Listar itens                *");
      System.out.println("*  3 - Remover item do pedido      *");
      System.out.println("*  4 - Fazer o pedido              *");
      System.out.println("************************************");

      escolha = input.nextInt();

      if (escolha == 1) {
        System.out.println("Informe o id: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Informe o nome: ");
        String nome = input.nextLine();

        System.out.println("Informe o tipo: ");
        String tipo = input.nextLine();

        System.out.println("Informe o valor:");
        double valor = input.nextDouble();

        Item item = new Item(id, nome, tipo, valor);
        pedido.getListaItens().add(item);

        GerenciarItens cadastrar = new GerenciarItens();
        cadastrar(cadastrar);
      }

      if (escolha == 2) {
        for (Item item : pedido.getListaItens()) {
          System.out.println(item);
        }
        GerenciarItens listar = new GerenciarItens();
        listar(listar);
      }

      if (escolha == 3) {
        System.out.println("Informe o ID do item que deseja remover: ");
        int id = input.nextInt();
        input.nextLine();
        pedido.removerItemPorId(pedido.getListaItens(), id);
      }
      if (escolha == 4) {
        System.out.println("Pedido feito em parceria com qual empresa?");
        System.out.println("1 - BioTechnica");
        System.out.println("2 - Arasaka");
        System.out.println("3 - Militech");

        int escolhaEmpresa = input.nextInt();
        String empresa;

        if (escolhaEmpresa == 1) {
          empresa = "BioTechnica";
          pedido.setEmpresa(empresa);
        }
        if (escolhaEmpresa == 2) {
          empresa = "Arasaka";
          pedido.setEmpresa(empresa);
        }
        if (escolhaEmpresa == 3) {
          empresa = "Militech";
          pedido.setEmpresa(empresa);
        }

        pedido.gerarDescricaoVenda();
        GerenciarItens pedidoFeito = new GerenciarItens();
        pedidoFeito(pedidoFeito);
      }

    }
    System.out.println("Data de pagamento: " + pedido.getDataPagamento());
  }

  public static void cadastrar(Menu implementacao) {
    implementacao.cadastrar();
  }

  public static void listar(Menu implementacao) {
    implementacao.listar();
  }

  public static void pedidoFeito(Menu implementacao) {
    implementacao.pedidoFeito();
  }
}
