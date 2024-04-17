package primeirob.AulaSete;

public class Gerente extends Funcionario {
    @Override
    public void calcularBonus() {
        System.out.println("Bonus Gerente: " + (salario * 0.6));
    }
}
