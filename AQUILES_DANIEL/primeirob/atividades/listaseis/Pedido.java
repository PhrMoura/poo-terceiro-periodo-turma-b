package primeirob.atividades.listaseis;

import java.util.Date;

// ARRUMAR ESSA HERANÇA
public class Pedido extends ProcessarPedido {
  String cliente;
  String vendedor;
  double valorTotal;
  Date dataCriacao = new Date();
  Date dataVencimentoReserva = new Date();
  Date dataPagamento;
  Item[] itens;

  public double calcularValorTotal() {
    for (int i = 0; i < itens.length; i++) {
      valorTotal += itens[i].valor;
    }
    return valorTotal;
  }

  // ESSE VALOR TOTAL ESTA INDO ZERADO
  public void gerarDescricaoVenda() {
    System.out.println("Valor total do pedido: " + valorTotal);
    System.out.println("Data da criação do pedido: " + dataCriacao);
  }

}
