package primeirob.aula05;

public class Aula05Teste {
    public static void main(String[] args) {
        Professor profUm = new Professor();
        Professor profDois = new Professor();

        profUm.nome = "Roberto";
        profDois.nome = "Luis";

        profUm.materia = "A.I.";
        profDois.materia = "ASE";

        profUm.apresentarse();
        profDois.apresentarse();

        Arma awp = new Arma();

        awp.nome = "AWP";
        awp.tipo = "Rifle";
        awp.dano = 110;
    }
}
