package primeirob.exemplos.aulasete;

public class Postgres extends BancoDados {

    @Override
    public void salvar() {
        System.out.println("Salvando no PG");
    }
    
    @Override
    public void buscar() {
        System.out.println("Buscando no PG");
    }
    
    @Override
    public void deletar() {
        System.out.println("Deletando no PG");
    }
    
    @Override
    public void atualizar() {
        System.out.println("Atualizar no PG");
    }
    
}
