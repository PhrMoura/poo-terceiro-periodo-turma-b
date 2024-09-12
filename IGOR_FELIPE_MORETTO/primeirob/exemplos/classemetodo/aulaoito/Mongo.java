package primeirob.exemplos.classemetodo.aulaoito;

public class Mongo implements BancoDeDados {
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
