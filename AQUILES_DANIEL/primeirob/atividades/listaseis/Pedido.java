package primeirob.atividades.listaseis;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
  String cliente;
  String vendedor;
  double valorTotal;
  Date dataCriacao = new Date();
  Date dataVencimentoReserva = new Date();
  Date dataPagamento = new Date();
  ArrayList<Item> itens = new ArrayList<>();

  public double calcularValorTotal() {
    for (int i = 0; i < itens.size(); i++) {
      this.valorTotal += itens.get(i).valor;
    }
    return this.valorTotal;
  }

  public void adicionarItem(Item item) {
    this.itens.add(item);
  }

  public void gerarDescricaoVenda() {
    System.out.println("Valor total do pedido: " + calcularValorTotal());
    System.out.println("Data da criação do pedido: " + dataCriacao);
  }

}
