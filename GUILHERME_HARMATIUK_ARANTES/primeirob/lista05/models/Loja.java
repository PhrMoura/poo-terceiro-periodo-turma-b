package primeirob.lista05.models;

import java.util.ArrayList;
import java.util.List;


public class Loja {
    public String nomeFantasia;
    public String nomeSocial;
    public String cnpj;
    public String cidade;
    public String bairro;
    public String rua;
    public String getEndereco () { return cidade + " - " + bairro + " - " + rua; }
    public List<Vendedor> vendedores = new ArrayList<Vendedor>();
    public List<Cliente> clientes = new ArrayList<Cliente>();

    public void apresentarse () {
        String msg = nomeFantasia
            .concat(" - ")
            .concat(cnpj)
            .concat(" - ")
            .concat(getEndereco())        
        ;
        System.err.println(msg);
    }
    public void contarClientes () {
        System.err.println("Está loja possui " + clientes.size() + " clientes");
    }
    public void contarVendedores () {
        System.err.println("Está loja possui " + vendedores.size() + " vendedores");
    }
}