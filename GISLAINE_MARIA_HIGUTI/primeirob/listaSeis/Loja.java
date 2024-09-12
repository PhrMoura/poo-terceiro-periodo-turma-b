package primeirob.listaSeis;

import java.util.ArrayList;

public class Loja{
    String nomeFantasia;

    String razaoSocial;

    Integer cnpj;

    Endereco endereco;


    ArrayList<Vendedor> vendedores = new ArrayList<>();

    ArrayList<Cliente> clientes = new ArrayList<>();

    public Loja(String nomeFantasia, Integer cnpj, Endereco endereco) {

        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;

    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);

    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);

    } 

    public void apresentarse() {

        System.out.println("Nome da Loja: " + nomeFantasia);
        System.out.println("Número CNPJ: " + cnpj);
        System.out.println("Endereço");
        endereco.apresentarLogradouro();

    }     
    
    public int contarClientes() {
        return clientes.size();

    }

    public int contarVendedores() {
        return vendedores.size();

    } 
}
