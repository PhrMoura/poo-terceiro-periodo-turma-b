package primeirob.quintaatividade;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    String nomeFantasia, razaoSocial,
        cidade, bairro, rua;

    long CPNJ;

    List<Vendedor> vendedores = new ArrayList<>(30);
    List<Cliente> clientes = new ArrayList<>(30);

    public void apresentarse() {
        String msg = nomeFantasia
        .concat("\n")
        .concat("Endereço: " + rua)
        .concat(", " + bairro)
        .concat(", " + cidade)
        .concat("\n")
        .concat("CNPJ: " + CPNJ);

        System.out.println(msg);
        System.out.println("-----------------------------");
    }

    public void contarVendedores() {
        int quantidadeVendedores = vendedores.size();
        System.out.println("Quantidade de Vendedores: " + quantidadeVendedores);
        System.out.println("-----------------------------");
    }

    public void contarClientes() {
        int quantidadeClientes = clientes.size();
        System.out.println("Quantidade de Clientes: " + quantidadeClientes);
        System.out.println("-----------------------------");
    }

    
    
}
