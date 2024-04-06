package exemplos.aulaseis;

public class AulaSeisTeste {
    public static void main(String[] args) {

        Professor profeUm = new Professor();
        Professor oMelhorProfe = new Professor();

        profeUm.nome = "Roberto";
        profeUm.materia = "Projeto de Software";

        oMelhorProfe.nome = "Sandro";
        oMelhorProfe.materia = "POO";

        oMelhorProfe.apresentarse();

        Arma awp = new Arma();

        awp.nome = "Fever Dream";
        awp.tipo = "AWP";
        awp.dano = 110;

        System.out.println(awp.toString());
    }
}
