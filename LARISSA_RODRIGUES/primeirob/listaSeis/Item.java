package primeirob.listaSeis;

public class Item {
    int id;
    String nome;
    String tipo;
    int valor;

    public void gerarDescricao() {
        System.out.println("Id: " + id + "\nNome: " + nome + "\nTipo: " + tipo + "\nValor: R$" + valor);
    }

    public Item(int id, String nome, String tipo, int valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
}
