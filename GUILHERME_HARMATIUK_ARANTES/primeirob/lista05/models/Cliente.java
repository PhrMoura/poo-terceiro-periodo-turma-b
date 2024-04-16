package primeirob.lista05.models;

import primeirob.lista06.models.AbstractPessoa;
import primeirob.lista06.models.Endereco;

public class Cliente extends AbstractPessoa {
    public String nome;
    public Endereco endereco;
    public Integer idade;

    public void apresentarse () {
        String msg = "Olá, meu noem é "
            .concat(nome)
            .concat(" e tenho ")
            .concat(idade.toString())
            .concat(" anos");
        System.err.println(msg);
    }
}