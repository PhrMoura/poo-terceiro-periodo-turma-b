package atividades.atividade5;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    
    String nomeFantasia;
    String razãoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    
    List<Vendedor> vendedores = new ArrayList<Vendedor>();
    List<Cliente> clientes = new ArrayList<Cliente>();
    

    public void apresentarse () {
        String msg = ("Loja:" + nomeFantasia)
        .concat(" - Cnpj:" + cnpj)
        .concat(" Localizada na rua " + rua + " bairro " + bairro + " na cidade de " + cidade); 
        
        System.out.println(msg);
    }

    public void contarClientes () {
        System.out.println("Total de cliente: " + clientes.size());
    }
    public void contarVendedores () {
        System.out.println("Total de vendedores " + vendedores.size());
    }
}
