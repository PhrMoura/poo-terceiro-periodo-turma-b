import java.util.List;

public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, Endereco endereco, String loja, Double salarioBase,
            List<Double> salarioRecebido) {
        super(nome, idade, endereco, loja, salarioBase, salarioRecebido);
    }

    @Override
    public double calcularBonus() {
        return this.getSalarioBase() * 0.35;
    }

}
