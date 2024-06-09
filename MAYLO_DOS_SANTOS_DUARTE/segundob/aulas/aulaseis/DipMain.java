package segundob.aulas.aulaseis;

public class DipMain {

    public static void main(String[] args) {
        
        RHFolhaService service = new RHFolhaService();
        Estagiario estagiario = new Estagiario();
        estagiario.setSalario(600d);

        Clt clt = new Clt();
        clt.setSalario(1600d);

        PJ pj = new PJ();
        pj.setSalario(2600d);


        service.gerarFolhaPagamento(pj);
    }
    
}
