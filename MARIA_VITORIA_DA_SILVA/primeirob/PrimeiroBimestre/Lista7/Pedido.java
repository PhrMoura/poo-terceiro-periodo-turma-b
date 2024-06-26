package primeirob.PrimeiroBimestre.Lista7;

import java.util.Date;
import java.util.Scanner;

public class Pedido {

    public static void processarPedido(Item[] listaDeItens, Scanner entrada) {
        System.out.println("Lista de itens disponíveis para venda: ");
        for (Item item : listaDeItens) {
            System.out.println("===========================");
            System.out.println("ID: " + item.getId());
            System.out.println("Nome: " + item.getNome());
        }
        System.out.println("Digite o ID do item que deseja comprar: ");
        System.out.println("===========================");
        int itemEscolhido = entrada.nextInt();
        System.out.println("Digite a quantidade do item: ");
        System.out.println("===========================");
        int quantidade = entrada.nextInt();

        Item itemSelecionado = null;
        for (Item item : listaDeItens) {
            if (item.getId() == itemEscolhido) {
                itemSelecionado = item;
                break;
            }
        }

        if (itemSelecionado != null) {
            Pedido.gerarDescricaoDeVenda(itemSelecionado, quantidade);
        } else {
            System.out.println("===========================");
            System.out.println("Item não encontrado. Pedido não criado.");
            System.out.println("===========================");
        }
    }

    public static void gerarDescricaoDeVenda(Item itemSelecionado, int quantidade){
        int id = itemSelecionado.getId();
        double valorTotal = itemSelecionado.getValor() * quantidade;
        Date dataCriacao = new Date();
        Date vencimentoReserva = calcularVencimentoReserva(dataCriacao);
        String outrasEmpresas = "BioTechnica, Arasaka e Militech";

        System.out.println("===========================");
        System.out.println("Pedido: " + id);
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Data de criação: " + dataCriacao);
        System.out.println("Data de vencimento da reserva: " + vencimentoReserva);
        System.out.println("Esse pedido foi feito em parceria com: " + outrasEmpresas);
        System.out.println("===========================");
        System.out.println("Seu pedido foi criado com sucesso!");
        System.out.println("===========================");
    }

    private static Date calcularVencimentoReserva(Date dataCriacao) {
        // Calcula a data de vencimento da reserva 3 dias após a criação
        long tresDiasEmMillis = 3 * 24 * 60 * 60 * 1000;
        return new Date(dataCriacao.getTime() + tresDiasEmMillis);
    }
}

