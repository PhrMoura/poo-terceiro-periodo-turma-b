import java.util.Date;
import java.util.List;

public class ProcessaPedido {

    private Integer ids = 0;

    public Pedido processar(Cliente cliente, Vendedor vendedor, List<Item> items) {

        var pedido = new Pedido(ids++, cliente, vendedor, items);

        confirmarPagamento(pedido);

        return pedido;

    }

    public void confirmarPagamento(Pedido pedido) {
        pedido.setDataPagamento(new Date());
    }
}
