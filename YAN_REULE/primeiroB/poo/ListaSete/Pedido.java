package poo.ListaSete;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date dataCriacao = new Date();
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente = new Cliente();
    private Vendedor vendedor = new Vendedor();
    private Loja loja = new Loja(null, null, null, null, null, null);
    private ArrayList<Item> itens;

    public Pedido(Integer id, Cliente cliente, Vendedor vendedor, ArrayList<Item> itens2) {
        Long msDia = 86400000l;
        Long msDaquiTres = new Date().getTime() + (3 * msDia);

        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTres);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens2;
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total do Pedido: " + calcularValorTotal());
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


    public ArrayList<Item> getItens() {
        return itens;
    }
}
