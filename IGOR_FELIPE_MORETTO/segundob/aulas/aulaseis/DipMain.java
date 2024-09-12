package segundob.aulas.aulaseis;

public class DipMain {
    public static void main(String[] args) {
        RhService service = new RhService();
        Estagiario estag = new Estagiario();
        Clt clt = new Clt();

        estag.setSalario(1000d);
        clt.setSalario(1500d);


        service.gerarFolhaPagamento(estag, null);
    }
}
