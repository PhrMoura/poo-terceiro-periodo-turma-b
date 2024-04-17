package primeirob.atividades.listaseis;

import java.util.Date;

public class Pedido {
  String cliente;
  String vendedor;
  double valorTotal;
  Date dataCriacao, dataPagamento, dataVencimentoReserva;
  Item[] itens;

  public double calcularValorTotal() {
    for (int i = 0; i < itens.length; i++) {
      valorTotal += itens[i].valor;
    }
    return valorTotal;
  }

  public void gerarDescricaoVenda() {

  }

}
