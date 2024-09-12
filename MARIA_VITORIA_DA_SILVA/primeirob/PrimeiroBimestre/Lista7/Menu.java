package primeirob.PrimeiroBimestre.Lista7;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Item[] listaDeItens = null;
        do {
            System.out.println("Digite o número da opção desejada: ");
            System.out.println("1- Cadastrar itens");
            System.out.println("2- Listar itens");
            System.out.println("3- Fazer um pedido");
            System.out.println("4- Sair");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    int quantidadeDeItem = 2;
                    listaDeItens = new Item[quantidadeDeItem];

                    for (int i = 0; i < quantidadeDeItem; i++) {
                        listaDeItens[i] = Item.criarItem(entrada);
                    }
                    break;
                case 2:
                    Item.listarItens(listaDeItens);
                    break;
                case 3:
                    if (listaDeItens != null) {
                        Pedido.processarPedido(listaDeItens, entrada);
                    } else {
                        System.out
                                .println("Nenhum item cadastrado. Por favor, cadastre itens antes de fazer um pedido.");
                    }
                    break;
                case 4:
                    System.out.println("Fechando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);

        entrada.close();
    }
}
