package exemplos.exemplos8;

public class Gerente extends Funcionario{
    @Override
    public void calcularBonus() {
        System.out.println("Bonus gerente: " + (salario*0.06));
    }
}
