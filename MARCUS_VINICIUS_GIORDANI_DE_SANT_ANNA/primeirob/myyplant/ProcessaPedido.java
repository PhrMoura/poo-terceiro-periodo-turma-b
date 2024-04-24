package primeirob.myyplant;

import java.util.Date;

public class ProcessaPedido {

    public void processarPedido(Pedido pedido, Item itemEscolhido, int quantidade) {
        boolean itemDisponivel = verificarDisponibilidadeItem(itemEscolhido, quantidade);
        if (itemDisponivel) {
            ItemPedido itemPedido = new ItemPedido(itemEscolhido, quantidade);
            pedido.adicionarItemPedido(itemPedido);
            System.out.println("Pedido processado: " + pedido.getId());
        } else {
            System.out.println("Item escolhido não está disponível em quantidade suficiente.");
        }
    }

    private boolean verificarDisponibilidadeItem(Item item, int quantidade) {
        return true;
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        return dataAtual.before(pedido.getDataVencimentoReserva());
    }

    public void testarConfirmarPagamento(Pedido pedido) {
        if (confirmarPagamento(pedido)) {
            System.out.println("O pagamento do pedido " + pedido.getId() + " foi confirmado.");
        } else {
            System.out.println("O pagamento do pedido " + pedido.getId() + " não foi confirmado.");
        }
    }
}
