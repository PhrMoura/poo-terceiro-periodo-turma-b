package primeirob.exemplos.quintaaula;

public class Professor {
    String nome;
    String materia;

    public void apresentarse() {
        String msg = "Olá! Sou o professor(a) "
            .concat(nome)
            .concat(" e leciono a matéria ")
            .concat(materia);
            
        System.out.println(msg);
    }
}
