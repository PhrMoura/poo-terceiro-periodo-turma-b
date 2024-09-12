package primeirob.exemplos.aulaseis;

import java.util.ArrayList;

public class Professor {

    String nome;

    String materia;

    ArrayList<Graduacao> graduacao;

    public void apresentarse() {
        String msg = "Olá! Sou o professor(a) "
                .concat(nome)
                .concat(" e leciono a matéria ")
                .concat(materia)
                .concat(" e sou graduado em ");

        System.out.println(msg);
    }

}
