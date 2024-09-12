package primeirob.quintaatividade;

public class Cliente {
    String nome, 
        cidade, bairro, rua;
    
    Integer idade;

    public void apresentarse() {
        System.out.println("Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("-----------------------------");
    }
    
}
