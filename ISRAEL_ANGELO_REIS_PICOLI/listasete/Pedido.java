package listasete;

import java.util.Date;
import java.util.Random;

public class Pedido {

    private static final Random random = new Random();

    private Integer id;

    private Date dataCriacao;

    private Date dataPagamento;

    private Date dataVencimentoReserva;

    private Cliente cliente;

    private Vendedor vendedor;

    private Item[] itens;

    private Loja loja;

    private String plantaEscolhida;

    private Integer quantidade;

    private Double valorTotal;

    private Double desconto;

    private Double troco;


    public Pedido(Integer id, Cliente cliente, Vendedor vendedor, Item[] itens, Loja loja, String plantaEscolhida,
            Integer quantidade, Double valorTotal, Double desconto, Double troco) {
        Long msDia = 864000000l;
        Long msDaquiTres = new Date().getTime() + (msDia * 3);

        this.id = numeroRandomId();
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(msDaquiTres);
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = itens;
        this.loja = loja;
        this.plantaEscolhida = plantaEscolhida;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.troco = troco;

    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de criação do pedido: " + dataCriacao);
        System.out.println("Planta escolhida: " + plantaEscolhida);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$" + valorTotal);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Troco: R$" + troco);

        Arasaka arasaka = new Arasaka();
        BioTechnica bioTechnica = new BioTechnica();
        MiliTech miliTech = new MiliTech();

        int numeroRandomEscolhido = random.nextInt(3);

        if(numeroRandomEscolhido == 0){
            parceria(arasaka);
        }
        else if(numeroRandomEscolhido == 1){
            parceria(bioTechnica);
        }
        else{
            parceria(miliTech);
        }
    }

    private static void parceria(IBancoDados banco) {
        banco.parceria();
    }

    public void calculoDesconto(double calculoDesconto) {
        desconto = valorTotal * calculoDesconto / 100;
        valorTotal -= desconto;
    }

    private int numeroRandomId() {
        return random.nextInt(100) + 1;
    }

    public Integer getId() {
        return id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Loja getLoja() {
        return loja;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public String getPlantaEscolhida() {
        return plantaEscolhida;
    }

    public void setPlantaEscolhida(String plantaEscolhida) {
        this.plantaEscolhida = plantaEscolhida;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }

    

}
