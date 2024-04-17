package primeirob.listaSeis;

import java.util.ArrayList;

public class Loja {

    String nomeFantasia, razaoSocial, cidade, bairro, rua, cnpj;
    ArrayList<Vendedor> arrayVendedores = new ArrayList<>();
    ArrayList<Cliente> arrayCliente = new ArrayList<>();

    public void contaClientes() {
        System.out.println("Quantidade de clientes: " + arrayCliente.size());
    }

    public void contaVendedor() {
        System.out.println("Quantidade de vendedores: " + arrayVendedores.size());
    }

    public void apresentarse() {
        System.out.println("Nome fantasia: " + nomeFantasia);
        System.out.println("Cnpjoto: " + cnpj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }
    
}
