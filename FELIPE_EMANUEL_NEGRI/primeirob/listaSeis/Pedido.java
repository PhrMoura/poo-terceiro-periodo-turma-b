package primeirob.listaSeis;

import java.util.Date;

public class Pedido {
    
    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    Cliente cliente;
    Vendedor vendedor;
    Item[] itens;

    public Pedido(int id, Cliente cliente, Vendedor vendedor, Item[] itens) {
        Long msDia = 86400000L;
        Long msDaquiTres = new Date().getTime() + (3 * msDia);

        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTres);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
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
    }
}

    


