package poo.ListaSete;

import java.util.ArrayList;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Endereco enderecoLoja;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Cliente> clientes;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.vendedores = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void apresentarSe() {
        System.out.println("Infos Loja");
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        enderecoLoja.apresentarLogradouro();
    }

    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Endereco getEndereco() {
        return enderecoLoja;
    }

    public void setEndereco(Endereco endereco) {
        this.enderecoLoja = endereco;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getCnpj(String CNPJ) {
        return CNPJ;
    }

    public void setCnpj(String CNPJ) {
        this.cnpj = CNPJ;
    }
}
