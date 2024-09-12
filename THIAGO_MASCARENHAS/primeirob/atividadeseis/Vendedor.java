package atividadeseis;

import java.util.ArrayList;

public class Vendedor {
     String nome;
     Integer idade;
     String loja;
     String cidade;
     String bairro;
     String rua;
     double salarioBase;
     ArrayList<Double> salarioRecebido;

    public Vendedor(String nome, Integer idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();

        this.salarioRecebido.add(1400.0);
        this.salarioRecebido.add(1800.0);
        this.salarioRecebido.add(1900.0);
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}

