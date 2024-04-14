package lista5;

public class Cliente {
    String nome;
    Integer idade;
    String cidade;
    String bairro;
    String rua;

    public void apresentarCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}