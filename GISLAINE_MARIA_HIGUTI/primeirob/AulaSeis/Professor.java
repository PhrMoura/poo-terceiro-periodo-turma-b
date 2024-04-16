package primeirob.AulaSeis;

public class Professor {

    String nome;

    String materia;

    public void apresentarse() {
        String msg = "Olá, sou o(a) professor(a) "
                .concat(nome)
                .concat(" e vou lecionar ")
                .concat(materia);

        System.out.println(msg);
    }
    
}
