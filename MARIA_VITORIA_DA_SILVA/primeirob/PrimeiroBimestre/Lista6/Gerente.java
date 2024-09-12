package primeirob.PrimeiroBimestre.Lista6;

public class Gerente extends Vendedor {
    public Gerente(String nome, int idade, String loja, double salarioBase, double[] salarioRecebido) {
        super(nome, idade, loja, salarioBase, salarioRecebido);
    }

    @Override
    double calcularBonus(){
        return salarioBase * 0.35;
    }

    @Override
    public String toString() {

        return 
                "===========================\n"+
                "Gerente\n" +
                "Nome: " + nome + 
                "\nIdade:" + idade +
                "\nloja:" + loja + 
                "\nsalario base: " + salarioBase +
                "\nsalario recebido: " + salarioRecebido[0] + ", " + salarioRecebido[1] + ", " + salarioRecebido[2] +
                "\n===========================";
    }

}