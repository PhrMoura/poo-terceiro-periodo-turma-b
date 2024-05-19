package primeiroB.exemplos.quintaAula;

public class Exemplos5Aula {
    public static void main(String[] args) {

        // Acesso classe Professor
        Professor profeUm = new Professor();
        Professor oMelhorProfe = new Professor();

        profeUm.nome = "Roberto";
        profeUm.materia = "A.I";

        oMelhorProfe.nome = "Sandrolaxx";
        oMelhorProfe.materia = "POO";

        oMelhorProfe.apresentarse();

        // Acesso classe Arma
        Arma awp = new Arma();

        awp.nome = "AWP";
        awp.tipo = "rifle";
        awp.dano = 110;

        System.out.println(awp.toString());

    }
}
