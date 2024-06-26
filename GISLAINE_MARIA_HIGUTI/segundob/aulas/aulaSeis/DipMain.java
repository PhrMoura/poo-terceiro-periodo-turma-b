package segundob.aulas.aulaSeis;

public class DipMain {
    public static void main(String[] args) {
        RhFolhaService service = new RhFolhaService();
        Estagiario estagiario = new Estagiario();
        Clt clt = new Clt();
        Pj pj = new Pj();

        estagiario.setSalario(900d);
        clt.setSalario(3400d);
        pj.setSalario(4000d);

        service.gerarFolhaPagamento(estagiario, clt, pj);
    }
}
