package primeirob.myyplant;

public class Cliente {

    String nome;

    Integer idade;

    String cidade;

    String bairro;

    String rua;

    public void apresentarse() {
        String msg = "Cliente: "
                .concat(nome)
                .concat("\n Idade:  ")
                .concat(Integer.toString(idade));
        System.out.println(msg);
    }

}
