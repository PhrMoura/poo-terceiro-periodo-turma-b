package atividades.atividade6;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa {
    String loja;
    int salarioBase = 1500;
    public List<Double> salarioRecebido = new ArrayList<Double>();

    public void apresentarse() {

        String msg = "\nGerente: "
                .concat(nome)
                .concat("\nIdade: " + idade)
                .concat("\nLoja: " + loja);

        System.out.println(msg);
    }

    public void calcularMedia() {

        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        double media = soma / salarioRecebido.size();

        System.out.println("A media dos salários é de: " + media);
    }

    public void calcularBonus() {

        System.out.println("Bonus de salário: " + (salarioBase * 0.35));

    }
}
