import java.util.List;

public class Vendedor {
    private String nome;
    private int idade;
    private String loja;
    private String cidade;
    private String bairro;
    private String rua;
    private Double salarioBase;
    private List<Double> salarioRecebido;

    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase,
            List<Double> salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
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

    public String toString() {
        return "Nome: " + nome + ". Idade: " + idade + ". Loja: " + loja;
    }

}
