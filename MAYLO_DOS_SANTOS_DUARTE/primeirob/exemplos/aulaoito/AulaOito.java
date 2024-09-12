package primeirob.exemplos.aulaoito;

public class AulaOito {
    public static void main(String[] args) {
        Postgres postgres = new Postgres();

        salvar(postgres);
    }

    public static void salvar (IBancoDados banco) {
        banco.salvar();
    } 
    
}
