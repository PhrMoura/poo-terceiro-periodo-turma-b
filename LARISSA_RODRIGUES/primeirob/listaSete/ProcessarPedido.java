package primeiroB.listaSete;
import java.util.Date;

public class ProcessarPedido{

    public Pedido processar(int id, Cliente cliente, Vendedor vendedor, Loja loja, Item[] itens) {
        Pedido pedido = new Pedido(id, cliente, vendedor, loja, itens);
        return pedido;
    }

    public boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.before(pedido.getDataVencimentoReserva())) {
            pedido.setDataPagamento(dataAtual);
            return true;
        } else {
            return false;
        }
    }
}
