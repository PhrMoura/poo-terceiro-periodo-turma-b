package lista5;

public class Vendedor {

    String nome;
    Integer idade;
    String loja;
    String cidade;
    String bairro;
    String rua;

    Double salarioBase = 1300.50;
    Double[] salarioRecebido = new Double[] {1300.0, 1300.0, 1300.0};

    public void calcularMedia() {

        double sum = 0;

        for (int i = 0; i<=2; i++) {
            sum += salarioRecebido[i];
        }    

        System.out.println("Média Salarial: " + (sum/=3));
    }

    public void calcularBonus() {
        System.out.println("Salário Bônus: " + (salarioBase *= 0.2));

    }

    public void apresentarVendedor() {
        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Loja: " + loja);
    }


}
