package primeiroB.listaSeis;

public class Funcionario extends Pessoa{
    String loja;
    int salarioBase;

    public void calcularMedia() {
        int[] salarioRecebido = new int[] {1800 , 1800 , 1800};
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
