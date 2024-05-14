import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa {
    public String loja;
    public double salarioBase;
    public List<Double> salarioRecebido;

    public Gerente(String nome, int idade, Endereco endereco, String loja, double salarioBase) {
        super(nome, idade, endereco);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();
    }

    public double calcularMedia() {
        if (salarioRecebido.size() > 0) {
            double soma = 0;
            for (double salario : salarioRecebido) {
                soma += salario;
            }
            return soma / salarioRecebido.size();
        } else {
            return 0;
        }
    }

    public double calcularBonus() {
        return salarioBase * 0.35; 
    }
}
