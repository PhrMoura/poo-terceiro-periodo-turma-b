package poo.ListaSete;

public class Item {
    private int id;
    private String nome;
    private String tipo;
    private Double valor;

    public Item(int id, String nome, String tipo, Double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
    }

    public Double getValor() {
        return valor;
    }
}
