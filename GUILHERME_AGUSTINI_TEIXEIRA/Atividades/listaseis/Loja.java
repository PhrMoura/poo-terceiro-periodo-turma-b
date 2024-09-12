package listacinco;

public class Loja {
    
    String nomeFantasia;

    String razaoSocial;

    Double cnpj;

    String cidade;

    String bairro;

    String rua;

    Vendedor[] arrayVendedores = new Vendedor[100];
    
    Cliente[] arrayClientes = new Cliente[100];

    public void contarCliente() {
        int total = 0;

        for (int i = 0; i < arrayClientes.length; i++) {
            total++;
        }

        System.out.println(total);
    }
    
    public void contarVendedores() {
        int total = 0;

        for (int i = 0; i < arrayVendedores.length; i++) {
            total++;
        }

        System.out.println(total);
    }
    
    
    public void apresentarse(){

        String msg = "O nome da loja é:"
                .concat(nomeFantasia)
                .concat("O cnpj é:" + cnpj)
                .concat("O endereço é:")
                .concat(rua)
                .concat(bairro)
                .concat(cidade);

  
        System.out.println(msg);
        
    }
}

