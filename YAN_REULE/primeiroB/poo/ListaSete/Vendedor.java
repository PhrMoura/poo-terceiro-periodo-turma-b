package poo.ListaSete;

public class Vendedor extends Pessoa {
    Double salarioBase = 1200.00;  
    double[] salarioRecebido = new double[] { 1200, 1250.20, 1500.50 };

    public double calcularMedia (){
        double soma = 0;
        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
