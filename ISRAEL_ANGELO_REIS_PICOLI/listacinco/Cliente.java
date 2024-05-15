package listacinco;

public class Cliente {
    String nome;
    String idade;
    String cidade;
    String bairro;
    String rua;

    public void apresentarse() {
        System.out.println("Cliente: " + nome + " | Idade: " + idade + "\n");
    }
}
