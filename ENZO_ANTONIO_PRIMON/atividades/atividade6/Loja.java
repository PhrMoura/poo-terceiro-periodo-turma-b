package atividades.atividade6;

import java.util.ArrayList;
import java.util.List;

public class Loja extends Endereço{
    
    String nomeFantasia;
    String razãoSocial;
    String cnpj;
    
    
    List<Vendedor> vendedores = new ArrayList<Vendedor>();
    List<Cliente> clientes = new ArrayList<Cliente>();
    

    public void apresentarse () {
        String msg = ("Loja:" + nomeFantasia)
        .concat(" - Cnpj:" + cnpj)
        .concat(" Na cidade de: " + cidade + ", " + bairro + ", " + numero); 
        
        System.out.println(msg);
    }

    public void contarClientes () {
        System.out.println("Total de cliente: " + clientes.size());
    }
    public void contarVendedores () {
        System.out.println("Total de vendedores " + vendedores.size());
    }
}
