package primeirob.exemplos;

public class TesteClasse {
    public static void main(String[] args) {
        Professor profeUm = new Professor();
        Professor melhProfessor = new Professor();

        profeUm.nome = "Jacarezao";
        profeUm.materia = "I.a";
        
        melhProfessor.materia = "POO";
        melhProfessor.nome = "Crocodilo";
        melhProfessor.apresentarse();
    }
    
}
