public class Loja {

    String nomeFantasia;

    String razaoSocial;

    String cnpj;

    String cidade;

    String bairro;

    String rua;

    Vendedor Vendedor;

    Cliente Cliente;

    public void apresentarseloja(){

        String msg = "Olá aqui é da loja "
                .concat(nomeFantasia)
                .concat(" com o cnpj ")
                .concat(cnpj)
                .concat(" e nossa localização fica na Cidade de ")
                .concat(cidade)
                .concat(" no bairro ")
                .concat(bairro)
                .concat(" na ")
                .concat(rua);

        System.out.println(msg);

    }

    public void calcularclientes(){

        String msg = "O numero atual de clientes é de 1";
        System.out.println(msg);
    }

    public void calcularvendedores(){

        String msg = "O número atual de vendedores da loja "
                .concat(nomeFantasia)
                .concat(" é de 3");
        System.out.println(msg);
    }
    
}
