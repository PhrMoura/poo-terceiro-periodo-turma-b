package primeirob.ListaCinco;

import java.util.ArrayList;

public class Loja {
    
    String nomeFantasia;

    String razaoSocial;

    Integer cnpj;

    String cidade;

    String bairro;

    String rua;

    ArrayList<Vendedor> vendedores = new ArrayList<>();

    ArrayList<Cliente> clientes = new ArrayList<>();

    public Loja(String nomeFantasia, Integer cnpj, String cidade, String bairro, String rua) {
        
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;

    }

    public void adicionarCliente(Vendedor vendedor) {
        vendedores.add(vendedor);

    }

    public void adicionarVendedor(Cliente cliente) {
        clientes.add(cliente);

    } 

    public void apresentarse() {

        String apresentar = "Nome da empresa: "
                        .concat(nomeFantasia)
                        .concat("\n CNPJ: " + cnpj)
                        .concat("\n Endereço:")
                        .concat("\n Cidade - " + cidade)
                        .concat("\n Bairro - " + bairro)
                        .concat("\n Rua - " + rua);

        System.out.println(apresentar);

    }     
    
    public int contarClientes() {
        return clientes.size();

    }

    public int contarVendedores() {
        return vendedores.size();

    } 
}
