package primeirob.setimaatividade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;

    private double valorTotal = 0;

    private Date dataCriacao = new Date();
    private Date dataPagamento = new Date();
    private Date dataVencimentoReserva = new Date();

    private Cliente cliente;

    private Vendedor vendedor;

	private Loja loja;

    private List<Item> itens = new ArrayList<>(30);

    public Pedido (int id, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> items) {
        long msDate = 86400000l;
        
        this.id = id;
        this.dataCriacao = new Date(); 
        this.dataVencimentoReserva = new Date(new Date().getTime() + (msDate * 3));
        this.cliente = cliente;
        this.vendedor = vendedor;
		this.loja = loja;
        this.itens = items;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        
        for (Item item : itens) {
            valorTotal += item.valor;
        }

        return valorTotal;
    }
    
	public int getId() {
		return id;
	}
	public double getValorTotal() {
		return valorTotal;
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
	public List<Item> getItens() {
		return itens;
	}
	public Loja getLoja() {
        return loja;
    }
	public void setLoja(Loja loja) {
        this.loja = loja;
    }

}
