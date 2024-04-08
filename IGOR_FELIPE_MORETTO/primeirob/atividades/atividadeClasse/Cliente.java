package primeirob.atividades.atividadeclasse;

public class Cliente {
    
    String nome;
    Integer idade;
    Loja loja;
    String cidade;
    String bairro;
    String rua;
    
    public void apresentarse() {
        String msg = "Sou o cliente "
        .concat(nome)
        .concat(" e tenho " + idade)
        .concat(" anos");

        System.out.println(msg);
    }

}
