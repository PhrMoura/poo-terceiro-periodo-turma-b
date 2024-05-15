package primeirob.exemplos.aulasete;

public class Gerente extends Funcionario {
    @Override
    public void calcularBonus() {
        System.out.println("Bonus Analista: " + (salario*0.06));
    } 
    
}
