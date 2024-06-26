package segundob.listas.lista2;

public class Produto {

  private String nome;

  private Double preco;

  public Produto(String nome, Double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public Double getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return String.format("Produto: %s, Preço: R$ %.2f", nome, preco);
  }
}
