package listaSeis;

import java.util.Date;

public class ProcessaPedido {
    public void processar(Pedido pedido) {
        // Simula processamento de pedido
        if (!pedido.getDataPagamento().after(pedido.getDataVencimentoReserva())) {
            confirmarPagamento(pedido);
        } else {
            System.out.println("Pagamento não confirmado: reserva vencida.");
        }
    }

    private void confirmarPagamento(Pedido pedido) {
        System.out.println("Pagamento confirmado para o pedido " + pedido.getId());
    }
}
