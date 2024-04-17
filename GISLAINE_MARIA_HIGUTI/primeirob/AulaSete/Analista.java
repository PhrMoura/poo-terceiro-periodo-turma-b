package primeirob.AulaSete;

public class Analista extends Funcionario{
    @Override
    public void calcularBonus() {
        System.out.println("Bonus Funcionario: " + (salario * 0.4));
    }

}
