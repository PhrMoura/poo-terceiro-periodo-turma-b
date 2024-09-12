package primeirob.exemplos.aulaoito;

public class Postgres implements IBancoDados {

    public void salvar() {
        System.out.println("Salvando no PG");
    }
    
    public void buscar() {
        System.out.println("Buscando no PG");
    }
    
    public void atualizar() {
        System.out.println("Atualizando no PG");
    }
    
    public void deletar() {
        System.out.println("Deletando no PG");
    }

}
