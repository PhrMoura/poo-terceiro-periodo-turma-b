package exemplos.exemplos6;

public class AulaSeisTestArma {
    public static void main(String[] args) {
        Arma armaExemplo = new Arma();

        armaExemplo.nome = "Fever Dream";
        armaExemplo.tipo = "AWP";
        armaExemplo.dano = 110;

        System.out.println(armaExemplo.toString()); 
    }
}
