package primeirob.exemplos.classemetodo.aulaoito;

public class Portgres implements BancoDeDados {
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
