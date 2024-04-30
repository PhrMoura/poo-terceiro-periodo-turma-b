package a;

import java.util.Date;

public class ProcessaPedido {
    public void processar(int id, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, String cliente, String vendedor, String loja, Item[] itens) {
        Pedido pedido = new Pedido(id, dataCriacao, dataPagamento, dataVencimentoReserva, cliente, vendedor, loja, itens);
        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (pedido.dataVencimentoReserva.after(dataAtual)) {
            System.out.println("Pagamento confirmado!");
        } else {
            System.out.println("Reserva vencida, pagamento não confirmado.");
        }
    }


    public static void main(String[] args) {
        ProcessaPedido processaPedido = new ProcessaPedido();

        Item item1 = new Item(1, "Camisa", "Vestuário", 25.0);
        Item item2 = new Item(2, "Calça", "Vestuário", 40.0);
        Item[] itens = {item1, item2};


        processaPedido.processar(1, new Date(), null, new Date(), "Cliente1", "Vendedor1", "Loja1", itens);
    }
}
