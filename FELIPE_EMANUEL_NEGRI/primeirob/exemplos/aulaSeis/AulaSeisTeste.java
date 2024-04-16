package primeirob.exemplos.aulaSeis;

public class AulaSeisTeste {
    public static void main(String[] args) {
        
        Professor profeUm = new Professor();
        Professor oMelhorProfe = new Professor();

        profeUm.nome = "roberto";
        profeUm.materia = "putcharia";

        oMelhorProfe.nome = "Putão";
        oMelhorProfe.materia = "Putcharia 2";

        oMelhorProfe.apresentarse();
    }
}
