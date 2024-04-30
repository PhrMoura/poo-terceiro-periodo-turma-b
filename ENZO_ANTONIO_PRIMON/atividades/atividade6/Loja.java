package atividades.atividade6;

import java.util.ArrayList;

public class Loja {
    
    private String razaoSocial;
    private String nomeFantasia;
    private Endereco endereco;
    private ArrayList<Vendedor> listaVendedores;
    private ArrayList<Cliente> ListaClientes;

    public Loja(String razaoSocial, String nomeFantasia, Endereco endereco) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.listaVendedores = new ArrayList<>();
        this.ListaClientes = new ArrayList<>();
    }

    public void addVendedorLista(Vendedor vendedor){
        this.listaVendedores.add(vendedor);
        vendedor.setLoja(this);
    }

    public void mostrarListaVendedores(){
        for (Vendedor vendedor : listaVendedores) {
            vendedor.apresentarse();
        }
    }

    public void addClienteLista(Cliente cliente){
        this.ListaClientes.add(cliente);
    }

    public void mostrarListaClientes(){
        for (Cliente cliente : ListaClientes) {
            cliente.apresentarse();
        }
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
