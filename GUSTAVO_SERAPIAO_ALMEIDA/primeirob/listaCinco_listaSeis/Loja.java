package listaCinco_listaSeis;

public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;
    private Vendedor[] vendedores = new Vendedor[200];
    private Cliente[] clientes = new Cliente[200];

    public void apresentarLoja() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        endereco.apresentarLogradouro();
    }

    public int contarClientes() {
        int totalClientes = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                totalClientes++;
            }
        }
        return totalClientes;
    }

    public int contarVendedores() {
        int totalVendedores = 0;
        for (Vendedor vendedor : vendedores) {
            if (vendedor != null) {
                totalVendedores++;
            }
        }
        return totalVendedores;
    }

    // Getters e Setters
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
}

