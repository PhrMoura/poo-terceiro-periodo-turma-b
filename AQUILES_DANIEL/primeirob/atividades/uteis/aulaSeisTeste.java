package primeirob.atividades.uteis;

public class aulaSeisTeste {
  public static void main(String[] args) {
    Professor profUm = new Professor();
    profUm.nome = "roberto";
    profUm.materia = "I.A";

    Professor oMelhorProfessor = new Professor();
    oMelhorProfessor.nome = "Sandrolaxx";
    oMelhorProfessor.materia = "P.O.O";

    oMelhorProfessor.apresentarse();

    Professor neita = new Professor();
    neita.nome = "neita";
    neita.materia = "armamento belico hehe";

    Arma awp = new Arma();

    awp.nome = "Dragon Lore";
    awp.tipo = "AWP";
    awp.dano = 110;

    System.out.println(awp.toString());
  }
}
