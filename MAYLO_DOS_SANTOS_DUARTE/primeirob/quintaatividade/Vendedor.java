package primeirob.quintaatividade;

public class Vendedor {
    String nome, 
        cidade, bairro, rua; 

    Integer idade;

    double salarioBase;

    double[] salarioRecebido;

    Loja localTrabalho = new Loja();

    public void apresentarse() {
        System.out.println("Vendedor");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        
        System.out.println("Local do Trabalho: " + localTrabalho.nomeFantasia); 

        System.out.println("-----------------------------");
    }

    public void calcularMedia() {
        double soma = 0;
        
        for (double index : salarioRecebido) {
            soma += index;
        }

        double media = soma/salarioRecebido.length;

        System.out.println("Media dos salarios: " + media);
        System.out.println("-----------------------------");


    }

    public void calcularBonus () {
        double bonusSalarial = salarioBase * 0.2;
        
        System.out.println("Bonus Salarial: " + bonusSalarial);
        System.out.println("-----------------------------");

    }
    
    
}
