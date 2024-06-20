package listaCinco_listaSeis;

public class Cliente extends Pessoa {
    public Cliente(String nome, int idade) {
        super(nome, idade);
    }

    public void apresentarCliente() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}
