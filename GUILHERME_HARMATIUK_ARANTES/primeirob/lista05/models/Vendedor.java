package primeirob.lista05.models;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    public String nome;
    public Integer idade;
    public Loja loja;
    public String cidade;
    public String bairro;
    public String rua;
    public Double salarioBase;
    public List<Double> salarioRecebido = new ArrayList<Double>();

    public void apresentarse () {
        String msg = "Olá, meu nome é "
            .concat(nome)
            .concat(", tenho ")
            .concat(idade.toString())
            .concat(" anos e trabalho na loja ")
            .concat(loja.nomeFantasia);
        System.err.println(msg);
    } 
    public void calcularMedia () {
        Double total = 0.0;
        total = salarioRecebido.stream()
            .mapToDouble(Double::valueOf).sum();
        Double media = total / salarioRecebido.size();
        System.out.println("A média dos salários que este Vendedor recebeu é: " + media);
    } 
    public void calcularBonus () {
        System.err.println("Bonus: " + (salarioBase * 0.2));
    }
}
