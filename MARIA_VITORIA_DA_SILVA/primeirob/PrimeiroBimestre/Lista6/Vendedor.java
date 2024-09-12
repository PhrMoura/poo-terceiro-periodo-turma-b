package primeirob.PrimeiroBimestre.Lista6;

public class Vendedor {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase = 1500;
    double[] salarioRecebido = new double[]{150, 170, 200};

    public Vendedor(String nome, int idade, String loja, double salarioBase, double[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    double calcularBonus(){
        return salarioBase * 0.2;
    }

    public void apresentarse(){
        System.out.println("===========================");
        System.out.println("Nome do vendedor: " +nome+ "\nIdade do vendedor: " +idade+ "\nLoja do vendedor: " + loja);
        System.out.println("===========================");
    }
}
