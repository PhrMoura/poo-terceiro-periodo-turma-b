package primeirob.atividades.listaseis;

public class Gerente extends Endereco {
  String nome, loja;
  int idade;
  double salarioBase;
  double[] salarioRecebido = new double[3];

  public void apresentarse() {
    System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e trabalho na " + loja);
  }

  public double calcularMedia() {
    double soma = 0;
    for (int j = 0; j < salarioRecebido.length; j++) {
      soma += salarioRecebido[j];
    }
    return soma / salarioRecebido.length;
  }

  public double calcularBonus() {
    return salarioBase * 0.35;
  }

}
