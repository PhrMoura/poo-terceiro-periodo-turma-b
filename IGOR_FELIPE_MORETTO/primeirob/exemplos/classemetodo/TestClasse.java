package primeirob.exemplos.classemetodo;

public class TestClasse {
    public static void main(String[] args) {
        
        Professor profeUm = new Professor();
        Professor melhorProfe = new Professor();

        profeUm.nome = " Roberto";
        profeUm.materia = " A.I";
        
        melhorProfe.nome = " Sandro Ramos";
        melhorProfe.materia = " POO";

        melhorProfe.apresentarse();

        Arma awp = new Arma();

        awp.nome = "AWP Fever Dream";
        awp.tipo = "Rifle";
        awp.dano = 150;

        melhorProfe.arma = awp;

        //System.out.println(awp.toString());
    }
    
}
