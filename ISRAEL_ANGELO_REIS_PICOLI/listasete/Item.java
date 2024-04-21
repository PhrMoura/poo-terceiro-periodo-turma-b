package listasete;

import java.util.Random;

public class Item {

    private static final Random random = new Random();

    private Integer id;

    private String nome;

    private String tipo;

    private Double valor;

    public Item(String nome, String tipo, Double valor) {
        this.id = numeroRandomId();
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }


    public void gerarDescricao() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Tipo: " + tipo + " | Valor: " + valor);
    }

    private int numeroRandomId() {
        return random.nextInt(100) + 1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
