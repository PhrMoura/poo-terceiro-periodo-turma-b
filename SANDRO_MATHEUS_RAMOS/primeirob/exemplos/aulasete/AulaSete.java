package primeirob.exemplos.aulasete;

import java.util.Scanner;

public class AulaSete {
    
    public static void main(String[] args) {

        // Ninja ninjaUm = new Ninja();
        // Ninja ninjaDois = new Ninja();

        // ninjaUm.nome = "Naruto";
        // ninjaUm.aldeia = "Folha";
        // ninjaUm.cla = "Uzumaki";
        // ninjaUm.idade = 16;
        // ninjaUm.nomeJutso = "Rasengan";

        // ninjaDois.nome = "Sasuke";
        // ninjaDois.aldeia = "Folha";
        // ninjaDois.cla = "Uchiha";
        // ninjaDois.idade = 16;
        // ninjaDois.nomeJutso = "Chidori";

        // ninjaUm.realizarJutso();
        // ninjaDois.realizarJutso();

        Funcionario funcionarioUm = new Funcionario();
        funcionarioUm.salario = 1800d;

        Gerente gerenteUm = new Gerente();
        gerenteUm.salario = 2800d;

        Analista analistaUm = new Analista();
        analistaUm.salario = 3200d;

        funcionarioUm.calcularBonus();
        gerenteUm.calcularBonus();
        analistaUm.calcularBonus();


        Postgres pg = new Postgres();
        Oracle oracle = new Oracle();

        salvar(pg);
        salvar(oracle);

    }
    
    public static void salvar(BancoDados db) {
        db.salvar();
    }

}
