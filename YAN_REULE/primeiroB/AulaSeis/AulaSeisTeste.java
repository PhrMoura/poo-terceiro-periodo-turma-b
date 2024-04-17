package AulaSeis;

public class AulaSeisTeste {

    public static void main(String[] args) {
        Professor profeUm = new Professor();
        Professor oMelhorProfessor = new Professor();

        profeUm.nome = "Roberto";
        profeUm.materia = "A.I";

        oMelhorProfessor.nome = "Sandrolaxx";
        oMelhorProfessor.materia = " poo";

        oMelhorProfessor.apresentarse();

        Arma glock = new Arma();

        glock.nome = "Glock";
        glock.tipo = "Pistola";
        glock.dano = 20;

        oMelhorProfessor.arma = glock;

    }
}
