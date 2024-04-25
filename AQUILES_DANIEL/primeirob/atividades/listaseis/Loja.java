package primeirob.atividades.listaseis;

public class Loja {
  private String razaoSocial;
  private String nomeFantasia;
  private Endereco endereco;
  private Vendedor[] vendedores = new Vendedor[200];
  private Cliente[] clientes = new Cliente[200];

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
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

  public void apresentarse() {
    System.out.println("Nome fantasia " + nomeFantasia);
  }
}
