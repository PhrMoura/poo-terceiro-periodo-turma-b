package primeirob.atividades.listaseis;

import java.util.Date;

public class ProcessarPedido {
  private Pedido pedido;

  public Pedido processar(Pedido pedido) {
    this.pedido = pedido;
    confirmarPagamento();
    return pedido;
  }

  private void confirmarPagamento() {
    if (pedido.dataCriacao.getTime() >= pedido.dataVencimentoReserva.getTime()) {
      System.out.println("Dentro da data!!");
      pedido.dataPagamento = new Date();
    } else {
      System.out.println("Fora da data!!");
    }
  }
}
