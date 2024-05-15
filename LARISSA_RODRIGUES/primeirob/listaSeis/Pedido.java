package primeirob.listaSeis;

import java.util.Date;

public class Pedido{
    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    Cliente cliente;
    Vendedor vendedor;
    Item[] itens;
    float valorTotal;

    public Pedido(int id, Cliente cliente, Vendedor vendedor, Item[] itens) {
        Long msDia = 86400000l;
        Long msDaquiTresDias = new Date().getTime() + (3 * msDia);
        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTresDias);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public void calcularValorTotal() {

    }

    public void gerarDescricaoVenda() {
        System.out.println("Id: " + id + "\nData da criação: " + dataCriacao + "\nValor total: R$" + valorTotal);
    }

}
