package exemplos.aulaOito;

public class TesteAulaOito {
    public static void main(String[] args) {
        //ContaBancaria conta = new ContaBancaria("12345", "sasasasas@gmail.com");

        Postgres postgres = new Postgres();
        Oracle oracle = new Oracle();
        Mongo mongo = new Mongo();

        salvar(postgres);
        salvar(oracle);
        salvar(mongo);
    }

    public static void salvar(IBancodeDados banco){
        banco.salvar();
    }
}
