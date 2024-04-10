package primeirob.lista05.models;

public class Cliente {
    public String nome;
    public Integer idade;
    public String cidade;
    public String bairro;
    public String rua;

    public void apresentarse () {
        String msg = "Olá, meu noem é "
            .concat(nome)
            .concat(" e tenho ")
            .concat(idade.toString())
            .concat(" anos");
        System.err.println(msg);
    }
}