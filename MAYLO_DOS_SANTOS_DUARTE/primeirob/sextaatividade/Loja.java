package primeirob.sextaatividade;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    String nomeFantasia, razaoSocial;

    Endereco endereco = new Endereco();

    long CPNJ;

    List<Vendedor> vendedores = new ArrayList<>(30);
    List<Cliente> clientes = new ArrayList<>(30);

    public void apresentarse() {
        String msg = nomeFantasia
        .concat("\n")
        .concat("CNPJ: " + CPNJ);

        System.out.println(msg);
        endereco.apresentarLogradouro();
    }

    public void contarVendedores() {
        int quantidadeVendedores = vendedores.size();
        System.out.println("Quantidade de Vendedores: " + quantidadeVendedores);
    }

    public void contarClientes() {
        int quantidadeClientes = clientes.size();
        System.out.println("Quantidade de Clientes: " + quantidadeClientes);
    }

    
    
}
