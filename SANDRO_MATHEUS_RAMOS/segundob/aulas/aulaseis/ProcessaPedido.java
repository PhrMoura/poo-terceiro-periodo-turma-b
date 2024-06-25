package segundob.aulas.aulaseis;

public class ProcessaPedido {

    public void processa(Pedido pedido) {
        PgRepository pgRepo = new PgRepository();
        EnviaEmailService emailService = new EnviaEmailService();

        boolean salvo = pgRepo.salvar(pedido);

        if (pedido.isValido() && salvo) {
            emailService.enviarEmailConfirmacao();
        }

    }

}
