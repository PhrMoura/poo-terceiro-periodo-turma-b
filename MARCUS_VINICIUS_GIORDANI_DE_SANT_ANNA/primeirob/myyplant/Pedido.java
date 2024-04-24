package primeirob.myyplant;

import java.util.Date;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private ItemPedido[] itens;

    public Pedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, Cliente cliente, Vendedor vendedor, Loja loja, ItemPedido[] itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento != null ? dataPagamento : new Date(); // Definindo a data de pagamento como a data atual se for nula
        this.dataVencimentoReserva = dataVencimentoReserva != null ? dataVencimentoReserva : calcularDataVencimentoReserva(); // Calculando a data de vencimento da reserva se for nula
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens != null ? itens : new ItemPedido[0]; // Inicializando itens como um array vazio se for nulo
    }
    
    

    private Date calcularDataVencimentoReserva() {
        long tresDiasEmMs = 3 * 24 * 60 * 60 * 1000L; // 3 dias em milissegundos
        return new Date(dataCriacao.getTime() + tresDiasEmMs);
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getPrecoTotal() * item.getQuantidade();
        }
        return total;
    }

    public String gerarDescricaoVenda() {
        return "Pedido criado em " + dataCriacao.toString() + ". Valor total: R$" + calcularValorTotal();
    }

    public boolean confirmarPagamento() {
        Date dataAtual = new Date();
        return dataAtual.before(dataVencimentoReserva);
    }

    // Getter e Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter para dataCriacao
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    // Getter e Setter para dataPagamento
    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    // Getter e Setter para dataVencimentoReserva
    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    // Getter e Setter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Getter e Setter para vendedor
    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    // Getter e Setter para loja
    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    // Getter e Setter para itens
    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }



    public void adicionarItemPedido(ItemPedido itemPedido) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarItemPedido'");
    }
}
