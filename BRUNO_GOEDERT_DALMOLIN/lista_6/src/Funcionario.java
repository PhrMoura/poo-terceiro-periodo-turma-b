import java.util.List;

public class Funcionario extends Pessoa {

    private String loja;
    private Double salarioBase;
    private List<Double> salarioRecebido;

    public Funcionario(String nome, int idade, Endereco endereco, String loja, Double salarioBase,
            List<Double> salarioRecebido) {
        super(nome, idade, endereco);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public double calcularMedia() {
        int vezesRecebidas = salarioRecebido.size();
        Double valorTotalRecebido = salarioRecebido.stream().mapToDouble(valor -> valor).sum();

        return valorTotalRecebido / vezesRecebidas;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public List<Double> getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(List<Double> salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

}
