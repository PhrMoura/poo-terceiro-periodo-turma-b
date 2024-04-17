package primeirob.listaSeis;

public class Cliente extends Pessoa{
    Endereco endereco;

    public void apresentarse() {
        System.out.println("Cliente: " + nome + "\nIdade: " + idade);
        endereco.apresentarLogradouro();
    }

    public Cliente(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
}
