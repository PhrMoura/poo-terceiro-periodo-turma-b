package primeirob.listas.lista6;

public class Gerente extends Pessoa {
  private Loja loja;
  private double salarioBase;

  double[] salarioRecebido = new double[3];

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

  public Loja getLoja() {
    return loja;
  }

  public void setLoja(Loja loja) {
    this.loja = loja;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  public void apresentarse() {
    System.out.println(
        "Nome gerente " + getNome() + " idade " + getIdade() + " loja " + loja.getNomeFantasia() + " salario "
            + getSalarioBase());
  }
}
