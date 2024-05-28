package lista7;

import java.util.ArrayList;
import java.util.Date;

public class ProcessaPedido extends Pedido{
    public ProcessaPedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, String cliente, String vendedor, String loja, ArrayList<Double> itens) {
        super(id, dataCriacao, dataPagamento, dataVencimentoReserva, cliente, vendedor, loja, itens);
    }

    public void processar(){
        super.dataCriacao = new Date();
        super.dataVencimentoReserva = new Date(super.dataCriacao.getTime() + (3 * 24 * 60 * 1000));
        if (confirmaPagamento(this)){
            System.out.println("Pagamento confirmado");
        }else {
            System.out.println("Pagamento não confirmado");
        }
    }

    private boolean confirmaPagamento(Pedido pedido){
        Date agora = new Date();
        return agora.before(pedido.dataVencimentoReserva);
    }

}
