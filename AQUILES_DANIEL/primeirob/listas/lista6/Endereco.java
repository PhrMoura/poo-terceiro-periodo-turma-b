package primeirob.listas.lista6;

public class Endereco {
  private String cidade;
  private String bairro;
  private String rua;
  private int numero;

  public Endereco() {

  }

  public Endereco(String cidade, String bairro, String rua, int numero) {
    this.cidade = cidade;
    this.bairro = bairro;
    this.rua = rua;
    this.numero = numero;
  }

  public String getCidade() {
    return cidade;
  }

  public String getBairro() {
    return bairro;
  }

  public String getRua() {
    return rua;
  }

  public int getNumero() {
    return numero;
  }

  public void apresentarse() {
    System.out.println("Nome cidade " + cidade + " Bairro " + bairro + " Rua " + rua + " numero " + numero);
  }
}
