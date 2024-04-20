package primeirob.AulaSete;

public class Ninja {
    String nome;

    String aldeia;

    String cla;

    Integer idade;

    String nomeJutsu;

    public void apresentarSe() {
        System.out.println("Olá meu nome é: " + nome);
        System.out.println("Sou da aldeia " + aldeia);
    }

    public void realizarJutsu() {
        System.out.println("Ninja " + nome + " realizando jutsu " + nomeJutsu);
    }

}
