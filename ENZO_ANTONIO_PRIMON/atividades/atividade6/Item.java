package atividades.atividade6;

public class Item {

    private Integer id;
    private String nome;
    private String tipo;
    private Double valor;

    public Item(Integer id, String nome, String tipo, Double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public String getTipo() {
        return tipo;
    }


    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", valor=" + valor + "]";
    }

}

