package primeirob.listaSeis;

public class Item {
    
    Integer id;

    String nome;

    String tipo;

    Double valor;

    public void gerarDescricao() {

        System.out.println("ID do item: " + id);
        System.out.println("Nome do item: " + nome);
        System.out.println("Tipo do item: " + tipo);
        System.out.println("Valor do item: " + valor);

    }

    public Item (Integer id, String nome, String tipo, Double valor) {
        
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;

    }

}
