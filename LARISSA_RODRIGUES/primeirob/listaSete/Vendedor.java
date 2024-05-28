package primeiroB.listaSete;

public class Vendedor extends Funcionario{
    Endereco endereco;

    public void apresentarse() {
        System.out.println("Vendedor: " + nome + "\nIdade: " + idade + "\nLoja: " + loja);
        endereco.apresentarLogradouro();
    }

    public Vendedor(String nome, int idade, String loja, int salarioBase, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.endereco = endereco;
    }

    public void calcularMedia() {
        int[] salarioRecebido = new int[] {1800 , 1800 , 1800};
        double soma = 0;
        int cont = 0;
        for (int i = 0 ; i < 3 ; i++) {
            soma = soma + salarioRecebido[i];
            cont++;
        }
        double mediaSalario = soma/cont;
        System.out.println("Média salarial: R$" + mediaSalario);
    }

    public void calcularBonus() {
        double bonus = salarioBase * 0.2;
        System.out.println("Bônus do salário: R$" + bonus);
    }
}