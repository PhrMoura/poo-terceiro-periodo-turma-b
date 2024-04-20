package Date;

import java.util.Date;

public class Data {
    public static void main(String[] args) {
        
        Date dataCriacao = new Date(124, 3, 5); // Pedido Realizado em 5 de Abril de 2024
        Date dataAtual = new Date();

        // Convertendo 3 dias em milissegundos
        long tresDiasEmMillis = 3 * 24 * 60 * 60 * 1000;

        // Adicionando 3 dias a data do pedido para obter a data limite então se a data do pedido foi dia 05/04 o pedido tem até o dia 08/04 para ser feito.
        Date dataVencimentoReserva = new Date(dataCriacao.getTime() + tresDiasEmMillis);
        
        if (dataAtual.after(dataVencimentoReserva)) {
            System.out.println("O pedido criado no dia: " + dataCriacao + " deve ser cancelado");
        } else {
            System.out.println("O pedido ainda está no prazo");
        }
    }
}

