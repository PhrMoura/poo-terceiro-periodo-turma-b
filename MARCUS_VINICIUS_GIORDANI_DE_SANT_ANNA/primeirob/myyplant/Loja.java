package primeirob.myyplant;

public class Loja {

    String nomeFantasia;

    String razaoSocial;

    String cidade;

    String bairro;
    
    String rua;

    Integer cnpj;

    Cliente[] arrayClientes = new Cliente[100];
    Vendedor[] arrayVendedores = new Vendedor[100];

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
