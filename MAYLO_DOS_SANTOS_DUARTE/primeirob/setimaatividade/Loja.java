package primeirob.setimaatividade;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nomeFantasia, razaoSocial;

    private Endereco endereco;

    private long CNPJ;

    private List<Vendedor> vendedores = new ArrayList<>(30);
    private List<Cliente> clientes = new ArrayList<>(30);

    public Loja(String nomeFantasia, String razaoSocial, long CNPJ) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.vendedores = new ArrayList<>(30);
        this.clientes = new ArrayList<>(30);
        this.CNPJ = CNPJ;
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    public int contarClientes() {
        return clientes.size();
    }

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public long getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(long cNPJ) {
		CNPJ = cNPJ;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedor vendedor) {
		this.vendedores.add(vendedor);
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}

    

    
    
}
