package primeirob.myyplant;

public class ItemPedido {
    private Item item;
    private int quantidade;

    public ItemPedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }
    

    // Getter e Setter para item
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    // Getter e Setter para quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para obter o preço total do item no pedido
    public double getPrecoTotal() {
        return item.getValor() * quantidade;
    }
}
