package primeirob.listaSeis;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    
    Integer id;

    Date dataCriacao;

    Date dataPagamento;

    Date dataVencimentoReserva;

    Cliente cliente;

    Vendedor vendedor;

    String loja;

    Integer quantidade;

    ArrayList<Item> itens;

    public Pedido(Cliente cliente, Vendedor vendedor, Item item) {
        long msDia = 86400000l;
        long msDaquiTresDias = new Date().getTime() + (3 * msDia);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.dataVencimentoReserva = new Date(msDaquiTresDias);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.valor * itens.size();
        }
        return total;
    }

    public void gerarDescricaoVenda(){
        System.out.println("Pedido criado em " + dataCriacao);
        System.out.println("No valor total de R$" + calcularValorTotal());
    }

    public void adicionarItem(Item item) {
        if (itens == null) {
            itens = new ArrayList<Item>();
        }
        itens.add(item); 
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
