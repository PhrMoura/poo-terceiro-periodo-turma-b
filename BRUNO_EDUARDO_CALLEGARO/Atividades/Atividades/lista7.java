
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista7 {
    public static void main(String[] args) {
        List<Double> salarioRecebido = new ArrayList<>();
        salarioRecebido.add(2500.0);
        salarioRecebido.add(2800.0);
        salarioRecebido.add(3000.0);
        Gerente gerente = new Gerente("João", 35, "Loja A", "Rua A", "Bairro A", "Cidade A", 5000.0, salarioRecebido);
        gerente.apresentarSe();
        System.out.println("Média dos salários recebidos: " + gerente.calcularMedia());
        System.out.println("Bônus: " + gerente.calcularBonus());

        Menu menu = new Menu();
        menu.cadastrarItem(new Item("Camisa", 29.99));
        menu.cadastrarItem(new Item("Calça", 49.99));

        menu.listarItens();

        Cliente cliente = new Cliente("Maria", "Rua B", "Bairro B", "Cidade B");
        System.out.println("Bem-vindo, " + cliente.getNome() + "! Por favor, escolha o número do item que deseja comprar:");
        menu.listarItensNumerados();
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        Item itemEscolhido = menu.getItem(escolha);
        if (itemEscolhido != null) {
            Pedido pedido = new Pedido(cliente, itemEscolhido);
            System.out.println("Pedido realizado com sucesso!");
            System.out.println("Detalhes do pedido:");
            pedido.exibirDetalhes();
        } else {
            System.out.println("Item não encontrado.");
        }
        scanner.close();
    }
}

class Gerente {
    private String nome;
    private int idade;
    private String loja;
    @SuppressWarnings("unused")
    private String rua;
    @SuppressWarnings("unused")
    private String bairro;
    @SuppressWarnings("unused")
    private String cidade;
    private double salarioBase;
    private List<Double> salarioRecebido;

    public Gerente(String nome, int idade, String loja, String rua, String bairro, String cidade, double salarioBase, List<Double> salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    public double calcularMedia() {
        double total = 0;
        for (double salario : salarioRecebido) {
            total += salario;
        }
        return total / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}

class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Menu {
    private List<Item> itens = new ArrayList<>();

    public void cadastrarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        System.out.println("Itens disponíveis:");
        for (Item item : itens) {
            System.out.println(item.getNome() + " - R$" + item.getPreco());
        }
    }

    public void listarItensNumerados() {
        System.out.println("Escolha o número do item:");
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + ": " + itens.get(i).getNome());
        }
    }

    public Item getItem(int numero) {
        if (numero >= 1 && numero <= itens.size()) {
            return itens.get(numero - 1);
        } else {
            return null;
        }
    }
}

class Cliente {
    private String nome;
    @SuppressWarnings("unused")
    private String rua;
    @SuppressWarnings("unused")
    private String bairro;
    @SuppressWarnings("unused")
    private String cidade;

    public Cliente(String nome, String rua, String bairro, String cidade) {
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    // Métodos getters para encapsulamento
    public String getNome() {
        return nome;
    }
}

class Pedido {
    private Cliente cliente;
    private Item item;

    public Pedido(Cliente cliente, Item item) {
        this.cliente = cliente;
        this.item = item;
    }

    public void exibirDetalhes() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Item: " + item.getNome());
        System.out.println("Preço: R$" + item.getPreco());
    }
}

   



