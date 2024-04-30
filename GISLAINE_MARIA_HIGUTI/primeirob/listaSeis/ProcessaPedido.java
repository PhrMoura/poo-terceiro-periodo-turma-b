package primeirob.listaSeis;

import java.util.Date;
import java.util.ArrayList;

public class ProcessaPedido extends Pedido {

    public ProcessaPedido(Integer id, Date dataCriacao, Cliente cliente, Vendedor vendedor, String loja, ArrayList<Item> itens) {
        super(id, cliente, vendedor, loja, itens);
    }

    public Pedido processar(Cliente cliente, Vendedor vendedor, ArrayList<Item> itens) {
        Pedido pedido = new Pedido(id, cliente, vendedor, loja, itens);
        
        return pedido;
    }

    public void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.before(pedido.getDataVencimentoReserva())) {

            System.out.println("Pagamento confirmado!");

        } else {
            
            System.out.println("O pagamento não foi efetuado ou está vencido");

        }
    }
}