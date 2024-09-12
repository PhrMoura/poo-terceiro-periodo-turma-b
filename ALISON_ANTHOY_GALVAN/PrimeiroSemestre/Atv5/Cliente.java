public class Cliente {

    String nome;

    String idade;

    String cidade;

    String bairro;
    
    String rua;

    public void apresentarsecli(){

        String msg = "Olá eu sou o cliente "
                .concat(nome)
                .concat(" e tenho ")
                .concat(idade)
                .concat(" anos");

        System.out.println(msg);

    }
    
}
