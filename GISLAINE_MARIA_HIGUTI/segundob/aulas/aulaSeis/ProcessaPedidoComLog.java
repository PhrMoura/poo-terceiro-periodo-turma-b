package segundob.aulas.aulaSeis;

public class ProcessaPedidoComLog extends ProcessaPedido{
    
    public void processaComLog(Pedido pedido){
        processa(pedido);

        System.out.println("Pedido Criado " + pedido.getId());
    }
}
