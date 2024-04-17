package primeirob.sextaatividade;

public class Funcionario extends Pessoa {
    double salarioBase;

    double[] salarioRecebido;

    Loja localTrabalho = new Loja();

    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        
        System.out.println("Local do Trabalho: " + localTrabalho.nomeFantasia); 
    }

    public void calcularMedia() {
        double soma = 0;
        
        for (double index : salarioRecebido) {
            soma += index;
        }

        double media = soma/salarioRecebido.length;

        System.out.println("Media dos salarios: " + media);
    }

    public void calcularBonus () {
        double bonusSalarial = salarioBase * 0.2;
        
        System.out.println("Bonus Salarial: " + bonusSalarial);
    }
    
}
