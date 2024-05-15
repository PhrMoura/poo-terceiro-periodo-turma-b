package Lista6;

import java.util.Date;

public class Pedido {
    private int id;
    private double valor;
    private Date dataCriacao;
    private Date vencimentoReserva;

    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
        this.dataCriacao = new Date();

        // Calcula a data de vencimento da reserva (3 dias após a criação)
        long tresDiasEmMillis = 3 * 24 * 60 * 60 * 1000;
        this.vencimentoReserva = new Date(this.dataCriacao.getTime() + tresDiasEmMillis);
    }

    public void gerarDescricao() {
        System.out.println("===========================");
        System.out.println("Pedido: " + id);
        System.out.println("Valor total: " + valor);
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Data de vencimento da reserva: " + vencimentoReserva);
        System.out.println("===========================");
    }

     public void processarPedido() {
        Date dataAtual = new Date();
        if (dataAtual.after(vencimentoReserva)) {
            System.out.println("Pedido vencido");
        } else {
            System.out.println("Pedido em dia");
        }
    }
}



