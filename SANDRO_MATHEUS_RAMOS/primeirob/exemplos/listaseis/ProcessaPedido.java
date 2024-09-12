package primeirob.exemplos.listaseis;

import java.util.Date;

public class ProcessaPedido {

    private Integer ids = 0;

    public Pedido processar(Cliente cliente,
            Vendedor vendedor, Item[] itens) {

        Pedido pedido = new Pedido(ids++, cliente,
                vendedor, itens);

        return pedido;
    }

    public void cofirmarPagamento(Pedido pedido) {
        pedido.setDataPagamento(new Date());
    }

}
