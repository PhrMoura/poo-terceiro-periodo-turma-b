package primeiroB.listaSeis;

public class Gerente extends Funcionario{
    Endereco endereco;
    
    public void apresentarse() {
        System.out.println("Gerente: " + nome + "\nIdade: " + idade + "\nLoja: " + loja);
        endereco.apresentarLogradouro();
    }
    
    public Gerente(String nome, int idade, String loja, int salarioBase, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.endereco = endereco;
    }

    @Override
    public void calcularMedia() {
        int[] salarioRecebido = new int[] {2400 , 2400 , 2400};
        double soma = 0;
        int cont = 0;
        for (int i = 0 ; i < 3 ; i++) {
            soma = soma + salarioRecebido[i];
            cont++;
        }
        double mediaSalario = soma/cont;
        System.out.println("Média salarial: R$" + mediaSalario);
    }

    @Override
    public void calcularBonus() {
        double bonus = salarioBase * 0.35;
        System.out.println("Bônus do salário: R$" + bonus);
    }
}