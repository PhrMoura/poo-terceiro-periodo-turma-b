package primeirob.PrimeiroBimestre.Lista7;

import java.util.Scanner;

public class Item {
    private int id;
    private String nome;
    private String tipo;
    private double valor;

    public Item(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public static Item criarItem(Scanner entrada){          
        System.out.println("===================================");
        System.out.println("Digite o id do item: ");
        int idItem = entrada.nextInt();
        System.out.println("Digite o nome do item: ");
        String nome = entrada.next();
        System.out.println("Digite o tipo do item: ");
        String tipo = entrada.next();
        System.out.println("Digite o valor do item: R$ ");
        double valor = entrada.nextDouble();
        System.out.println("===================================");
        return new Item(idItem, nome, tipo, valor);
    }

    public static void listarItens(Item[] listaDeItens){
        if (listaDeItens != null) {
            System.out.println("Lista de itens cadastrados: ");
            for (Item item : listaDeItens) {
                System.out.println("ID: " + item.getId());
                System.out.println("Nome: " + item.getNome());
                System.out.println("Tipo: " + item.getTipo());
                System.out.println("Valor: R$ " + item.getValor());
                System.out.println("===================================");
            }
        } else {
            System.out.println("===================================");
            System.out.println("Nenhum item cadastrado");
            System.out.println("===================================");
        }
    }
}