package lista5;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;

    String[] vendedores = new String[1];
    String[] clientela  = new String[1];

    public void contarCliente() {
        int cont = 0;
    
        for (int i = 0; i < clientela.length; i++){
            if (clientela[i] != null){
                cont++;
            }
        }
    
        System.out.println("Quantidade de Clientes: " + (cont + 2));
    }
    
    public void contarVendedores() {
        int cont = 0;
    
        for (int i = 0; i < vendedores.length; i++){
            if (vendedores[i] != null){
                cont++;
            }
        }
    
        System.out.println("Quantidade de Vendedores: " + (cont + 2));        
    }
    

    public void apresentarLoja() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Cidade: " + cidade + "\n" + "Bairro: " + bairro + "\n" + "Rua: " + rua);
    }
}
