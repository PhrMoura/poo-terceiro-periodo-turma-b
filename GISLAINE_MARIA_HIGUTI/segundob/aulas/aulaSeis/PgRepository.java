package segundob.aulas.aulaSeis;

public class PgRepository {
    public boolean salvar(Pedido pedido){
        PgConnection connection = new PgConnection("url");
        System.out.println(connection);
        return true;
    }
}
