package poo.ListaSete;

public class Gerente extends Pessoa{
    private double salarioBase = 3000;
    private double[] salarioRecebido = new double[] { 3500, 3600.20, 2900.50 };

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }

}
