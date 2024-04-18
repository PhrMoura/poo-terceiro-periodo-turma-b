package primeirob.atividades.listaseis;

public class ProcessarPedido extends Pedido {
  private Pedido pedido;

  public Pedido processar(Pedido pedido) {
    this.pedido = pedido;
    confirmarPagamento();
    return pedido;
  }

  private void confirmarPagamento() {
    if (pedido.dataCriacao.getTime() >= pedido.dataVencimentoReserva.getTime()) {
      System.out.println("Fora da data!!");
    } else {
      System.out.println("Dentro da data!!");
    }
  }
}
