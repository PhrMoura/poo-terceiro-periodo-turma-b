package primeirob.lista06.models;

import java.math.BigDecimal;

public class Item {
    public Long id; 
    public String nome;
    public String tipo;
    public BigDecimal valor;


    public void easyGenerate(Long id, String nome, String tipo, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
    public void gerarDescricao() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("\n");
    }
}
