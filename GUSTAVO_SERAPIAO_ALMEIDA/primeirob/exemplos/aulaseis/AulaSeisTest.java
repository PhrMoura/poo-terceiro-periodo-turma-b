package exemplos.aulaseis;

public class AulaSeisTest {
    
    public static void main(String[] args) {
        
        Professor profUm = new Professor();
        Professor melhorProfessor = new Professor();

        profUm.Nome = "Roberto";
        profUm.Materia = "A.I";

        melhorProfessor.Nome = "Sandro";
        melhorProfessor.Materia = "POO";

        melhorProfessor.apresentarse();

        Arma awp = new Arma();
        
        awp.nome = "AWP";
        awp.tipo = "Rifle de Precisão";
        awp.dano = 110;

        System.out.println(awp.toString());
    }

}
