package primeirob.lista07;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import primeirob.lista06.models.Item;

public class ItemUtilities {
    public static Item cadastro () {
        Item item = new Item();

        Scanner itemInput = new Scanner(System.in);

        String nome = "";
        Long id = -1l;
        String tipo = "";
        BigDecimal valor = new BigDecimal(0);

        try {
            System.out.println("Escolha um nome para o produto:");
            while (nome.length() <= 0) {
                nome = itemInput.nextLine();
            }
            System.out.println("Escolha um id para o produto:");
            System.out.println(
                "Veja que, caso o ID digitado não seja uma chave única," + 
                "poderá haver erros no resto da aplicação"
            );
            while (id < 0) {
                id = itemInput.nextLong();
            }
            System.out.println("Escolha o tipo do produto");
            while (tipo.length() <= 0) {
                tipo = itemInput.nextLine();
            }
            System.out.println("Escolha o preço do produto");
            while (valor.compareTo(BigDecimal.ZERO) <= 0) {
                valor = itemInput.nextBigDecimal();
                System.err.println(valor);
                System.out.println(valor.compareTo(valor));
            }
        } finally {
            item.nome = nome;
            item.id = id;
            item.tipo = tipo;
            item.valor = valor;
            // itemInput.close();
        }

        

        return item;
    }

    public static void listarItems(List<Item> listaItems) {
        listaItems.forEach(item -> {
            item.gerarDescricao();
        });
    } 
}
