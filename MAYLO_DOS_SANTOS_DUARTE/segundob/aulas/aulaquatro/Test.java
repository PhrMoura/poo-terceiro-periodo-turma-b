package segundob.aulas.aulaquatro;


public class Test {
    
    public static void main(String[] args) {
        String nome = "";
        Double valor = 23d;
        Student alunos = new Student();

        printClass(nome);
        printClass(valor);
        printClass(alunos);
    }

    public static <T> T printClass(T anyClass) {
        System.out.println(anyClass.getClass().getSimpleName());
    
        return anyClass;
    }

}
