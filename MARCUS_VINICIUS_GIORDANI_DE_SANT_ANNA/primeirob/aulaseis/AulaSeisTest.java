package primeirob.aulaseis;

public class AulaSeisTest {

    public static void main(String[] args) {
        
        Professor profeUm = new Professor();
        Professor oMelhorProfe = new Professor();

        profeUm.nome = "Roberto";
        profeUm.materia = "A.I.";

        oMelhorProfe.nome = "Sandrolaxx";
        oMelhorProfe.materia = "POO";

        oMelhorProfe.apresentarse();

        Arma awp = new Arma();
        Arma awp2 = new Arma();

        awp.nome = "Dream Fever";
        awp.tipo = "AWP";
        awp.dano = 110;

        System.out.println(awp.toString());
        System.out.println(awp2.toString());
    }
    
}
