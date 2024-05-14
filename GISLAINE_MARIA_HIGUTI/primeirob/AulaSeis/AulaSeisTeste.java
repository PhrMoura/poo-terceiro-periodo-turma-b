package primeirob.AulaSeis;

public class AulaSeisTeste {
    
    public static void main(String[] args) {

        Professor profUm = new Professor();
        Professor oMelhorProf = new Professor();   
        
        profUm.nome = "Roberto";
        profUm.materia = "A.I.";

        oMelhorProf.nome = "Sandrolaxx";
        oMelhorProf.materia = "P.O.O.";

        oMelhorProf.apresentarse();

        System.out.println();

        Arma awp = new Arma();
        Arma awp2 = new Arma();

        awp.nome = "AWP";
        awp.tipo = "Rifle";
        awp.dano = 110;

        //oMelhorProf.arma = awp;

        System.out.println(awp.toString());
        System.out.println(awp2.toString());
    }
}
