package poo.ListaSete;

public class Gerente {
    // Atributos
    String nome;
    int idade;
    String loja;
    double salarioBase;
    double[] salarioRecebido = new double[] { 1200, 1250.20, 1500.50 };
    Endereco enderecoGerente = new Endereco();

    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
        enderecoGerente.apresentarLogradouro();
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}