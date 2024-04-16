package listacinco;

public class Vendedor {
    String nome;
    String idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    double[] salarioRecebido;

    public void apresentarse() {
        System.out.println("Vendedor: " + nome + " | Idade: " + idade + " | Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        double bonus = 0;
        bonus = salarioBase * 0.2;

        return bonus;
    }
}
