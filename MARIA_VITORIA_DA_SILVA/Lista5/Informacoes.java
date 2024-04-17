package Lista5;

public class Informacoes {
    //classe Vendedor
    public static class Vendedor {
        String nomeVendedor;
        int idadeVendedor;
        String lojaVendedor;
        String cidadeVendedor;
        String bairroVendedor;
        String ruaVendedor;
        double salarioBase = 1500;
        double[] salarioRecebido = new double[]{150, 170, 200};

        void apresentarse() {
            System.out.println("===========================");
            System.out.println("Nome do vendedor: " + nomeVendedor + "\nIdade do Vendedor: " + idadeVendedor + "\nLoja do vendedor: " + lojaVendedor);
        }

        double calcularMedia(){
            double soma = 0;
            for(double salario : salarioRecebido){
                soma += salario;
            }
            return soma / salarioRecebido.length;
        }

        double calcularBonus(){
            return salarioBase * 0.2;
        }
    }//fim da classe Vendedor

    //classe Cliente
    public static class Cliente {
        String nomeCliente;
        int idadeCliente;
        String cidadeCliente;
        String bairroCliente;
        String ruaCliente;

        void apresentarse() {
            System.out.println("===========================");
            System.out.println("Nome do cliente: " + nomeCliente + "\nIdade do cliente: " + idadeCliente);
        }
    }//fim da classe Cliente

    //classe Loja
    public class Loja {
        String nomeFantasia;
        String razaoSocial;
        int cnpj;
        String cidade;
        String bairro;
        String rua;
        Vendedor[] vendedores;
        Cliente[] clientes;
    
        public void setVendedores(Vendedor[] vendedores) {
            this.vendedores = vendedores;
        }
    
        public void setClientes(Cliente[] clientes) {
            this.clientes = clientes;
        }
    
        public void apresentarse() {
            System.out.println("===========================");
            System.out.println("Nome Fantasia: " + nomeFantasia);
            System.out.println("CNPJ: " + cnpj);
            System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade);
            
            if (vendedores != null) {
                System.out.println("===========================");
                System.out.println("Quantidade de vendedores: " + vendedores.length);
            } else {
                System.out.println("===========================");
                System.out.println("Quantidade de vendedores: 0");
                System.out.println("===========================");
            }
            
            if (clientes != null) {
                System.out.println("===========================");
                System.out.println("Quantidade de clientes: " + clientes.length);
                System.out.println("===========================");
            } else {
                System.out.println("===========================");
                System.out.println("Quantidade de clientes: 0");
                System.out.println("===========================");
            }
        }
    } //final da classe Loja
}




