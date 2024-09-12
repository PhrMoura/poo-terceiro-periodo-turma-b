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
        this.itens = new ArrayList<>();
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

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public void setItens(Item item) {
        this.itens.add(item);
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

    public Date getDataVencimentoReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDataVencimentoReserva'");
    }

    public void setDataPagamento(Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataPagamento'");
    }
}
