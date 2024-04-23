package poo.ListaSete;

import java.util.ArrayList;
import java.util.Date;

public class ProcessaPedido {
    private Date dataAtual = new Date();
    private Integer ids = 0;

    public Pedido processar(Cliente cliente,
            Vendedor vendedor, ArrayList<Item> itens) {

        Pedido pedido = new Pedido(ids++, cliente,
                vendedor, itens);

        return pedido;
    }

    public void cofirmarPagamento(Pedido pedido) {
        if (dataAtual.getTime() > pedido.getDataVencimentoReserva().getTime()) {
            System.out.println("Vencido!!");
        } else {
            pedido.setDataPagamento(new Date());
        }
    }
}
