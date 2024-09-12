package listaseis;

import java.util.Date;

public class Pedido {

    private Integer id;

    private Date dataCriacao;

    private Date dataPagamento;

    private Date dataVencimentoReserva;

    private Cliente cliente;

    private Vendedor vendedor;

    private Loja loja;

    private Item[] itens;

    public Pedido(Integer id, Cliente cliente, Vendedor vendedor, Item[] itens, Loja loja) {
        Long msDia = 864000000l;
        Long msDaquiTres = new Date().getTime() + (msDia * 3);

        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTres);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
        this.loja = loja;
        
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;

        for (Item item : itens) {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    public void gerarDescricaoVenda() {
        double valorTotal = calcularValorTotal();

        System.out.println(
                "Data de criação do pedido: " + this.dataCriacao + "\nValor total do pedido R$: " + valorTotal);

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

    public Loja getLoja() {
        return loja;
    }

    public Item[] getItens() {
        return itens;
    }

}
