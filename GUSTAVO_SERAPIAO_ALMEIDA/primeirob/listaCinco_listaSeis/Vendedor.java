package listaCinco_listaSeis;

public class Vendedor extends Pessoa {
    private String loja;
    private Endereco endereco;
    private double salarioBase;
    private double[] salarioRecebido = {2500.0, 2700.0, 2800.0};

    public Vendedor(String nome, int idade, String loja, Endereco endereco, double salarioBase) {
        super(nome, idade);
        this.loja = loja;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }

    // Getters e setters para os atributos específicos
    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setSalarioRecebido(double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }
}

