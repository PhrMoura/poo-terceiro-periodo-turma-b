package Atividade5;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String cidade;
    private String bairro;
    private String rua;
    private List<Vendedor> vendedores;
    private List<Cliente> clientes;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.setVendedores(new ArrayList<>());
        this.setClientes(new ArrayList<>());
    }

    public List<Cliente> getClientes() {
        return clientes;
        
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
        
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
        
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
        
    }

    public void adicionarVendedor(Vendedor vendedor) {
        getVendedores().add(vendedor);
    }

    public void adicionarCliente(Cliente cliente) {
        getClientes().add(cliente);
    }

    public int contarClientes() {
        return getClientes().size();
    }

    public int contarVendedores() {
        return getVendedores().size();
    }

    public void apresentarse() {
        System.out.println("Nome Fantasia: " + nomeFantasia + ", CNPJ: " + cnpj + ", Endereço: " + rua + ", " + bairro + ", " + cidade);
    }
}
