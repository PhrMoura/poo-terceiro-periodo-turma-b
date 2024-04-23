import java.util.Scanner;

public class ListaSete {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ListaSete main = new ListaSete();
        boolean sair = false;
        while (!sair) {
            main.exibirMenu();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    main.calcularPrecoTotal();
                    break;
                case 2:
                    main.calcularTroco();
                    break;
                case 3:
                    main.criarPedido();
                    break;
                case 4:
                    sair = true;
                    break;
                case 5:
                    main.cadastrarItem();
                    break;
                case 6:
                    main.listarItens();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        System.out.println("Obrigado por utilizar o sistema!");
        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("[1] - Calcular Preço Total");
        System.out.println("[2] - Calcular Troco");
        System.out.println("[3] - Criar Pedido");
        System.out.println("[4] - Sair");
        System.out.println("[5] - Cadastrar Item");
        System.out.println("[6] - Listar Itens");
        System.out.print("Escolha uma opção: ");
    }

    private void calcularPrecoTotal() {
        System.out.print("Digite a quantidade das plantas vendidas: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço unitário da planta: ");
        double precoUnitario = scanner.nextDouble();
        double precoTotal = quantidade * precoUnitario;
        
        if (quantidade > 10) {
            double desconto = precoTotal * 0.05;
            precoTotal -= desconto;
            System.out.println("Desconto aplicado de 5% para compras acima de 10 plantas.");
        }
        
        System.out.println("Preço total: R$" + precoTotal);
    }

    private void calcularTroco() {
        System.out.print("Digite o valor recebido pelo cliente: ");
        double valorRecebido = scanner.nextDouble();
        System.out.print("Digite o valor total da compra: ");
        double valorTotal = scanner.nextDouble();
        double troco = valorRecebido - valorTotal;
        System.out.println("Troco: R$" + troco);
    }

    private void criarPedido() {
        System.out.println("Criando pedido fictício...");
        // Implementar a lógica para criar um pedido
    }

    private void cadastrarItem() {
        System.out.println("Cadastrando novo item...");
        // Implementar a lógica para cadastrar um novo item
    }

    private void listarItens() {
        System.out.println("Listando itens cadastrados...");
        // Implementar a lógica para listar os itens cadastrados
    }

    public static class Cliente {
        private String nome;
        private int idade;
        private String cidade;
        private String bairro;
        private String rua;

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

    public static class Vendedor {
        private String nome;
        private int idade;
        private String loja;
        private String cidade;
        private String bairro;
        private String rua;
        private double salarioBase;
        private double[] salarioRecebido;

        public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase, double[] salarioRecebido) {
            this.nome = nome;
            this.idade = idade;
            this.loja = loja;
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
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
            return total / salarioRecebido.length;
        }

        public double calcularBonus() {
            return salarioBase * 0.2;
        }

    }

    public static class Loja {
        private String nomeFantasia;
        private String razaoSocial;
        private String cnpj;
        private String cidade;
        private String bairro;
        private String rua;
        private Vendedor[] vendedores;
        private Cliente[] clientes;

        public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua, Vendedor[] vendedores, Cliente[] clientes) {
            this.nomeFantasia = nomeFantasia;
            this.razaoSocial = razaoSocial;
            this.cnpj = cnpj;
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
            this.vendedores = vendedores;
            this.clientes = clientes;
        }

        public void apresentarSe() {
            System.out.println("Nome Fantasia: " + nomeFantasia);
            System.out.println("CNPJ: " + cnpj);
            System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
        }

        public int contarClientes() {
            return clientes.length;
        }

        public int contarVendedores() {
            return vendedores.length;
        }

    }

    public static class Item {
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

        public void gerarDescricao() {
            System.out.println("Item: " + id + ", Nome: " + nome + ", Tipo: " + tipo + ", Valor: R$" + valor);
        }
    }
}
