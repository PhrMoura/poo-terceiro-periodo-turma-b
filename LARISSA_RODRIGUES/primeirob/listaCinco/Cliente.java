package primeiroB.listaCinco;

public class Cliente {
    String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;

    public void apresentarse() {
        String apresentacao = "Cliente: "
            .concat(nome)
            .concat("\nIdade: " + idade)
            .concat("\n---------------");

        System.out.println(apresentacao);
    }
}
