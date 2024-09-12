


import java.util.ArrayList;

class Vendedor {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    ArrayList<Double> salarioRecebido = new ArrayList<>();

    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase, double salario1, double salario2, double salario3) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido.add(salario1);
        this.salarioRecebido.add(salario2);
        this.salarioRecebido.add(salario3);
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}

class Cliente {
    String nome;
    int idade;
    String cidade;
    String bairro;
    String rua;

    public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<Vendedor> vendedores = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade);
    }

    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedores.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("João", 30, "Loja A", "Cidade A", "Bairro A", "Rua A", 2000, 2100, 2200, 2300);
        Cliente cliente1 = new Cliente("Maria", 25, "Cidade A", "Bairro A", "Rua B");
        Loja loja1 = new Loja("Loja A", "Empresa A", "123456789", "Cidade A", "Bairro A", "Rua A");

        loja1.adicionarVendedor(vendedor1);
        loja1.adicionarCliente(cliente1);

        System.out.println("Informações da Loja:");
        loja1.apresentarSe();

        System.out.println("\nInformações do Vendedor:");
        vendedor1.apresentarSe();
        System.out.println("Média dos salários recebidos: " + vendedor1.calcularMedia());
        System.out.println("Bônus: " + vendedor1.calcularBonus());

        System.out.println("\nInformações do Cliente:");
        cliente1.apresentarSe();

        System.out.println("\nQuantidade de Clientes na Loja: " + loja1.contarClientes());
        System.out.println("Quantidade de Vendedores na Loja: " + loja1.contarVendedores());
    }
}
```

