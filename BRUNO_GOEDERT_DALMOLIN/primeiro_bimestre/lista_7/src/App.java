import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var ctrlItem = new ControllerItem();
        Scanner scanner = new Scanner(System.in);

        var option = 0;

        var endereco = new Endereco("Parana", "Cascavel", "Centro", "Araucaria", "123");

        System.out.println("Criando classe Vendedor!");
        var novoVendedor = new Vendedor("Felipe", 10, endereco, 2000.0, Arrays.asList(2000.0, 3000.0, 4000.0));

        System.out.println("Criando classe Cliente!");
        var enderecoNovoCliente = new Endereco("Parana", "Quedas do Iguaçu", "Centro", "Sem Fim", "123");
        var novoCliente = new Cliente("Bruno Goedert Dalmolin", 20, enderecoNovoCliente);
        System.out.println("Apresentando cliente criado: " + novoCliente.toString() + "\n\n");

        while (option != 4) {
            System.out.println("\n\n");
            System.out.println("--- My Plant System ---\n\n");

            System.out.println("(1) Cadastrar item.");
            System.out.println("(2) Listar items cadastrados.");
            System.out.println("(3) Realizar venda.");
            System.out.println("(4) Sair.");

            System.out.println("");
            System.out.print("Informe uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n\n");
                    System.out.println("OPÇÃO SELECIONADA: CADASTRAR ITEM!\n");

                    System.out.print("Informe o nome do item: ");
                    String nome = scanner.next();

                    System.out.println("");

                    System.out.print("Informe o tipo do item: ");
                    String tipo = scanner.next();

                    System.out.println("");

                    System.out.print("Informe o valor do item: ");
                    double valor = scanner.nextDouble();

                    ctrlItem.salvar(new Item(nome, tipo, valor));

                    break;

                case 2:
                    System.out.println("\n\n");
                    System.out.println("OPÇÃO SELECIONADA: LISTAR ITENS CADASTRADOS!\n");

                    ctrlItem.listar();
                    System.out.println("");

                    System.out.println("Pressione enter para continuar!");
                    Scanner scanner2 = new Scanner(System.in);
                    scanner2.nextLine();
                    break;

                case 3:
                    System.out.println("\n\n");
                    System.out.println("OPÇÃO SELECIONADA: REALIZAR VENDA!\n");

                    int opcaoContinuarProdutos = 0;
                    List<Item> itensVenda = new ArrayList<>();

                    while (opcaoContinuarProdutos != 2) {
                        ctrlItem.listar();

                        System.out.println("");

                        System.out.print("Selecione o item que deseja vender: ");
                        int idItem = scanner.nextInt();

                        Item itemSelecionado = ctrlItem.getItemById(idItem);

                        if (itemSelecionado.getId() == 0) {
                            System.out.println("\n\n");
                            System.out.println("ATENÇÃO ITEM NÄO ENCONTRADO!!!");
                            System.out.println("SELECIONE UM ID VALIDO!!!");
                            System.out.println("Pressione enter para continuar!");
                            Scanner scanner4 = new Scanner(System.in);
                            scanner4.nextLine();
                            continue;
                        }

                        itensVenda.add(itemSelecionado);

                        System.out.print("\n\n");
                        System.out.println("OPÇÕES:");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        System.out.print("Deseja adicionar mais itens ao pedido: ");
                        opcaoContinuarProdutos = scanner.nextInt();
                    }

                    var processaPedido = new ProcessaPedido();

                    processaPedido.processar(novoCliente, novoVendedor, itensVenda);

                    System.out.println("VENDA FINALIZADA COM SUCESSO! ");
                    
                    System.out.println("Pressione enter para continuar!");
                    Scanner scanner5 = new Scanner(System.in);
                    scanner5.nextLine();

                    break;

                default:
                    System.out.println("Erro: Opção inexistente");
                    System.out.println("Pressione enter para continuar!");
                    Scanner scanner3 = new Scanner(System.in);
                    scanner3.nextLine();
                    break;
            }
        }
    }
}
