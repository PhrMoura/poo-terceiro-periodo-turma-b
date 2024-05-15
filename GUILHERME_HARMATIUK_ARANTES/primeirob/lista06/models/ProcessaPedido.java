package primeirob.lista06.models;

import java.util.Date;
import java.util.List;

import primeirob.lista05.models.Cliente;
import primeirob.lista05.models.Loja;
import primeirob.lista05.models.Vendedor;
import primeirob.lista06.utilities.DateUtilities;

public class ProcessaPedido {

    public static Pedido processar (
        List<Item> items , 
        Cliente cliente, 
        Vendedor vendedor,
        Loja loja
    ) {
        Pedido novoPedido = new Pedido();

        int id = (int)Math.floor(Math.random() *(100 - 1 + 1) + 1);
        novoPedido.id = (long) id;
        
        novoPedido.cliente = cliente;
        novoPedido.vendedor = vendedor;
        novoPedido.loja = loja;

        novoPedido.listaItems = items;

        novoPedido.dataCriacao = new Date();
        novoPedido.dataPagamento = null;


        DateUtilities dateUtilities = new DateUtilities();

        novoPedido.dataVencimentoReserva = dateUtilities.afterXDays(3l);

        return novoPedido;
    
    }

    
    public static void confirmarPaagamento (Pedido pedido) {
        // - Método privado confirmarPagamento(confirma caso a reserva não esteja vencida, 
        // verificar se data atual não é superior a dataVencimentoReserva).
        

        System.err.println(pedido);
        System.err.println(pedido.id);
        System.err.println(pedido.dataCriacao);
        if (new Date().after(pedido.dataVencimentoReserva)) {
            System.err.println("Pedido já está vencido.");
        } else {
            if (pedido.dataPagamento == null) {
                System.err.println("Pedido foi pago com sucesso.");
                pedido.dataPagamento = new Date();
            } else {
                System.err.println("Pedido já foi pago");
            }
        }
    }
}
