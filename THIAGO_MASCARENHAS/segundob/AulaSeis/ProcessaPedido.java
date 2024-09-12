package segundob.AulaSeis;

public class ProcessaPedido {

    public class Pedido{

        public void Processa(Pedido pedido) {

            if (Pedido.isValido() && salvar(pedido)){
                enviarEmailConfirmacao();
            }
        }
    }

    public boolean salvar
}
