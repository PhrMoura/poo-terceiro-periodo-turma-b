package atividades.atividade6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mainAtividade6 {

    public static void main(String[] args) {
        Loja lojaUm = new Loja("Nu Bank", "Nu Pagamentos S.A", new Endereco("Cascavel", "Centro", "Parana"));

        System.out.println(lojaUm.getNomeFantasia());
        System.out.println(lojaUm.getRazaoSocial());

        Vendedor vendedorUm = new Vendedor("Ricardo", 37, new Endereco("Cascavel", "Centro", "Parana"), 1500d );


        Cliente clienteUm = new Cliente("Ricardo", 19, new Endereco("Cascavel", "Centro", "Parana"));


        lojaUm.addClienteLista(clienteUm);
        lojaUm.addVendedorLista(vendedorUm);

        ProcessaPedido processaPedido = new ProcessaPedido();

        Item item = new Item(1, "Samambaia", "Flor", 10d);

        
        Pedido pedido = processaPedido.processar(clienteUm, vendedorUm, new ArrayList<>(Arrays.asList(item)));

        processaPedido.cofirmarPagamento(pedido);

        System.out.println(pedido.getDataPagamento());

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("1 para cadastrar item");
            System.out.println("2 para listar itens");
            System.out.println("3 para sair");


            opcao = input.nextInt();

            switch (opcao) {
                case 1: 
                    System.out.println("Id do item");
                    int id = input.nextInt();

                    System.out.println("Nome do item");
                    String nomeItem = input.next();

                    System.out.println("Tipo do item");
                    String tipoItem = input.next();

                    System.out.println("Valor do item");
                    double valorItem = input.nextDouble();

                    Item itemNovo = new Item(id, nomeItem, tipoItem, valorItem);
                    pedido.adicionarItem(itemNovo);
                break;

                case 2:
                    pedido.listarItens();
                break;
                default:
                
                    break;
            }
        }
        input.close();
    }

}
