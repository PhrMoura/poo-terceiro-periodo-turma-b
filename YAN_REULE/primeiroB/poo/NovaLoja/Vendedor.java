package poo.NovaLoja;

public class Vendedor {
    String nome;
    Number idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    double[] salarioRecebido = new double[] { 1200, 1250.20, 1500.50 };

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}

// Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e
// salarioRecebido.
// Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos
// de salário.(Pode colocar no código os valores*)

// Métodos apresentarse calcularMedia e calcularBonus.
// Método apresentarse deve printar o nome, idade e Loja.

// calcularMedia deve trazer a média dos salários.
// calcularBonus onde a formulá é [salarioBase * 0.2]