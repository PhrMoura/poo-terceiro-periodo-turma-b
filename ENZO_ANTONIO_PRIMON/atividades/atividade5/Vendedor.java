package atividades.atividade5;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

    String nomeVendedor;
    String cidadeVendedor;
    String bairroVendedor;
    String ruaVendedor;
    String loja;

    int idadeVendedor;

    double salarioBase = 1500;
    public List<Double> salarioRecebido = new ArrayList<Double>();

    public void apresentarseVendedor() {

        String msg = "Nome do vendedor "
                .concat(nomeVendedor)
                .concat(", ")
                .concat( idadeVendedor + " anos, trabalha na loja: ")
                .concat(loja);
                

        System.out.println(msg);
    }

    public void calcularBonus() {

        System.out.println("Bonus de salário: " + (salarioBase * 0.2));

    }

    public void calcularMedia() {

        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        double media = soma / salarioRecebido.size();

        System.out.println("A media dos salários é de: " + media);
    }
}