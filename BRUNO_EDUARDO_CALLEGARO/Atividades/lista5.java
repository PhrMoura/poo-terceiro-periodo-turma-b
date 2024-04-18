package Atividades;

import java.util.ArrayList;

public class lista5{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        class Vendedor {
            String nome;
            int idade;
            String loja;
            String cidade;
            String bairro;
            String rua;
            double salarioBase;
            ArrayList<Double> salarioRecebido = new ArrayList<>();
        
            Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
                this.nome = nome;
                this.idade = idade;
                this.loja = loja;
                this.cidade = cidade;
                this.bairro = bairro;
                this.rua = rua;
                this.salarioBase = salarioBase;
                this.salarioRecebido.add(1500.0);
                this.salarioRecebido.add(1700.0);
                this.salarioRecebido.add(1600.0);
            }
        
            void apresentarSe() {
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Loja: " + loja);
            }
        
            double calcularMedia() {
                double soma = 0;
                for (double salario : salarioRecebido) {
                    soma += salario;
                }
                return soma / salarioRecebido.size();
            }
        
            double calcularBonus() {
                return salarioBase * 0.2;
            }
        }
    }
}

