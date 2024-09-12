package listaCinco_listaSeis;
import java.util.Date;


public class Pedido{

    private Integer id;

    private Date dataCriacao;

    private Date dataPagamento;

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return DataVencimentoReserva;
    }

    private Date DataVencimentoReserva;

    private Cliente cliente;

    private Vendedor vendedor;

    private Item[] itens;

    public Pedido(Integer id, Cliente cliente, Vendedor vendedor, Item[] itens) {
        Long msDia = 864000000l;
        Long msDaquiTres = new Date().getTime() + (3 * msDia);

        this.id = id;
        this.dataCriacao = new Date();
        this.DataVencimentoReserva = new Date(msDaquiTres);
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }
    
    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        DataVencimentoReserva = dataVencimentoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public double calcularValorTotal(){
        double total = 0d;

        for (Item item : itens) {
            total += item.getValor();
        }

        return total;
    }

    public void gerarDescricaoVenda(){
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor total do pedido: " + calcularValorTotal());
    }
}
