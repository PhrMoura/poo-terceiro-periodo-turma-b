package primeirob.atividades.listaseis;

import java.util.Date;

public class Myplantoficial {
  public static void main(String[] args) {
    // Classe de gerente //
    System.out.println("------------------------------");
    Gerente gerenteUm = new Gerente();
    gerenteUm.rua = "Pioneiros";
    gerenteUm.bairro = "Santa";
    gerenteUm.cidade = "Cvel";
    gerenteUm.numero = 4587;
    gerenteUm.complemento = "Casa verde cacto";

    gerenteUm.nome = "Aquiles";
    gerenteUm.idade = 21;
    gerenteUm.loja = "myplant";

    gerenteUm.salarioRecebido[0] = 2500;
    gerenteUm.salarioRecebido[1] = 2400;
    gerenteUm.salarioRecebido[2] = 2600;

    gerenteUm.salarioBase = 2000;
    gerenteUm.apresentarse();

    System.out.println("Media salarial: " + gerenteUm.calcularMedia());
    System.out.println("Bonus: " + gerenteUm.calcularBonus());

    // Classe de endereço //
    System.out.println("------------------------------");

    gerenteUm.apresentarLogradouro();

    // Classe de item //
    System.out.println("------------------------------");

    Item itemUm = new Item();
    itemUm.id = 8;
    itemUm.nome = "Girassol";
    itemUm.tipo = "Planta";
    itemUm.valor = 75;

    Item itemDois = new Item();
    itemDois.id = 9;
    itemDois.nome = "Rosa";
    itemDois.tipo = "Planta";
    itemDois.valor = 100;

    itemUm.gerarDescricao();
    itemDois.gerarDescricao();

    // Classe de pedido //
    System.out.println("------------------------------");

    Pedido pedido = new Pedido();
    pedido.dataCriacao = new Date();
    pedido.dataVencimentoReserva = new Date(pedido.dataCriacao.getTime() + (3 * 86400000));

    pedido.adicionarItem(itemUm);
    pedido.adicionarItem(itemDois);

    System.out.println("Data de vencimento: " + pedido.dataVencimentoReserva);

    pedido.gerarDescricaoVenda();

    // Classe de processaPedido //
    System.out.println("------------------------------");

    ProcessarPedido processador = new ProcessarPedido();
    Pedido pedidoProcessado = processador.processar(pedido);

    System.out.println("Data de pagamento da reserva: " + pedido.dataPagamento);

  }
}
