package primeirob.setimaatividade;

import java.util.Date;
import java.util.List;

public class Processos {

    private Integer idItem = 0, idPedido = 0;

    public Pedido processarPedido (Cliente cliente, Vendedor vendedor, Loja loja, List<Item> item) {
       Pedido pedido = new Pedido(idPedido++, cliente, vendedor, loja, item);

       return pedido;
    }

    public Item processarItem(String nome, String tipo, double valor) {
        Item item = new Item(idItem++, nome, tipo, valor);

        return item;
    }

    public void confirmarPagamento (Pedido pedido) {
        pedido.setDataPagamento(new Date());
    }


    
}
