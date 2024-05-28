package ExercicioSeis;

import java.util.Date;

public class ProcessaPedidos {
    // Método processar
    public void processar(int id, Date dataCriacao, Date dataPagamento, String cliente, String vendedor, String loja, Items[] itens) {
        Pedidos.Pedido pedido = new Pedidos().new Pedido(id, dataCriacao, dataPagamento, cliente, vendedor, loja, itens);
        if (confirmarPagamento(pedido)) {
            System.out.println("Pedido processado com sucesso!");
        } else {    
            System.out.println("Erro ao processar o pedido. A reserva expirou.");
        }
    }

    // Método privado confirmarPagamento
    private boolean confirmarPagamento(Pedidos.Pedido pedido) {
        Date dataAtual = new Date();
        return dataAtual.before(pedido.dataVencimentoReserva);
    }
}