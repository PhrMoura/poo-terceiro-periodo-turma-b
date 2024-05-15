package primeirob.atividades.listaseis;

public class Item {
  String nome, tipo;
  int id;
  double valor;

  public void gerarDescricao() {
    System.out.println("#" + id + " " + nome);
    System.out.println("Item do tipo: " + tipo + " R$ " + valor);
  }

}
