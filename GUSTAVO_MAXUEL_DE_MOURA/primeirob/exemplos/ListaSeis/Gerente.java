package primeirob.exemplos.ListaSeis;

public class Gerente extends Pessoa {
    String nome;
    int idade;
    Loja loja;
    double salarioBase;
    Double salarioRecebido;

    public void apresentarSe() {
        String msg = "Nome: "
                .concat(nome)
                .concat(", tenho " + idade + " anos")
                .concat(" e trabalho na " + loja.nomeFantasia);
        System.out.println(msg);

    }

    public void calcularMedia() {

    }

    public double calcularBonus() {
        return salarioBase * 0.35;

    }

}
