package primeirob.atividades.atividadeclasse;

public class Loja extends Endereço{
    
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    // String cidade;
    // String bairro;
    // String rua;
    int contadorCliente = 0;
    int contadorVendedor = 0;

    public Loja(){
        this.nomeFantasia = "Myy Plant";
    }
    public void contarClientes(){
        System.out.println("A quantidade de clientes é " + contadorCliente);
    }
    public void contarVendedores(){
       System.out.println("A quantidade de vendedores é " + contadorVendedor);
    }
    
    
    // public void apresentarse() {
    //     String msg = "Empresa "
    //     .concat(nomeFantasia)
    //     .concat(", CNPJ: ")
    //     .concat(cnpj)
    //     .concat(" e o endereço é em ")
    //     .concat(cidade)
    //     .concat(", na " + rua)
    //     .concat(", bairro " + bairro);

    //     System.out.println(msg);

    // }
    
}
