package primeirob.sextaatividade;

// import java.util.Date;
import java.util.List;

public class ProcessaPedido {

    private Integer IDs = 0;
    public Pedido processar(Cliente cliente, Vendedor vendedor, Loja loja, List<Item> item) {

        Pedido novoPedido = new Pedido();
        novoPedido.id = IDs++;
        novoPedido.dataCriacao = Util.retornaDataAtual();
        novoPedido.dataVencimentoReserva = Util.retornaDataVencimento();
        novoPedido.cliente = cliente;
        novoPedido.vendedor = vendedor;
        novoPedido.loja = loja;
        novoPedido.itens.addAll(item);

        return novoPedido;
    }

    public void confirmarPagamento (Pedido pedido) {
        pedido.dataPagamento = Util.retornaDataAtual();

        // long dataPagamento = pedido.dataPagamento.getTime() + (86400000l * 10);
        // pedido.dataPagamento = new Date(dataPagamento);

        if (pedido.dataPagamento.getTime() <= pedido.dataVencimentoReserva.getTime())
        {
            System.out.println("Pagamento confirmado");
        }
        else 
        {
            System.out.println("Pagamento não confirmado, reserva vencida");
        }

    }


    
}
