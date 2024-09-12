package exemplos.aulaseis;

public class Professor {

    String Nome;

    String Materia;

    public void apresentarse(){
        String msg = "Olá eu sou o/a professor(a) "       
        .concat(Nome)
        .concat(" e vou lecionar ")
        .concat(Materia);

        System.out.println(msg);

    }
}
