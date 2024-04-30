package Atv6;

public class propedido {
    import java.util.Date;
import java.util.List;

public class Propedido {
    public Pedido processar(int id, String cliente, String vendedor, String loja, List<Item> itens) {
        Pedido pedido = new Pedido(id, cliente, vendedor, loja, itens);
        if (confirmarPagamento(pedido)) {
            System.out.println("Pedido processado com sucesso!");
            return pedido;
        } else {
            System.out.println("Não foi possível processar o pedido devido à reserva estar vencida.");
            return null;
        }
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        return dataAtual.before(pedido.dataVencimentoReserva);
    }
}

}
