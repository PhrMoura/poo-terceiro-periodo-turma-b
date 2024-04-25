package primeirob.atividades.listaseis;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
  private Cliente cliente;
  private Vendedor vendedor;
  private String empresa;
  private int valorTotal;
  private Date dataCriacao;
  private Date dataVencimentoReserva;
  private Date dataPagamento;
  private ArrayList<Item> listaItens = new ArrayList<>();

  public Pedido(Cliente cliente, Vendedor vendedor) {
    Long msDia = 86400000l;
    Long msDaquiTres = new Date().getTime() + (3 * msDia);

    this.dataCriacao = new Date();
    this.dataVencimentoReserva = new Date(msDaquiTres);
    this.cliente = cliente;
    this.vendedor = vendedor;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public Date getDataCriacao() {
    return dataCriacao;
  }

  public Date getDataVencimentoReserva() {
    return dataVencimentoReserva;
  }

  public Date getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public ArrayList<Item> getListaItens() {
    return listaItens;
  }

  public void setListaItens(ArrayList<Item> listaItens) {
    this.listaItens = listaItens;
  }

  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }

  public void mostrarLista() {
    for (int i = 0; i < listaItens.size(); i++) {
      System.out.println(listaItens.get(i));
    }
  }

  public void removerItemPorId(ArrayList<Item> listaDeItens, int id) {
    for (int i = 0; i < listaDeItens.size(); i++) {
      Item item = listaDeItens.get(i);
      if (item.getId() == id) {
        listaDeItens.remove(i);
        System.out.println("Item removido com sucesso.");
        return;
      }
    }
    System.out.println("Item com o ID especificado não encontrado.");
  }

  public int valorTotal() {
    for (int i = 0; i < listaItens.size(); i++) {
      valorTotal += listaItens.get(i).getValor();
    }
    return valorTotal;
  }

  public void gerarDescricaoVenda() {
    System.out.println("Valor total do pedido: " + valorTotal());
    System.out.println("Data da criação do pedido: " + dataCriacao);
    System.out.println("Data do vencimento da reserva: " + dataVencimentoReserva);
    System.out.println("Pedido feito em parceria com a " + empresa);
  }

}
