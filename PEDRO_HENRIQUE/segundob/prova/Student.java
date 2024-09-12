package PEDRO_HENRIQUE.segundob.prova;

public class Student {
    private String name;
    private String ra;

    public Student(String name, String ra) {
        this.name = name;
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public String getRa() {
        return ra;
    }

    @Override
    public String toString() {
        return "Aluno: " + name + ", RA: " + ra;
    }
}
