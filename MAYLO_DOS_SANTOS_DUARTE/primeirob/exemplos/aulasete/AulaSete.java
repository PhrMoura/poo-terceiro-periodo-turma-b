package primeirob.exemplos.aulasete;

public class AulaSete {
    public static void main(String[] args) {
        Funcionario funcionarioUm = new Funcionario();
        funcionarioUm.salario = 1800d;

        Gerente gerenteUm = new Gerente();
        gerenteUm.salario = 2800d;

        Analista analistaUm = new Analista();
        analistaUm.salario = 3800d;

        funcionarioUm.calcularBonus();
        gerenteUm.calcularBonus();
        analistaUm.calcularBonus();
        
    }
    
}
