package primeirob.exemplos.ListaSete;

import java.util.Date;

public class ProcessaPedido {

 
    public void processar(int id, Date dataCriacao, String cliente, String vendedor, Loja loja, Item[] itens, Date dataVencimentoReserva) throws Exception {
        
        Pedido pedido = new Pedido();
        pedido.setId(id);
        pedido.setDataCriacao(dataCriacao);
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setLoja(loja);
        pedido.setItens(itens);

        
        pedido.setDataVencimentoReserva(dataVencimentoReserva);

        
        confirmarPagamento(pedido);
    }


    private void confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date(); 
        Date dataVencimentoReserva = pedido.getDataVencimentoReserva();

       
        if (dataVencimentoReserva != null && !dataAtual.after(dataVencimentoReserva)) {
            System.out.println("Pagamento confirmado!"); 
            pedido.setDataPagamento(dataAtual); 
        } else {
            System.out.println("Pagamento não pode ser confirmado. A reserva está vencida."); 
        }
    }
}