package primeirob.atividades.listaseis;

public class Item {
  private int id;
  private String nome;
  private String tipo;
  private double valor;

  public Item() {

  }

  public Item(int id, String nome, String tipo, double valor) {
    this.id = id;
    this.nome = nome;
    this.tipo = tipo;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "ID: " + id + ", Nome: " + nome + ", Tipo; " + tipo + ", Valor: " + valor;
  }

}
