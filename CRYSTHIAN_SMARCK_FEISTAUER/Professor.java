
public class Professor {
    String nome;
    String materia;

    public void apresentar(){
        String msg = "Olá! sou o professor(a) "
                .concat(nome)
                .concat("E leciono a matéria ")
                .concat(materia);

        System.out.println(msg);
    }
}
