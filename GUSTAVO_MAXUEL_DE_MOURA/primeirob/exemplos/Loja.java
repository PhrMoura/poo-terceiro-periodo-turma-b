package primeirob.exemplos;

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
        this.nomeFantasia = "Myyplant";
        this.razaoSocial = "Floricultura Gabriela LTDA";
        this.cnpj = "99.999.999/9999-99";
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.vendedores = vendedores;
        this.clientes = clientes;
   }

    
    public int contarClientes() {
        return clientes.length;
    }

    
    public int contarVendedores() {
        return vendedores.length;
    }

    
    public void apresentarSe() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
    }

    
}

