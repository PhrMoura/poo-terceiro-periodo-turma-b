package poo.ListaSete;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    String cliente;
    String vendedor;
    String loja;
    ArrayList<Item> itens;

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.valor;
        }
        return total;
    }

    // Método para gerar descrição da venda
    public void gerarDescricaoVenda() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total do Pedido: " + calcularValorTotal());
    }

}

