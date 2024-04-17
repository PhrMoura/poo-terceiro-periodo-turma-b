package primeirob.listaSeis;

import java.util.Date;

public class ProcessaPedido {

    public static void processar(int id, Cliente cliente, Vendedor vendedor, Item[] itens) {
        Pedido pedido = new Pedido(id, cliente, vendedor, itens);
        confirmarPagamento(pedido);
    }

    private static void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (!dataAtual.after(pedido.dataVencimentoReserva)) {
            System.out.println("Pagamento confirmado para o pedido " + pedido.id);
        } else {
            System.out.println("Pagamento não confirmado para o pedido " + pedido.id + ". A reserva está vencida.");
        }
    }

}
