package primeirob.exemplos.aulasete;

public class Gerente extends Funcionario {
    
    @Override
    public void calcularBonus() {
        System.out.println("Bonus Gerente: " + (salario * 0.06));
    }
    
    public void teste() {
        System.out.println("Teste");
    }

}
