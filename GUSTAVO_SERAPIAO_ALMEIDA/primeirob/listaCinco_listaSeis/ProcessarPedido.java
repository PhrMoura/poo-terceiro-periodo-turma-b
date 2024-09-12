package listaCinco_listaSeis;

import java.util.Date;

public class ProcessarPedido {

    private Integer ids = 0;

    public Pedido processar(Cliente cliente, Vendedor vendedor, Item[] itens) {
        Pedido pedido = new Pedido(ids++, cliente, vendedor, itens);
        return pedido;
    }

    public void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        Date dataVencimentoReserva = pedido.getDataVencimentoReserva();

        if (dataAtual.before(dataVencimentoReserva)) {
            pedido.setDataPagamento(new Date());
            System.out.println("Pagamento confirmado com sucesso!");
        } else {
            System.out.println("Não foi possível confirmar o pagamento. A reserva está vencida.");
        }
    }
}
