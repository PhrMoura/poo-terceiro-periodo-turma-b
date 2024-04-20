import java.util.ArrayList;
import java.util.Date;

public class ProcessaPedido {
    public  void processar( ArrayList<Item> itens){
        Pedido pedido = new Pedido();
        pedido.dataCriacao = new Date();
        pedido.dataVencimentoReserva = new Date(pedido.dataCriacao.getTime() + (3 * 24 * 60 * 1000));
        gerarDescricaoVenda(pedido);
    }

    public void gerarDescricaoVenda(Pedido pedido){
        pedido.gerarDescricaoVenda();
    }
    public boolean confirmaPagamento(Pedido pedido){
        Date agora = new Date();
        return agora.before(pedido.dataVencimentoReserva);
    }
}
