package primeirob.listas.lista6;

public class GerenciarItens implements Menu {

  @Override
  public void cadastrar() {
    System.out.println("Item cadastrado!!");
  }

  @Override
  public void listar() {
    System.out.println("Itens listados!!");
  }

  @Override
  public void pedidoFeito() {
    System.out.println("Pedido finalizado, volte sempre !");
  }

}
