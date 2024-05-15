package AulaSeis;

public class Professor {
    String nome;

    String materia;

    Arma arma;

    public void apresentarse() {
        String msg = "Alo barão, Sou o professor(a) "
            .concat(nome)
            .concat(" e leciono a materia")
            .concat(materia);
            
            System.out.println(msg);
    }
}
