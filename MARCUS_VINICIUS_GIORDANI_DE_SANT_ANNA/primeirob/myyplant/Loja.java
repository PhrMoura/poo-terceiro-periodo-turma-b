package primeirob.myyplant;

public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer cnpj;
    private Cliente[] arrayClientes;
    private Vendedor[] arrayVendedores;

    // Construtor
    public Loja(String nomeFantasia, String razaoSocial, String cidade, String bairro, String rua, Integer cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.cnpj = cnpj;
        this.arrayClientes = new Cliente[100];
        this.arrayVendedores = new Vendedor[100];
    }

    // Getter e Setter para nomeFantasia
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    // Getter e Setter para razaoSocial
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    // Getter e Setter para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getter e Setter para bairro
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // Getter e Setter para rua
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    // Getter e Setter para cnpj
    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    // Getter e Setter para arrayClientes
    public Cliente[] getArrayClientes() {
        return arrayClientes;
    }

    public void setArrayClientes(Cliente[] arrayClientes) {
        this.arrayClientes = arrayClientes;
    }

    // Getter e Setter para arrayVendedores
    public Vendedor[] getArrayVendedores() {
        return arrayVendedores;
    }

    public void setArrayVendedores(Vendedor[] arrayVendedores) {
        this.arrayVendedores = arrayVendedores;
    }

    public void apresentarse() {
        String msg = "Empresa: "
                .concat(nomeFantasia)
                .concat("\nEndereço: ")
                .concat(rua)
                .concat(", ")
                .concat(bairro)
                .concat(", ")
                .concat(cidade)
                .concat("\nCNPJ: ")
                .concat(String.valueOf(cnpj));
        System.out.println(msg);
    }
}
