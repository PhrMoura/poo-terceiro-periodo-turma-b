package primeirob.myyplant;
  
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroItem {
    private static List<Item> itensCadastrados = new ArrayList<>();
    private static int proximoId = 1;
    
    public static void cadastrarNovoItem() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cadastro de Novo Item:");
        
        System.out.print("Nome do Item: ");
        String nome = scanner.nextLine();
        
        System.out.print("Categoria do Item: ");
        String categoria = scanner.nextLine();
        
        System.out.print("Preço do Item: ");
        float preco = scanner.nextFloat();
        
        Item novoItem = new Item(proximoId++, nome, categoria, preco);
        itensCadastrados.add(novoItem);
        
        System.out.println("Item cadastrado com sucesso!");
        scanner.close();
    }
    
    
    public static void listarItensCadastrados() {
        if (itensCadastrados.isEmpty()) {
            System.out.println("Não há itens cadastrados.");
        } else {
            System.out.println("Itens Cadastrados:");
            for (Item item : itensCadastrados) {
                System.out.println(item);
            }
        }
    }
}

