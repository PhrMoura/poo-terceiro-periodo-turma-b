package primeirob.lista06.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import primeirob.lista05.models.Cliente;
import primeirob.lista05.models.Loja;
import primeirob.lista05.models.Vendedor;

public class Pedido {
    public Long id;
    public Date dataCriacao;
    public Date dataPagamento;
    public Date dataVencimentoReserva; // Daqui a 3 dias da dataCriacao.
    
    public Cliente cliente;
    public Vendedor vendedor;
    public Loja loja;

    public List<Item> listaItems;


    public BigDecimal calcularValorTotal () {
        BigDecimal total = new BigDecimal(0);
        this.listaItems.forEach(item -> {
            total.add(item.valor);
        });
        // TODO: Percorrer o list itens, pegar os valor deles e somar.
        return new BigDecimal(0.0);
    }

    public void gerarDescricaoVenda () {
        System.out.println("Data de Criação do Pedido: " + dataCriacao);
        System.out.println("Valor Total do Pedido: " + calcularValorTotal());
    }
}
