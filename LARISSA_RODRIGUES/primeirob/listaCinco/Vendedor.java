package primeirob.listaCinco;

public class Vendedor {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    int salarioBase;
    int[] salarioRecebido = new int[] {1800 , 1800 , 1800};

    public void apresentarse() {
        String apresentacao = "Vendedor: "
            .concat(nome)
            .concat("\nIdade: " + idade)
            .concat("\nLoja: ")
            .concat(loja);
            System.out.println(apresentacao);
    }

    public void calcularMedia() {
        double soma = 0;
        int cont = 0;
        for (int i = 0 ; i < 3 ; i++) {
            soma = soma + salarioRecebido[i];
            cont++;
        }
        double mediaSalario = soma/cont;
        System.out.println("Média salarial: R$" + mediaSalario);
    }

    public void calcularBonus() {
        double bonus = salarioBase * 0.2;
        System.out.println("Bônus do salário: R$" + bonus);
        System.out.println("---------------");
    }
}
