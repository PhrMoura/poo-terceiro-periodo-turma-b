package listacinco;

public class Cliente {
    
    String nome;

    int idade;

    String cidade;

    String bairro;

    String rua;

    

    public void apresentarse(){

    String msg = "O nome do cliente é:"
            .concat(nome)
            .concat("O endereço é:")
            .concat(rua)
            .concat(bairro)
            .concat(cidade);

            System.out.println(msg);
    }

}
