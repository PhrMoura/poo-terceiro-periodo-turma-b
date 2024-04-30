package atividades.atividade6;

import java.util.ArrayList;

public class Gerente extends Pessoa {

    private Loja loja;
    private Double salarioBase;
    private ArrayList<Double> salarioRecebido;

    public Gerente(String nome, Integer idade, Endereco endereco, Double salarioBase) {
        super(nome, idade, endereco);
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();
        this.salarioRecebido.add(1800d);
        this.salarioRecebido.add(1800d);
        this.salarioRecebido.add(1800d);
    }

    public void calcularBonus() {
        System.out.println(salarioBase * 0.02);
    }

    public Loja getLoja() {
        return loja;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public double calcularMedia() {
        double soma = 0;
        for (Double salario : salarioRecebido) {
            soma += salario;
        }
        return soma/salarioRecebido.size();
    }

    public void apresentarse() {
        System.out.println("Nome vendedor " + getNome() + " Idade " + getIdade() + " loja " + loja.getNomeFantasia()
                + " salario " + getSalarioBase());
    }
}
