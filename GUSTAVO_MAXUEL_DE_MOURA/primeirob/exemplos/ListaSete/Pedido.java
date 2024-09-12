package primeirob.exemplos.ListaSete;

import java.util.Date;

class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private String cliente;
    private String vendedor;
    private Loja loja;
    private Item[] itens;

    public Pedido() {
        this.dataCriacao = new Date(); 
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        this.dataCriacao = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Descrição do Pedido:");
        System.out.println("ID do Pedido: " + getId());
        System.out.println("Cliente: " + getCliente());
        System.out.println("Vendedor: " + getVendedor());
        System.out.println("Data de Criação: " + dataCriacao);

        if (itens != null && itens.length > 0) {
            System.out.println("Itens no Pedido:");
            for (Item item : itens) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("Nenhum item cadastrado no pedido.");
        }
    }
}