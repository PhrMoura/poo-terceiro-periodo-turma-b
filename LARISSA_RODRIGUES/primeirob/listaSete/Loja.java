package primeiroB.listaSete;
import java.util.ArrayList;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Vendedor> vendedores = new ArrayList<>();
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    public void apresentarse() {
        System.out.println("Nome fantasia: " + nomeFantasia + "\nRazão social: " + razaoSocial + "\nCNPJ: " + cnpj);
        endereco.apresentarLogradouro();
    }

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, Endereco endereco) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void contarCliente(){
        System.out.println("Número de clientes: " + clientes.size());
    }

    public void adicionarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public void contarVendedor(){
        System.out.println("Número de vendedores: " + vendedores.size());
    }

    public void adicionarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    public void contarGerente() {
        System.out.println("Número de gerentes: " + gerentes.size());
    }

}
