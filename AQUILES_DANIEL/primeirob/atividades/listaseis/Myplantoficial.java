package primeirob.atividades.listaseis;

import java.util.Date;

public class Myplantoficial {
  public static void main(String[] args) {
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

    gerenteUm.apresentarLogradouro();
    System.out.println("- Media salarial: " + gerenteUm.calcularMedia());
    System.out.println("- Bonus: " + gerenteUm.calcularBonus());

    System.out.println("------------------------------");

    gerenteUm.apresentarse();

    System.out.println("------------------------------");

    Item itemUm = new Item();
    Item itemDois = new Item();
    itemUm.valor = 25;
    itemDois.valor = 75;

    ProcessarPedido processador = new ProcessarPedido();

    // Inicializando os campos do objeto Pedido
    Pedido pedido = new Pedido();
    pedido.dataCriacao = new Date(); // Defina uma data de criação válida
    pedido.dataVencimentoReserva = new Date(); // Defina uma data de vencimento válida

    // Processando o pedido e recebendo o objeto Pedido resultante
    Pedido pedidoProcessado = processador.processar(pedido);

  }
}
