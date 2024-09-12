package listasete;

public class Funcionario {

    private String nome;

    private Integer idade;

    private String loja;

    private double salarioBase;

    private double[] salarioRecebido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarse() {
        System.out.println("Funcionário: " + nome + " | Idade: " + idade + " | Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        double bonus = 0;
        bonus = salarioBase * 0.2;

        return bonus;
    }
}
