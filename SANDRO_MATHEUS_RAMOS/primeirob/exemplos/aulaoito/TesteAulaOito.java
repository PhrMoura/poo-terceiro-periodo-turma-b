package primeirob.exemplos.aulaoito;

public class TesteAulaOito {
    
    public static void main(String[] args) {

        // ContaBancaria conta = new ContaBancaria("213234324", "profe@gmail.com");

        Postgres postgres = new Postgres();
        Oracle oracle = new Oracle();
        Mongo mongo = new Mongo();
        
        salvar(mongo);
    }
    
    public static void salvar(IBancoDados banco) {
        banco.salvar();
    }

    public Double[] teste() {
        Double[] valores = new Double[] { 23d };

        return valores;
    }

}
