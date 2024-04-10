package primeirob.exemplos.aulasete;

public class Ninja {

    String nome;

    String aldeia;

    String cla;

    Integer idade;

    String nomeJutso;

    public void apresentarse() {
        System.out.println("Olá meu nome é " + nome
                + " da aldeia da " + aldeia);
    }

    public void realizarJutso() {
        System.out.println("Ninja " + nome + " realizando jutso " + nomeJutso);
    }
}
