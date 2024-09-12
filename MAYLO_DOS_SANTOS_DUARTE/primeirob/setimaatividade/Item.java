package primeirob.setimaatividade;

public class Item {

    int id;
    String nome, tipo;
    Double valor;

    public Item(int id, String nome, String tipo, Double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public void gerarDescricao() {
        System.out.printf("ID: %3d | Nome: %10s | Valor: %.2f | Tipo: %5s\n", id, nome, valor ,tipo);
    }
        
    
}
