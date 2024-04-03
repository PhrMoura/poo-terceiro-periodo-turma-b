package primeirob.exemplos.aulaseis;

public class AulaSeisTest {
    
    public static void main(String[] args) {
        
        Professor profeUm = new Professor();
        Professor oMelhorProfe = new Professor();

        profeUm.nome = "Roberto";
        profeUm.materia = "A.I";

        oMelhorProfe.nome = "Sandrolaxx";
        oMelhorProfe.materia = "poo";

        oMelhorProfe.apresentarse();

        Arma awp = new Arma();
        Arma awp2 = new Arma();

        awp.nome = "AWP";
        awp.tipo = "rifle";
        awp.dano = 110;

        Graduacao graduacao = new Graduacao();

        graduacao.nome = "Engenharia de Software";
        graduacao.tipo = "Tecnologia";

        // oMelhorProfe.graduacao = graduacao;

        // System.out.println(awp.toString());
        // System.out.println(awp2.toString());

    }

}
