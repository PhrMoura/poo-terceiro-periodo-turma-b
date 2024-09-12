package primeirob.setimaatividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetimaAtividade {
    public static void main(String[] args) {

        Loja lojaMatriz = new Loja("MY PLANT", "MP PAGAMENTOS", 39349196000160L);
        lojaMatriz.setEndereco(new Endereco("PR", "Cascavel", "Centro", "Av Brasil", "Proximo ao mercado", 1089));

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Maylo");
        vendedor.setIdade(19);
        vendedor.setEndereco(new Endereco("PR", "Cascavel", "Brasmadeira", "Rio Borá", "Proximo ao mercado", 330));

        lojaMatriz.setVendedores(vendedor);

        Cliente cliente = new Cliente();
        cliente.setNome("Kesia");
        cliente.setIdade(18);
        cliente.setEndereco(new Endereco("PR", "Cascavel", "São Cristovão", "Goias", "Proximo ao mercado", 550));

        lojaMatriz.setClientes(cliente);

        Processos processador = new Processos();

        int option = 0, index = 0;
        List<Item> itemsCriados = new ArrayList<Item>(30);
        List<Pedido> pedidosCriados = new ArrayList<Pedido>(30);
        List<Item> carrinItems = new ArrayList<Item>(30);

        Scanner scanner = new Scanner(System.in);

        while (option != 4) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("|                      MY PLANT ENTERPRISE                           |");
            System.out.println("----------------------------------------------------------------------");

            System.out.println("Selecione sua opção: ");
            System.out.println("1 - Cadastrar item");
            System.out.println("2 - Listar os items cadastrados");
            System.out.println("3 - Realizar compra");
            System.out.println("4 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Qual o nome do item?");
                    String nome = scanner.next();
                    System.out.println("Qual o tipo do item?");
                    String tipo = scanner.next();
                    System.out.println("Qual o valor do item?");
                    double valor = scanner.nextDouble();
                    itemsCriados.add(processador.processarItem(nome, tipo, valor));
                    break;
                case 2:
                    for (Item item : itemsCriados) {
                        System.out.printf("ID: %3d | Nome: %10s | Valor: %.2f | Tipo: %5s\n", item.id, item.nome, item.valor ,item.tipo);
                    }
                    break;
                case 3:
                    carrinItems.clear();
                    int optionBuy = 0;
                    int idItem = 0;
                    while (optionBuy != 2) {
                        System.out.println("Selecione o item que deseja comprar: ");
                        for (Item item : itemsCriados) {
                            System.out.printf("ID: %3d | Nome: %10s | Valor: %.2f | Tipo: %5s\n", item.id, item.nome, item.valor ,item.tipo);
                        }

                        idItem = scanner.nextInt();

                        if (idItem < itemsCriados.size()) {
                            for (Item item : itemsCriados) {
                                if (idItem == item.id) {
                                    carrinItems.add(item);
                                }
                            }
                        }
                        else {
                            System.out.println("Erro: Item inexistente");
                        }

                        System.out.println("Deseja adicionar outro item ao pedido?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");

                        optionBuy = scanner.nextInt();

                        if (optionBuy == 2) {
                            int optionFinal = 0;

                            while(optionFinal != 2) {
                                System.out.println("1 - Visualizar carrinho");
                                System.out.println("2 - Finalizar Pedido");
                                
                                optionFinal = scanner.nextInt();
                                
                                switch (optionFinal) {
                                    case 1:
                                        for (Item item : carrinItems) {
                                            System.out.printf("ID: %3d | Nome: %10s | Valor: %.2f | Tipo: %5s\n", item.id, item.nome, item.valor ,item.tipo);
                                        }
                                        break; 
                                    case 2:
                                        pedidosCriados.add(processador.processarPedido(cliente, vendedor, lojaMatriz, carrinItems));
                                        break;
                                    default:
                                        System.out.println("Erro: Opção inexistente");
                                        break;
                                }
                            }
                        }


                    }
                        processador.confirmarPagamento(pedidosCriados.get(index));
                        System.out.println("O pedido com o valor: " + pedidosCriados.get(index).calcularValorTotal() + 
                            " ,Foi finalizado e pago na data: " + pedidosCriados.get(index++).getDataPagamento());
                    break;
                case 4:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Erro: Opção inexistente");
                    break;
            }
        }

        scanner.close();
            
        

    }
}
