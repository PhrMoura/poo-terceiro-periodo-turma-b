package primeirob.exemplos.ListaSeis;

import java.util.Date;

public class ProcessaPedido {

    
    public void processar(int id, Date dataCriacao, String cliente, String vendedor, Loja loja, Item[] itens) {
        Pedido pedido = new Pedido();
        pedido.id = id;
        pedido.dataCriacao = dataCriacao;
        pedido.cliente = cliente;
        pedido.vendedor = vendedor;
        pedido.loja = loja;
        pedido.itens = itens;
        confirmarPagamento(pedido);
    }

    
    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        Date dataVencimentoReserva = pedido.dataVencimentoReserva;

        if (!dataAtual.after(dataVencimentoReserva)) {
            System.out.println("Pagamento confirmado!");
            pedido.dataPagamento = dataAtual;
        } else {
            System.out.println("Pagamento não pode ser confirmado. A reserva está vencida.");
        }
    }
}

