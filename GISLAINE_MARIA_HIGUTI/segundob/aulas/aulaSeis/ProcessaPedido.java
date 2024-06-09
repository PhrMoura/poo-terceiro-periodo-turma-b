package segundob.aulas.aulaSeis;

public class ProcessaPedido {

    public void processa (Pedido pedido) {
        PgRepository PgRepo = new PgRepository();
        EnviarEmail emailService = new EnviarEmail();

        boolean salvo = PgRepo.salvar(pedido);

        if (pedido.isValid() && salvo) {
            emailService.enviarEmailConfirmacao();
        } 
    }


}
