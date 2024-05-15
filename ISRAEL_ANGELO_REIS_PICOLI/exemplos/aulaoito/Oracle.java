package exemplos.aulaoito;

public class Oracle implements IBancoDados {
    
    public void salvar() {
        System.out.println("Salvando no Oracle");
    }
    
    public void buscar() {
        System.out.println("Buscando no Oracle");
    }
    
    public void atualizar() {
        System.out.println("Atualizando no Oracle");
    }
    
    public void deletar() {
        System.out.println("Deletando no Oracle");
    }

}
