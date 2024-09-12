package primeirob.listaSeis;

import java.util.ArrayList;

public class Vendedor {
    String nome;

    Integer idade;

    String loja;

    double salarioBase;

    ArrayList<Double> salarioRecebido = new ArrayList<>();

    Endereco endereco;

    public Vendedor(String nome, Integer idade, String loja, Endereco endereco){
    
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioRecebido.add(1200.0);
        this.salarioRecebido.add(1300.0);
        this.salarioRecebido.add(1500.0);
        this.endereco = endereco;

    }

    public void apresentarSe() {
        
        System.out.println("Nome do Vendedor: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
        System.out.println("Endereço");
        endereco.apresentarLogradouro();

    }

    public double calcularMedia(){
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;  
        }
        return soma/salarioRecebido.size();
    }

    public double calcularBonus() {
        double mediaSalario = calcularMedia();
        return mediaSalario * 0.2;
    }
}
