package primeirob.exemplos.aulaseis;

public class Professor {

    String nome;

    String materia;

    public void apresentarse() {
        String msg = "Olá! Sou o Professor(a) "
                .concat(nome)
                .concat(" e leciono a matéria ")
                .concat(materia);

        System.out.println(msg);

    }

}
