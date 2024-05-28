package primeirob.listaSete;

import java.util.ArrayList;
import java.util.Date;

public class ProcessaPedido {

    public static void processar(int id, ArrayList<Item> itens) {
        Pedido pedido = new Pedido(id, itens);
        confirmarPagamento(pedido);
    }

    private static void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (!dataAtual.after(pedido.getDataVencimentoReserva())) {
            System.out.println("Pagamento confirmado para o pedido " + pedido.getId());
        } else {
            System.out.println("Pagamento não confirmado para o pedido " + pedido.getId() + ". A reserva está vencida.");
        }
    }

}
