public class Cliente extends Pessoa {
    public Cliente(String nome, int idade, Endereco endereco) {
        super(nome, idade, endereco);
    }

    public String toString() {
        return "Nome: " + this.getNome() + ". Idade: " + this.getIdade() + ".";
    }
}
