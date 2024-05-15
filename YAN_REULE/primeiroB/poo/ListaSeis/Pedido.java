package poo.ListaSeis;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    Item novoItem = new Item();

    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    String cliente;
    String vendedor;
    String loja;
    ArrayList<Item> itens;

    public Pedido() {
        this.itens = new ArrayList<>(); // Inicialização da lista no construtor
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.valor;
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total do Pedido: " + calcularValorTotal());
    }

}

