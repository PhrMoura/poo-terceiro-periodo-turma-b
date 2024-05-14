package primeirob.sextaatividade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    int id;
    double valorTotal = 0;
    Date dataCriacao = new Date();
    Date dataPagamento = new Date();
    Date dataVencimentoReserva = new Date();
    Cliente cliente = new Cliente();
    Vendedor vendedor = new Vendedor();
    Loja loja = new Loja();

    List<Item> itens = new ArrayList<>(30);

    public void calcularValorTotal() {
        valorTotal = 0;
        
        for (Item item : itens) {
            valorTotal += item.valor;
        }

        System.out.println("O valor total do pedido é: " + valorTotal);
        System.out.println();
    }

    public void gerarDescricaoVenda() {
        valorTotal = 0;

        for (Item item : itens) {
            valorTotal += item.valor;
        }
        
        String msg = "Data do Pedido: "
            .concat(dataCriacao.toString())
            .concat("\n")
            .concat("Valor total do pedido: " + valorTotal);

        System.out.println(msg);
    }

}
