package primeirob.ListaCinco;

import java.util.ArrayList;

public class Vendedor {
    String nome;

    Integer idade;

    String loja;

    String cidade;

    String bairro;

    String rua;

    double salarioBase;

    ArrayList<Double> salarioRecebido = new ArrayList<>();

    public Vendedor(String nome, Integer idade, String loja){
    
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioRecebido.add(1200.0);
        this.salarioRecebido.add(1300.0);
        this.salarioRecebido.add(1500.0);

    }

    public void apresentarSe() {
        
        String msg = "Nome do vendedor: "
                .concat(nome)
                .concat(", de " + idade)
                .concat(" anos de idade, que trabalha na loja ")
                .concat(loja);

        System.out.println(msg);

    }

    public double calcularMedia(){
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;  
        }
        return soma / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
