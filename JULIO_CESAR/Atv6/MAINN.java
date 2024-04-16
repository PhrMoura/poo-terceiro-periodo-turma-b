public class maiNN {
    import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
        itens.add(new Item(1, "Camiseta", "Vestuário", 50));
        itens.add(new Item(2, "Tênis", "Calçado", 120));

        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(1, "Cliente1", "Vendedor1", "Loja A", itens);
    }
}
}
