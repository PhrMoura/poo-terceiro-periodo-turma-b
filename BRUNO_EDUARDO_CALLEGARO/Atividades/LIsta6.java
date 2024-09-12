package Atividades;

import java.util.List;

public class LIsta6 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        class Gerente {
            String nome;
            int idade;
            String loja;
            @SuppressWarnings("unused")
            Endereco endereco;
            double salarioBase;
            List<Double> salarioRecebido;
        
            public Gerente(String nome, int idade, String loja, Endereco endereco, double salarioBase, List<Double> salarioRecebido) {
                this.nome = nome;
                this.idade = idade;
                this.loja = loja;
                this.endereco = endereco;
                this.salarioBase = salarioBase;
                this.salarioRecebido = salarioRecebido;
            }
        
            public void apresentarSe() {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Loja: " + loja);
            }
        
            public double calcularMedia() {
                double total = 0;
                for (double salario : salarioRecebido) {
                    total += salario;
                }
                return total / salarioRecebido.size();
            }
        
            public double calcularBonus() {
                return salarioBase * 0.35;
            }
        }
        
    
        
    }

    
}

