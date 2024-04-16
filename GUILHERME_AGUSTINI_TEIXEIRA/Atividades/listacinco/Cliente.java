package listacinco;

public class Cliente {
    
    String nome;

    Integer idade;

    String cidade;

    String bairro;

    String rua;



    public void apresentarse(){

    String msg = "O nome do cliente é:"
            .concat(nome)
            .concat("A idade do cliente é: ")
            .concat(idade.toString());

            System.out.println(msg);
    }

}
