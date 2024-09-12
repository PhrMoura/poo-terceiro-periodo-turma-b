package listaSeis;

public class Vendedor {
    private String nome;
    private int idade;
    private String loja;
    private Endereco endereco;
    private double salarioBase;

    public Vendedor(String nome, int idade, String loja, Endereco endereco, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Loja: " + loja);
        endereco.apresentarLogradouro();
    }

    public double calcularBonus() {
        return salarioBase * 0.15;  // Coloquei o bônus de um vendedor é 15% do salário base
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getLoja() {
        return loja;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
