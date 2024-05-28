package primeirob.atividades.atividadeclasse;

import primeirob.exemplos.classemetodo.IBancoDados;

public class BioTechnica implements IBancoDados{

    @Override
    public void parceria() {
        System.out.println("Parceria com BioTechnica");
    }
    public void deletar() {
        System.out.println("Deletando em PG");
    }
    public void salvar(){
        System.out.println("Salvando em PG");
    }
    public void atualizar(){
        System.out.println("Atualizando em PG");
    }
}
