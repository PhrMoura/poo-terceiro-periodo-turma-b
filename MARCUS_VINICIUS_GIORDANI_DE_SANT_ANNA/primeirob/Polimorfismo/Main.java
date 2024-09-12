package primeirob.Polimorfismo;

import primeirob.heranca.AlunoNinja;

public class Main {
    
    public static void main(String[] args) {
    
        AlunoNinja alunoNinja = new AlunoNinja("Naruto", 16, "Folha", "Uzumaki", "Shuriken", "Rasengan", " Time 1", "Kakashi");

        Hokage hokage = new Hokage("Naruto", 30, "Folha", "Uzumaki", "Shuriken", "Rasengan", 4);

        alunoNinja.realizarInvocacao();
        hokage.realizarInvocacao();

    }

}
