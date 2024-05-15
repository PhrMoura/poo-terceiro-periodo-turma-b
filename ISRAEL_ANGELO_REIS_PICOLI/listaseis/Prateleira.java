package listaseis;

public class Prateleira {

    private Item[] itens;

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public Prateleira(Item[] itens){
        this.itens = itens;
    }
}
