package primeirob.exemplos.aulaoito;

public class Mongo implements IBancoDados {
    
    public void salvar() {
        System.out.println("Salvando no Mongo");
    }
    
    public void buscar() {
        System.out.println("Buscando no Mongo");
    }
    
    public void atualizar() {
        System.out.println("Atualizando no Mongo");
    }
    
    public void deletar() {
        System.out.println("Deletando no Mongo");
    }

}
