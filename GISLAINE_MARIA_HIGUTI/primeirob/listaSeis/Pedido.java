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

    public Pedido (Integer id, Cliente cliente, Vendedor vendedor, String loja, ArrayList<Item> itens) {

        long msDia = 86400000l;
        long msDaquiTresDias = new Date().getTime() + (3 * msDia);
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
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
        this.itens.add(item);
    }

    public Date getDataVencimentoReserva() {
        Date dataVencimentoReserva = new Date(dataCriacao.getTime() + (86400000 * 3));
        return dataVencimentoReserva;
    }
}
