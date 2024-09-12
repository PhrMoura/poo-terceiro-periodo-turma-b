package primeirob.exemplos.aulasete;

public class Oracle extends BancoDados {

    @Override
    public void salvar() {
        System.out.println("Salvando no Oracle");
    }
    
    @Override
    public void buscar() {
        System.out.println("Buscando no Oracle");
    }
    
    @Override
    public void deletar() {
        System.out.println("Deletando no Oracle");
    }
    
    @Override
    public void atualizar() {
        System.out.println("Atualizar no Oracle");
    }
    
}
