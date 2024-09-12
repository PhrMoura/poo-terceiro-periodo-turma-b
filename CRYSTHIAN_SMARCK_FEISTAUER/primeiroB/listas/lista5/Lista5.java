package listas.lista5;

import java.util.ArrayList;

public class Lista5 {
    public class Cliente {
        String  nome;
        int idade;
        String cidade;
        String bairro;
        String rua;

        public void apresentarse(){
            System.out.println("Nome: " + nome + " e " + "idade: " + idade + " anos.");
        }
    }
    public class Vendedor {
        String nome;
        String loja;
        int idade;
        String cidade;
        String bairro;
        String rua;
        double salarioBase = 1220;
        double[] salarioRecebido = new double[]{100, 200, 300};

        public void apresentarse(){
            String msg = "Nome: " + nome + ", " + " loja: " + loja + " e " + " idade: " + idade + " anos.";
            System.out.println(msg);
        }

        public double calcularMedia(){
            double soma = 0;
            for (int i = 0; i < salarioRecebido.length; i++) {
                soma += salarioRecebido[i];
            }
            return soma / salarioRecebido.length;
        }

        public double calcularBonus(){
            return salarioBase * 0.2;
        }

    }

    public class Loja {
        String nomeFantasia;
        String razaoSocial;
        String cnpj;
        String cidade;
        String bairro;
        String rua;
        ArrayList<Integer> vendedores = new ArrayList<>();
        ArrayList<Integer> clientes = new ArrayList<>();

        public void apresentarse(){
            String endereco = " cidade de " + cidade +", " + " bairro: " + bairro + " e rua: " + rua;
            System.out.println("O nome fantasia é: " + nomeFantasia + " cnpj: " + cnpj + endereco);
        }

        public void contarClientes(){
            System.out.println("A quantidade de clientes é: " + clientes.size());
        }

        public void contarVendedores(){
            System.out.println("A quantidade de vendedores é: " + vendedores.size());
        }

        public void adicionarCliente(Integer quantidade){
            for (int i = 0; i < quantidade; i++) {
                clientes.add(1);
            }
        }

        public void adicionarVendedores(Integer quantidade){
            for (int i = 0; i < quantidade ; i++) {
                vendedores.add(1);
            }
        }

    }
    public static class Teste {
        public static void main(String[] args) {
            Lista5 lista5 = new Lista5();
            Lista5.Cliente novoCliente = lista5.new Cliente();
            novoCliente.nome = "Pedro";
            novoCliente.idade = 23;
            novoCliente.apresentarse();

            System.out.println("\n");

            Lista5.Vendedor vendedor = lista5.new Vendedor();
            vendedor.nome = "João";
            vendedor.idade = 30;
            vendedor.loja = "Myy Plant";
            vendedor.apresentarse();
            double media = vendedor.calcularMedia();
            System.out.println("A media é: " + media);
            vendedor.salarioBase = 1200;
            double bonus = vendedor.calcularBonus();
            System.out.println("O bonus é: " + bonus);

            System.out.println("\n");

            Lista5.Loja loja = lista5.new Loja();
            loja.adicionarCliente(1);
            loja.adicionarCliente(4);
            loja.adicionarVendedores(1);
            loja.adicionarVendedores(10);
            loja.contarClientes();
            loja.contarVendedores();
            loja.nomeFantasia = "Myy Plant Ltda";
            loja.cnpj = "00.000.000/1-00";
            loja.cidade = "Cascavel";
            loja.bairro = "Floresta";
            loja.rua = "Tangará";
            loja.apresentarse();


        }
    }


}
