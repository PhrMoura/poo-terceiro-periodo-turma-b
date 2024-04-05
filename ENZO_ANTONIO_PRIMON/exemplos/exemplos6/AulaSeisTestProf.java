package  exemplos.exemplos6;

public class AulaSeisTestProf {
    public static void main(String[] args) {
        Professor professorUm = new Professor();
        Professor professorDois = new Professor();
    
    
        professorUm.nome = "Roberto";
        professorUm.materia = "Projeto de Software";
    
        professorDois.nome = "Sandro";
        professorDois.materia = "POO";

        professorUm.apresentarse();
    }    
}
    