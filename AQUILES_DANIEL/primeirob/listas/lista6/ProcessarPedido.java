package primeirob.listas.lista6;

import java.util.Date;

public class ProcessarPedido {
  public Pedido processar(Cliente cliente, Vendedor vendedor) {
    Pedido pedido = new Pedido(cliente, vendedor);
    return pedido;
  }

  public void cofirmarPagamento(Pedido pedido) {
    pedido.setDataPagamento(new Date());
  }

}
