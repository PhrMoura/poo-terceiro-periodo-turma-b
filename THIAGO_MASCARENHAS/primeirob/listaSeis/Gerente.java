package listaSeis;

public class Gerente {
    private String nome;
    private int idade;
    private String loja;
    private Endereco endereco;
    private double salarioBase;
    private double[] salarioRecebido = new double[3]; 

    public Gerente(String nome, int idade, String loja, Endereco endereco, double salarioBase, double[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Loja: " + loja);
        endereco.apresentarLogradouro();
    }

    public double calcularMedia() {
        double total = 0;
        for (double salario : salarioRecebido) {
            total += salario;
        }
        return total / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}
