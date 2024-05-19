package primeirob.listas.lista6;

public class Vendedor extends Pessoa {
  private Loja loja;
  private double salarioBase;
  private double[] salarioRecebido = new double[3];

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

  public double calcularMedia() {
    double soma = 0;
    for (int j = 0; j < salarioRecebido.length; j++) {
      soma += salarioRecebido[j];
    }
    return soma / salarioRecebido.length;
  }

  public void apresentarse() {
    System.out.println("Nome vendedor " + getNome() + " Idade " + getIdade() + " loja " + loja.getNomeFantasia()
        + " salario " + getSalarioBase());
  }

}
