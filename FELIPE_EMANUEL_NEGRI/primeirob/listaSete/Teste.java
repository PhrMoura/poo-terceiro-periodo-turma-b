package primeirob.listaSete;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Endereco enderecoCliente = new Endereco("PQP", "Pariuzilandia", "Parazuinho", 800, "Pqpdemais");

        Endereco enderecoVendedor = new Endereco("PQP", "Pariuzilandia", "Pariuzinho", 777, "Pqpdemais");

        Item item1 = new Item(1, "Planta do cabrunco", "Cabrunquinises", 50.0);
        Item item2 = new Item(2, "Planta da pqp", "Putaqueparienzes", 80.0);
        ArrayList<Item> listaItens = new ArrayList<>();

        listaItens.add(item1);
        listaItens.add(item2);


        Gerente gerente = new Gerente();
        gerente.nome = "Maluco de mais";
        gerente.idade = 35;
        gerente.setLoja("MyPlantz");
        gerente.setSalarioBase(3000.0);
        double[] salarioRecebido = {2000.0, 2200.0, 2400.0};
        gerente.setSalarioRecebido(salarioRecebido);

        System.out.println("****************************");
        System.out.println("********MyPlantz2077********");
        System.out.println("****************************");

        Scanner input = new Scanner(System.in);
        
        int opcao = 0;
        
        
        int escolha = 0;

        while (opcao != 3) {
            mostraMenu();
            opcao = input.nextInt();
            

            switch (opcao) {
                case 1:
                    System.out.println("Informe o id do Item:");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Informe o nome do Item");
                    String nome = input.nextLine();
                    System.out.println("Informe o tipo do item");
                    String tipo = input.nextLine();
                    System.out.println("Informa o valor do item");
                    double valor = input.nextDouble();           
                    
                    Item item = new Item(id, nome, tipo, valor);
                    listaItens.add(item);

                    break;
                
                case 2:
                    for (Item itenz : listaItens) {
                        System.out.println(itenz);
                    }
                    System.out.println("deseja escolher algum desses itens para a compra? (Escolha pelo numero de ID, ou 0 para sair)");
                    System.out.println("caso nao escolha nenhum, vao ser cobrados os dois primeiros itens");
                    escolha = input.nextInt();

                    if (escolha == 0) {
                        break;
                    }

                    for (int i = 0; i < listaItens.size(); i++) {
                        if (listaItens.get(i).getId() != escolha) {
                            listaItens.remove(i);
                            i--; 
                        }
                        break;
                    }
                    break;
                    
                case 3:
                    System.out.println("Qual a corporação parceira desta compra?");
                    mostraCorps();
                    int corp = input.nextInt();
                    
                    Pedido pedido = new Pedido();   

                    if (corp == 1) {
                        pedido.corpMilitech();
                        pedido.gerarDescricaoVenda();
                    } else if (corp == 2) {
                        pedido.corpBiotechnica();
                        pedido.gerarDescricaoVenda();
                    } else if (corp == 3) {
                        pedido.corpArasaka();
                        pedido.gerarDescricaoVenda();
                    } else {
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                    System.out.println("Pedido criado com sucesso!");
                break;

                default:
                System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }




    }


    private static void mostraMenu() {
        System.out.println("**************MENU**************");
        System.out.println("* 1- Cadastrar novo Item       *");
        System.out.println("* 2- Listar itens cadastrados  *");
        System.out.println("* 3- Criar Pedido              *");
        System.out.println("********************************");
    }

    private static void mostraCorps() {
        System.out.println("**************Corp**************");
        System.out.println("* 1- Militech                  *");
        System.out.println("* 2- BioTechnica               *");
        System.out.println("* 3- Arasaka                   *");
        System.out.println("********************************");
    }

}
