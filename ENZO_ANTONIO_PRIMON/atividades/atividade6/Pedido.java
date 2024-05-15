package atividades.atividade6;

import java.util.Date;
import java.util.ArrayList;

public class Pedido extends Item {
    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimento = new Date(dataCriacao.getTime() + (3 * 86400000 ));
    Cliente cliente;
    Vendedor vendedor;
    String loja;
    ArrayList<Item> itens = new ArrayList<>();
    double valorTotal; 

    public void calcularValorTotal() {
        valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getValor();
        }
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de criação do pedido: " + dataCriacao);
        System.out.println("Valor total do pedido: " + valorTotal);
    }
}
