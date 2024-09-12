package segundob.aulas.aulaseis;

public class DipMain {
    
    public static void main(String[] args) {
        
        RhFolhaService service = new RhFolhaService();
        Estagiario estagiario = new Estagiario();
        Clt clt = new Clt();
        Pj pj = new Pj();

        estagiario.setSalario(900d);
        clt.setSalario(3400d);
        pj.setSalario(4300d);

        service.gerarFolhaPagamento(pj);

    }

}
