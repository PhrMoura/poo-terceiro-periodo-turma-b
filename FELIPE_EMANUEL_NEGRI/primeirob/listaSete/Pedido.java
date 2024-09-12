package primeirob.listaSete;

import java.util.ArrayList;
import java.util.Date;

public class Pedido implements Corps {
    
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private ArrayList<Item> itens;

    public Pedido(int id, ArrayList<Item> itens){
        Long msDia = 86400000L;
        Long msDaquiTres = new Date().getTime() + (3 * msDia);

        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTres);
        this.itens = itens;
    }

    public Pedido(){

    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.valor;
        }
        return total;
    }

    
    public void gerarDescricaoVenda() {
        System.out.println("Data de criação do pedido: " + dataCriacao);
        System.out.println("Valor total do pedido: " + calcularValorTotal());
        System.out.println("Data de reserva vence: " + dataVencimentoReserva);
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
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    @Override
    public void corpMilitech() {
        System.out.println("Pedido feito em parceria com a corporação Militech");
    }

    @Override
    public void corpBiotechnica() {
        System.out.println("Pedido feito em parceria com a corporação BioTechnica");
    }

    @Override
    public void corpArasaka() {
        System.out.println("Pedido feito em parceria com a corporação Arasaka");
    }

   
    
}

    


