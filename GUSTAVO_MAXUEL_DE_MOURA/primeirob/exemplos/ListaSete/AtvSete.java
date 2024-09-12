package primeirob.exemplos.ListaSete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class AtvSete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Item> itensDisponiveis = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        int opcao = 0;

        while (opcao != 3) {
            System.out.println(
                "---------------------------\n" +
                "Menu de opções:\n" +
                "[1] Cadastrar novo item\n" +
                "[2] Listar itens\n" +
                "[3] Sair\n" +
                "[4] Cadastrar novo pedido\n" +
                "[5] Listar pedidos\n" +
                "--------------------------"
            );
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:  
                    System.out.print("Digite o ID do item: ");
                    int idItem = entrada.nextInt();

                    System.out.print("Digite o nome do item: ");
                    String nome = entrada.next();

                    System.out.print("Digite o preço do item: ");
                    double preco = entrada.nextDouble();

                    itensDisponiveis.add(new Item(idItem, nome, preco));
                    System.out.println("Item cadastrado com sucesso!");
                    break;

                case 2:  
                    System.out.println("Itens cadastrados:");
                    for (Item item : itensDisponiveis) {
                        System.out.println(item);
                    }
                    break;

                case 3:  
                    System.out.println("Saindo do programa...");
                    break;

                case 4:  
                    Pedido novoPedido = new Pedido();
                    
                    System.out.print("Digite o ID do pedido: ");
                    int idPedido = entrada.nextInt();
                    novoPedido.setId(idPedido);

                    System.out.print("Digite o nome do cliente: ");
                    String cliente = entrada.next();
                    novoPedido.setCliente(cliente);

                    System.out.print("Digite o nome do vendedor: ");
                    String vendedor = entrada.next();
                    novoPedido.setVendedor(vendedor);

                    List<Item> itensDoPedido = new ArrayList<>();
                    System.out.println("Quantos itens o pedido deve ter?");
                    int numItens = entrada.nextInt();

                    for (int i = 0; i < numItens; i++) {
                        System.out.println("Escolha um item pelo ID:");
                        for (Item item : itensDisponiveis) {
                            System.out.println(item);
                        }

                        int itemId = entrada.nextInt();
                        Item itemEscolhido = null;

                       
                        for (Item item : itensDisponiveis) {
                            if (item.getId() == itemId) {
                                itemEscolhido = item;
                                break;
                            }
                        }

                        if (itemEscolhido != null) {
                            itensDoPedido.add(itemEscolhido);
                        } else {
                            System.out.println("Item não encontrado. Tente novamente.");
                            i--; 
                        }
                    }

                    novoPedido.setItens(itensDoPedido.toArray(new Item[0]));
                    pedidos.add(novoPedido);

                    System.out.println("Pedido cadastrado com sucesso!");
                    break;

                case 5:  
                    System.out.println("Pedidos cadastrados:");
                    for (Pedido pedido : pedidos) {
                        pedido.gerarDescricaoVenda(); 
                    }
                    break;

                default:
                    System.out.println("Opção não válida. Escolha novamente.");
            }
        }

        entrada.close();
    }
}
