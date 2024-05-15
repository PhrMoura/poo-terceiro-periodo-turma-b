import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ControllerItem implements IControllerItems {
    public List<Item> lItens = new ArrayList<>();
    private int lastIdProduto = 0;

    @Override
    public void salvar(Item novoItem) {
        lastIdProduto++;

        novoItem.setId(lastIdProduto);

        lItens.add(novoItem);

        System.out.println("Novo item cadastrado! (" + novoItem.getNome() + ").");
    }

    @Override
    public void listar() {
        System.out.println("Listando itens cadastrados: ");
        for (Item item : lItens) {
            System.out
                    .println("ID: " + item.getId() + ". Nome: " + item.getNome() + ". Valor: " + item.getValor() + ".");
        }

        if (lItens.isEmpty()) {
            System.out.println("Não existem itens cadastrados!!!");
        }
    }

    @Override
    public Item getItemById(int id) {
        Optional<Item> item = lItens.stream().filter(i -> i.getId() == id).findFirst();
        ;

        if (item.isPresent()) {
            return item.get();
        } else {
            return new Item(0, "ERRO", "ERRO", 0.0);
        }
    }

}
