package segundob.aulas.aulaseis;

public class PgRepository {

    public boolean salvar(Pedido pedido) {
        PgConnection connection = new PgConnection("url");

        System.out.println("Conexão com banco de dados e etc...");

        return true;
    }
    
}
