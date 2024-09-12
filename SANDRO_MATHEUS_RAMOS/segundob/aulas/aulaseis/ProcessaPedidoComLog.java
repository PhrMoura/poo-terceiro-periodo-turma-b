package segundob.aulas.aulaseis;

public class ProcessaPedidoComLog extends ProcessaPedido {

    public void processaComLog(Pedido pedido) {
        processa(pedido);

        System.out.println("Pedido criado" + pedido.getId());
    }

}
