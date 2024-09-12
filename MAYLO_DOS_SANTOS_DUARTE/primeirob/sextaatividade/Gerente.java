package primeirob.sextaatividade;

public class Gerente extends Funcionario {
    @Override
    public void calcularBonus () {
        double bonusSalarial = salarioBase * 0.35;
        
        System.out.println("Bonus Salarial: " + bonusSalarial);
    }
    
}
