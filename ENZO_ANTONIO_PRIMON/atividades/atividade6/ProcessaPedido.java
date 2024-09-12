package atividades.atividade6;

import java.util.ArrayList;
import java.util.Date;

public class ProcessaPedido {

    private Integer ids = 0;

    public Pedido processar(Cliente cliente, Vendedor vendedor, ArrayList<Item> listaItens) {

        Pedido pedido = new Pedido(ids++, cliente, vendedor, listaItens);

        return pedido;
    }

    public void cofirmarPagamento(Pedido pedido) {
        pedido.setDataPagamento(new Date());
    }

}
