package primeirob.atividades.atividadeClasse;

public class Loja {
    
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    int[] contarCliente = new int[99];
    int[] contarVendedores = new int[99];
    
    public void apresentarse() {
        String msg = "Empresa "
        .concat(nomeFantasia)
        .concat(", CNPJ: ")
        .concat(cnpj)
        .concat(" e o meu endereço é em ")
        .concat(cidade)
        .concat(", na " + rua)
        .concat(", bairro " + bairro);
        

        System.out.println(msg);

        
    }
    
}
