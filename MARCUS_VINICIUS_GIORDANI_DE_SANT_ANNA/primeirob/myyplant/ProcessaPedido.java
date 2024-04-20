package primeirob.myyplant;

import java.util.Date;

public class ProcessaPedido {
    
    // Método para processar um pedido
    public void processarPedido(Pedido pedido) {
        // Processar o pedido...
        System.out.println("Pedido processado: " + pedido.getId());
    }
    
    // Método privado para confirmar o pagamento
    private boolean confirmarPagamento(Pedido pedido) {
        // Verificar se o pedido foi pago antes do vencimento da reserva
        Date dataAtual = new Date();
        return dataAtual.before(pedido.getDataVencimentoReserva());
    }
    
    // Método de teste para verificar o funcionamento do método confirmarPagamento
    public void testarConfirmarPagamento(Pedido pedido) {
        if (confirmarPagamento(pedido)) {
            System.out.println("O pagamento do pedido " + pedido.getId() + " foi confirmado.");
        } else {
            System.out.println("O pagamento do pedido " + pedido.getId() + " não foi confirmado.");
        }
    }
}
