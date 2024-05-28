package atividades.atividade6;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private Integer id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> listaItens;

    public Pedido(Integer id, Cliente cliente, Vendedor vendedor, ArrayList<Item> listaItens) {
        Long msDia = 86400000l;
        Long msDaquiTres = new Date().getTime() + (3 * msDia);

        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTres);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.listaItens = listaItens;
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
     
    public void adicionarItem(Item item){
        this.listaItens.add(item);
    }

    public void listarItens(){
        for (Item item : listaItens) {
            System.out.println(item.toString());
        }
    }

}