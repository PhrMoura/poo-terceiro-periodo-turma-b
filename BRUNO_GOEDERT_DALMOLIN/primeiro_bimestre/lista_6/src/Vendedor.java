import java.util.List;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, int idade, Endereco endereco, Double salarioBase,
            List<Double> salarioRecebido) {
        super(nome, idade, endereco, "loja", salarioBase, salarioRecebido);
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        return "Nome: " + this.getNome() + ". Idade: " + this.getIdade() + ". Loja: " + this.getLoja();
    }

}
