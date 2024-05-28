package primeiroB.listaSeis;

import java.util.Date;

public class ProcessarPedido{
    int ids = 0;

    public Pedido processar(Cliente cliente, Vendedor vendedor, Item[] itens) {
        Pedido pedido = new Pedido(ids++, cliente, vendedor, itens);
        return pedido;
    }

    public void confirmarPagamento(Pedido pedido) {
        pedido.dataPagamento = new Date();
    }
}
