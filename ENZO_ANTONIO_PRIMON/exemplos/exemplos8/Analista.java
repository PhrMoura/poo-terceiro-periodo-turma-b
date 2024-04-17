package exemplos.exemplos8;

public class Analista extends Funcionario{
    @Override
    public void calcularBonus() {
        System.out.println("Bonus analista: " + (salario*0.04));
    }
}
