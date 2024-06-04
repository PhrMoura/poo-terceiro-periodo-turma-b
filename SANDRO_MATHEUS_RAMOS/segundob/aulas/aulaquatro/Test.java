package segundob.aulas.aulaquatro;

import java.util.Date;

public class Test {
    
    public static void main(String[] args) {
        String nome = "";
        Double valor = 23d;
        Student alunos = new Student();

        printClass(nome);
        printClass(valor);
        printClass(alunos);
        Date data = printClass(new Date());
    }

    public static <T> T printClass(T anyClass) {
        System.out.println(anyClass.getClass().getSimpleName());
    
        return anyClass;
    }

}
