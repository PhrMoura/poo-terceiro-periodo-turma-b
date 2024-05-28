package listasete;

import java.util.Date;

public class ProcessaPedido {

    private Integer id = 10;

    public Pedido processar(Cliente cliente, Vendedor vendedor, Item[] itens, Loja loja, String plantaEscolhida,
            Integer quantidade, Double valorTotal, Double desconto, Double troco) {

        Pedido pedido = new Pedido(id++, cliente, vendedor, itens, loja, plantaEscolhida, quantidade, valorTotal,
                desconto, troco);

        return pedido;
    }

    public void confirmarPagamento(Pedido pedido) {
        Long msDia = 864000000l;
        Long msDaquiQuatro = new Date().getTime() + (msDia * 2);

        pedido.setDataPagamento(new Date(msDaquiQuatro));

        if (pedido.getDataPagamento().getTime() > pedido.getDataVencimentoReserva().getTime()) {
            System.out.println("Não foi possível concluir o pagamento, data de vencimento cumprida.");
        } else {
            System.out.println("Pagamento concluído na data: " + pedido.getDataPagamento());
        }
    }

    public void mostrarDatas(Pedido pedido) {
        System.out.println("Data de criação do pedido: " + pedido.getDataCriacao());
        System.out.println("Data de vencimento do pedido: " + pedido.getDataVencimentoReserva());

    }
}
