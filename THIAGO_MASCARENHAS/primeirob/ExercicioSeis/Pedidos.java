package ExercicioSeis;

import java.util.Date;

public class Pedidos {
    // Classe Pedido
    class Pedido {
        // Atributos
        private Integer id;
        private Date dataCriacao;
        private Date dataPagamento;
        private Date dataVencimentoReserva;
        private String cliente;
        private String vendedor;
        private String loja;
        private Items.Item[] itens; // Use Items.Item to refer to the nested Item class

        // Construtor
        public Pedido (int id, Date dataCriacao, Date dataPagamento, String cliente, String vendedor,
              String loja, Items.Item[] itens) {
            this.id = id;
            this.dataCriacao = dataCriacao;
            this.dataPagamento = dataPagamento;
            this.dataVencimentoReserva = new Date(dataCriacao.getTime() + (3 * 24 * 60 * 60 * 1000));
            this.cliente = cliente;
            this.vendedor = vendedor;
            this.loja = loja;
            this.itens = itens;
        }

        // Método calcularValorTotal
        public double calcularValorTotal() {
            double total = 0;
            for (Items.Item item : itens) { // Iterate through Items.Item array
                total += item.getValor();
            }
            return total;
        }
        

        // Método gerarDescricaoVenda
        public void gerarDescricaoVenda() {
            System.out.println("Data de criação do pedido: " + dataCriacao);
            System.out.println("Valor total do pedido: " + calcularValorTotal());
            System.out.println("ID do produto : " + id);
            System.out.println("Data de pagamento: " + dataPagamento);
            System.out.println("Data de vencimento: " + dataVencimentoReserva);
            System.out.println("Nome do cliente: " + cliente);
            System.out.println("Nome do vendedor: " + vendedor);
            System.out.println("Nome da loja: " + loja);
        }
    }
}