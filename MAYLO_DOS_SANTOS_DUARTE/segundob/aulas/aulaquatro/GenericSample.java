package segundob.aulas.aulaquatro;

import java.util.Date;

public class GenericSample {
    
    public static void main(String[] args) {

        Student student = new Student();

        Student studentAfterPrint = printClassName(student);
        
        printClassName(Double.valueOf("24.90"));
        printClassName(new Date());

        GenericBox<Teacher> boxWithTeacher = new GenericBox<>(new Teacher());
        GenericBox<Student> boxWithStudent = new GenericBox<>(studentAfterPrint);
        GenericBox<String> boxWithDate = new GenericBox<>("");

        System.out.println(boxWithTeacher.getContent());
        System.out.println(boxWithStudent.getContent());
        System.out.println(boxWithDate.getContent());
    }
    
    public static <T> T printClassName(T anyClass) {
        System.out.println(anyClass.getClass().getName());

        return anyClass;
    }

}
