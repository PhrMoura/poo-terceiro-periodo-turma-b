package Lista6;

public class Item {
    int id;
    String nome;
    String tipo;
    double valor;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao() {
        System.out.println("===========================");
        System.out.println("Item: \nId do pedido: " + id + "\nNome do pedido: " + nome + "\nTipo: " + tipo + "\nValor do pedido: R$" + valor);
        System.out.println("===========================");
    }

    public double getValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValor'");
    }
}
