package primeirob.Polimorfismo;

import primeirob.heranca.Ninja;

public class Hokage extends Ninja{

    private int tempoMandato;

    public Hokage(String nome, int idade, String aldeia, String cla, String equipamento, String nomeJutso, int tempoMandato) {
        super(nome, idade, aldeia, cla, equipamento, nomeJutso);
        this.tempoMandato = tempoMandato;
    }

    public void realizarInvocacao() {
        System.out.println("Realizar invocação de um animal com muito shakara! Um sapão bala");
    }

    public int getTempoMandato() {
        return tempoMandato;
    }

    public void setTempoMandato(int tempoMandato) {
        this.tempoMandato = tempoMandato;
    }
    
}
