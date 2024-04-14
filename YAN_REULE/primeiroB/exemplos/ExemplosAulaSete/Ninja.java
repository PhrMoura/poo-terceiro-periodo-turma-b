package exemplos.ExemplosAulaSete;

public class Ninja {
    String nome;
    String clan;
    Integer idade;
    String aldeia;
    String nomeJutsu;

    public void apresentarSe () {
        System.out.println("Olá meu nome é "+nome+" da aldeia "+aldeia);
    }

    public void realizarJutsu (){
        System.out.println("Ninja "+nome+" realizando Jutsu "+nomeJutsu);
    }

}
