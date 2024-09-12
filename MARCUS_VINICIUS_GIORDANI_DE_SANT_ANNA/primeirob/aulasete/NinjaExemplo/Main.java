package primeirob.aulasete.NinjaExemplo;

public class Main {
    public static void main(String[] args) {
        Ninja primeiroNinja = new Ninja("Naruto", 16, "Folha", "Shuriken", "Uzumaki", "Rasengan");
        // Ninja segundoNinja = new Ninja();

        // primeiroNinja.setAldeia("Folha");

        System.out.println(primeiroNinja.toString());

        primeiroNinja.realizarAniversario();

        System.out.println(primeiroNinja.toString());

        // primeiroNinja.nome = "Naruto";
        // primeiroNinja.idade = 16;
        // primeiroNinja.aldeia = "Folha";
        // primeiroNinja.equipamento = "Shuriken";
        // primeiroNinja.cla = "Uzumaki";
        // primeiroNinja.nomeJutso = "Rasengan";
        
        // Ninja segundoNinja = new Ninja();
        
        // segundoNinja.nome = "Sasuke";
        // segundoNinja.idade = 16;
        // segundoNinja.aldeia = "Folha";
        // segundoNinja.equipamento = "Shuriken";
        // segundoNinja.cla = "Uchiha";
        // segundoNinja.nomeJutso = "Chidori";
        
    //     primeiroNinja.apresentarse();
        
    //     primeiroNinja.realizarJutso();
     
    //     segundoNinja.apresentarse();
        
    //     segundoNinja.realizarJutso();
    // }
}
}
