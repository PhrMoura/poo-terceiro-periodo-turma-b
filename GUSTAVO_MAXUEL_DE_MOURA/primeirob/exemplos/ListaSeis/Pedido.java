package primeirob.exemplos.ListaSeis;

import java.util.Date;

public class Pedido extends Item {
    int id;
    Date dataCriacao = new Date();
    Date dataPagamento;
    Date dataVencimentoReserva;
    String cliente;
    String vendedor;
    Loja loja;
    Item[] itens;

    public double calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.valor[0];
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido criado em: " + dataCriacao +
                ", Valor Total: R$" + valor[0]);
    }

}
