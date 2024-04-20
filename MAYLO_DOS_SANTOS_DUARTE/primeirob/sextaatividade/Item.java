package primeirob.sextaatividade;

public class Item {

    int id;
    String nome, tipo;
    Double valor;

    // public void gerarDescricao() {
    //     String msg = id + " | "
    //         .concat(nome)
    //         .concat(" | ")
    //         .concat("Valor: " + valor)
    //         .concat(" | ")
    //         .concat("Tipo: " + tipo);

    //     System.out.println(msg);
    // }

    public void gerarDescricao() {
        System.out.printf("ID: %3d | Nome: %10s | Valor: %.2f | Tipo: %5s\n", id, nome, valor ,tipo);
    }
        
    
}
