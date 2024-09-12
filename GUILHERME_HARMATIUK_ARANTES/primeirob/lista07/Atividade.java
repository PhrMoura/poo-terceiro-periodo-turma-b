package primeirob.lista07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import primeirob.lista06.UtilityPedido;
import primeirob.lista06.models.Endereco;
import primeirob.lista06.models.Gerente;
import primeirob.lista06.models.Item;
import primeirob.lista06.models.Pedido;
import primeirob.lista06.models.ProcessaPedido;

public class Atividade {
    public static void main(String[] args) {
        System.err.println("Teste");
        Gerente gerente = new Gerente();
        gerente.endereco = new Endereco();
        gerente.endereco.setEndereco("Cascavel", "Tropical", "Flamboyant");
        gerente.endereco.printarEndereco();
    
        menu();
    }

    public static void menu () {
        Scanner actionInput = new Scanner(System.in);
        Integer action = -1;
        Boolean condition = false;

        List<Pedido> listaPedidos = new ArrayList<Pedido>();
        List<Item> listaItems = new ArrayList<Item>();
        while (condition == false) {
            System.out.println("======= MENU =======");
            System.out.println("[0] - Fechar Aplicação");
            System.out.println("[1] - Criar Pedido");
            System.out.println("[2] - Confirmar Pedido");
            System.out.println("[3] - Cadastrar Item");
            System.out.println("[4] - Listar Items");

            action = actionInput.nextInt();
            switch (action) {
                case 0:
                    condition = true;
                    break;
                case 1:
                    if (listaItems.size() >= 2) {
                        listaPedidos.add(UtilityPedido.processarPedido(listaItems));
                    } else {
                        System.out.println("É necesário existir pelo menos dois items " + 
                            "antes de que um pedido seja criado."
                        );
                    }
                    break;
                case 2: 
                    if (listaPedidos.size() > 0) {
                        System.out.println("Ids dos pedidos pendentes:");
                        listaPedidos.forEach(pedido -> {
                            System.out.println(pedido.id);
                        });
                        confirmarPedido(listaPedidos);
                    } else {
                        System.out.println("Não existe nenhum pedido pendente.");
                    }
                    break;
                case 3: 
                    listaItems.add(ItemUtilities.cadastro());
                    System.out.println("Novo item adicionado.");
                    break;
                case 4:
                    if (listaItems.size() >= 2) {
                        ItemUtilities.listarItems(listaItems);
                    } else {
                        System.out.println("É necesário existir pelo menos dois items " + 
                            "antes de poder listar todos items."
                        );
                    }
                    break;
                default:
                    System.out.println("Comando não reconhecido. Tente novamente.\n");
                    break;
            }
        }    
    }

    public static void confirmarPedido (List<Pedido> listaPedidos) {
        System.err.println("Qual pedido você deseja confirmar? (Digite o ID do pedido)");

        List<Long> listaIds = new ArrayList<>();
        
        listaPedidos.forEach(pedido -> {
            listaIds.add(pedido.id);
        }); 
        listaPedidos.forEach(pedido -> {
            if (pedido.dataPagamento == null) {
                System.err.println("Id: " + pedido.id);
                System.out.println("Data Criação: " + pedido.dataCriacao);
                System.out.println("Items: " + pedido.listaItems.size());
            }
        });

        Scanner actionInput = new Scanner(System.in);
        Long action = -1l;
        Boolean condition = false;

        while (condition == false) {
            action = actionInput.nextLong();
            final Long finalAction = action;

            if (listaIds.contains(action)) {
                Pedido pedidoCorrespondente = listaPedidos
                    .stream()
                    .filter(pedido -> pedido.id == finalAction)
                    .findFirst().orElse(null);

                ProcessaPedido.confirmarPaagamento(pedidoCorrespondente);
            }
            
        }    
    }
}
