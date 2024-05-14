import java.util.List;

public class Loja {
    String nomefantasia;
    String razaoSocial;
    String cpnj;
    String cidade;
    String bairro;
    String rua;
    List<Vendedor> vendedores;
    List<Cliente> clientes;
    
    public Loja(String nomefantasia, String razaoSocial, String cpnj, String cidade, String bairro, String rua,
            List<Vendedor> vendedores, List<Cliente> clientes) {
        this.nomefantasia = nomefantasia;
        this.razaoSocial = razaoSocial;
        this.cpnj = cpnj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.vendedores = vendedores;
        this.clientes = clientes;
    }


    public int contarClientes() {
        return clientes.size();
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    public String toString() {
        return "Nome Fantasia: " + nomefantasia + ". CNPJ: " + cpnj + ". Cidade: " + cidade + ". Bairro: " + bairro + ". Rua:" + rua; 
    }

}
