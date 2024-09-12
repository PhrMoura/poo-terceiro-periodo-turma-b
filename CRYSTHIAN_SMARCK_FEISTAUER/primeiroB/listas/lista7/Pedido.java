package listas.lista7;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
int id;
Date dataCriacao;
Date dataPagamento;
Date dataVencimentoReserva;
String cliente;
String vendedor;
String loja;
ArrayList<Double> itens = new ArrayList<>();

public Pedido(){

}

public Pedido(int id, Date dataCriacao, Date dataPagamento, Date dataVencimentoReserva, String cliente, String vendedor, String loja, ArrayList<Double> itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.dataPagamento = dataPagamento;
        this.dataVencimentoReserva = dataVencimentoReserva;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
}

    public void adicionarDataCriacao(Date data){
    this.dataCriacao = data;
}
public double calcularValorTotal(){
    double soma = 0;
    for (int i = 0; i < itens.size() ; i++) {
        soma += itens.get(i);
    }
    System.out.println("Valor total do pedido: " + soma);
    return soma;
}
public Date getDataCriacao(){
    return dataCriacao; // teste
}

public void gerarDescricaoVenda(){
    System.out.println("Data criação pedido: " + dataCriacao + " valor total: " + calcularValorTotal());
}

public void adicionarItem(Double valorItem){
    if (valorItem != null && valorItem > 0){
        itens.add(valorItem);
    }else {
        System.out.println("Insira um valor valido, tem que ser positivo e não nulo");
    }
}

public void listarItens(){
    if(itens.isEmpty()){
        System.out.println("Sem itens cadastrados");
    }else {
        for (int i = 0; i < itens.size(); i++){
            System.out.println("Item: " + itens.get(i));
        }
    }
}


}
