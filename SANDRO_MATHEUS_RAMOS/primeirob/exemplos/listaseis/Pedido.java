package primeirob.exemplos.listaseis;

import java.util.Date;

public class Pedido {
    
    private Integer id;

    private Date dataCriacao;

    private Date dataPagamento;

    private Date dataVencimentoReserva;

    private Cliente cliente;

    private Vendedor vendedor;

    private Item[] itens;

    public Pedido(Integer id, Cliente cliente, Vendedor vendedor, Item[] itens) {
        Long msDia = 86400000l;
        Long msDaquiTres = new Date().getTime() + (3 * msDia);
        
        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTres);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Integer getId() {
        return id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
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

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Item[] getItens() {
        return itens;
    }

}
