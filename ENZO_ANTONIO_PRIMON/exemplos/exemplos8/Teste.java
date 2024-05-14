package exemplos.exemplos8;

public class Teste {
    public static void main(String[] args) {

        Funcionario funcionariUm = new Funcionario();
        funcionariUm.salario = 1000d;

        Analista analistaUm = new Analista();
        analistaUm.salario = 2000d;

        Gerente gerenteUm = new Gerente();
        gerenteUm.salario = 3000d;

        funcionariUm.calcularBonus();
        analistaUm.calcularBonus();
        gerenteUm.calcularBonus();
        
    }
}
