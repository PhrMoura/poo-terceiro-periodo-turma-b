public class Atividade5{
    
import java.util.ArrayList;
import java.util.List;

}

class Vendedor {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    List<Double> salarioRecebido;

    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();
    }

    public void apresentarse() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Loja: " + loja);
    }

    public double calcularMedia() {
        if (salarioRecebido.size() > 0) {
            double soma = 0;
            for (double salario : salarioRecebido) {
                soma += salario;
            }
            return soma / salarioRecebido.size();
        } else {
            return 0;
        }
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

    public void apresentarse() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    List<Vendedor> vendedores;
    List<Cliente> clientes;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    public void apresentarse() {
        System.out.println("Nome Fantasia: " + nomeFantasia + ", CNPJ: " + cnpj + ", Endereço: " + rua + ", " + bairro + ", " + cidade);
    }
}

public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("João", 30, "Myy Plant", "Cidade A", "Bairro A", "Rua A", 2000);
        vendedor1.salarioRecebido.add(2100.0);
        vendedor1.salarioRecebido.add(2200.0);
        vendedor1.salarioRecebido.add(2300.0);
        Vendedor vendedor2 = new Vendedor("Maria", 25, "Myy Plant", "Cidade A", "Bairro B", "Rua B", 2200);
        vendedor2.salarioRecebido.add(2300.0);
        vendedor2.salarioRecebido.add(2400.0);
        vendedor2.salarioRecebido.add(2500.0);

        
        Cliente cliente1 = new Cliente("Carlos", 40, "Cidade A", "Bairro C", "Rua C");
        Cliente cliente2 = new Cliente("Ana", 35, "Cidade A", "Bairro D", "Rua D");

        // Criando a loja
        Loja loja = new Loja("Myy Plant", "Razão Social da Myy Plant", "123456789", "Cidade A", "Bairro E", "Rua E");
        loja.vendedores.add(vendedor1);
        loja.vendedores.add(vendedor2);
        loja.clientes.add(cliente1);
        loja.clientes.add(cliente2);

       
        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());
        System.out.println("Quantidade de clientes: " + loja.contarClientes());
        loja.apresentarse();
        vendedor1.apresentarse();
        System.out.println("Média salarial do vendedor 1: " + vendedor1.calcularMedia());
        System.out.println("Bônus do vendedor 1: " + vendedor1.calcularBonus());
        cliente1.apresentarse();
    }
}
}
