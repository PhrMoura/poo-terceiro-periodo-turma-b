package listacinco;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    Vendedor[] vendedores;
    Cliente[] clientes;

    public Loja() {
        vendedores = new Vendedor[0];
        clientes = new Cliente[0];
    }

    public int contarClientes() {
        return clientes.length;
    }

    public int contarVendedores() {
        return vendedores.length;
    }

    public void apresentarse() {
        System.out.println("Loja: " + nomeFantasia + "\nCNPJ: " + cnpj + "\nCidade: " + cidade + " | Bairro: " + bairro
                + " | Rua: " + rua + "\n");
    }
}
