package Atividade6;

import java.util.Date;
import java.util.List;

public class Processapedido {
    public void processar(int idPedido, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        Pedido pedido = new Pedido(idPedido, cliente, vendedor, loja, itens);
        if (!confirmarPagamento(pedido)) {
            System.out.println("Erro: Reserva vencida ou data atual superior à data de vencimento da reserva.");
            return;
        }
        System.out.println("Pedido processado com sucesso!");
        pedido.gerarDescricaoVenda();
    }

    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        return dataAtual.compareTo(pedido.dataVencimentoReserva) <= 0;
    }
}
