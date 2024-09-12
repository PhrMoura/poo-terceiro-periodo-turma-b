package primeirob.heranca;

public class AlunoNinja extends Ninja {

    public AlunoNinja(String nome, int idade, String aldeia, String cla, String equipamento, String nomeJutso,
            String nomeTime, String nomeProfessor) {
        super(nome, idade, aldeia, cla, equipamento, nomeJutso);

        this.nomeProfessor = nomeProfessor;

        this.nomeTime = nomeTime;
    }

    private String nomeTime;

    private String nomeProfessor;

    public String getNomeTime() {
        return nomeTime;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void apresentarse() {
        System.out.println("Ninja: " + getNome() + "\n Cla: " + getCla() + " e meu time é" + this.nomeTime);   
    }

}
