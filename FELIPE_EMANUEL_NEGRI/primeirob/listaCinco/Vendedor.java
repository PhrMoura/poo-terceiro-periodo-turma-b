package primeirob.listaCinco;

public class Vendedor {
    
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    double[] salarioRecebido = new double[3];
    

    public void apresentarse() {
        System.out.println("Nome do Vendedror: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);

    }

    public double calcularMedia() {
        double soma = 0;

        for (int j = 0; j < salarioRecebido.length; j++) {
            soma += salarioRecebido[j];
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
    
}
