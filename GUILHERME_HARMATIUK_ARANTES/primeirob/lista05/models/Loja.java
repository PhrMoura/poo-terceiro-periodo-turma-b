package primeirob.lista05.models;

import java.util.ArrayList;
import java.util.List;

import primeirob.lista06.models.Endereco;


public class Loja {
    public String nomeFantasia;
    public String nomeSocial;
    public String cnpj;
    public Endereco endereco;

    public List<Vendedor> vendedores = new ArrayList<Vendedor>();
    public List<Cliente> clientes = new ArrayList<Cliente>();

    public void apresentarse () {
        String msg = nomeFantasia
            .concat(" - ")
            .concat(cnpj);
        
        System.err.println(msg);
        // if (endereco != null) {
            // endereco.printarEndereco();            
        // }
    }
    
    public void contarClientes () {
        System.err.println("Está loja possui " + clientes.size() + " clientes");
    }

    public void contarVendedores () {
        System.err.println("Está loja possui " + vendedores.size() + " vendedores");
    }

    public void setEndereco(String cidade, String bairro, String rua) {
        if (endereco == null) {endereco = new Endereco();}
        endereco.cidade = cidade;
        endereco.bairro = bairro;
        endereco.rua = rua;
    }
}