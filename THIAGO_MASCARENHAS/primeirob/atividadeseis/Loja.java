package atividadeseis;

import java.util.ArrayList;

public class Loja {
     String nomeFantasia;
     String razaoSocial;
     Integer cnpj;
     String cidade;
     String bairro;
     String rua;
     ArrayList<Vendedor> vendedores;
     ArrayList<Cliente> clientes;

    public Loja(String nomeFantasia, String razaoSocial, Integer cnpj, String cidade, String bairro, String rua) {
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

    public void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }
    
}