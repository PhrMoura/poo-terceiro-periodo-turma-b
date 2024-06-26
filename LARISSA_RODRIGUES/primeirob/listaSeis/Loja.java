package primeiroB.listaSeis;
import java.util.ArrayList;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Vendedor> vendedores = new ArrayList<>();

    public void apresentarse() {
        String apresentacao = "Nome fantasia: " + nomeFantasia
            .concat("\nCNPJ: " + cnpj)
            .concat("\nEndereço:\nCidade: " + cidade + "\nBairro: " + bairro + "\nRua: " + rua);
            System.out.println(apresentacao);
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void contarCliente(){
        System.out.println("Número de clientes: " + clientes.size());
    }

    public void adicionarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public void contarVendedor(){
        System.out.println("Número de vendedores: " + vendedores.size());
    }

}
