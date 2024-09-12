package primeirob.AulaSete;

public class AulaSete {
    
    public static void main(String[] args) {
//        
//        Ninja primeiroNinja =  new Ninja();
//        Ninja segundoNinja = new Ninja();
//
//        primeiroNinja.nome = "Naruto";
//        primeiroNinja.idade = 16;
//        primeiroNinja.aldeia = "Folha";
//        primeiroNinja.cla = "Uzumaki";
//        primeiroNinja.nomeJutsu = "Rasengan";
//
//        segundoNinja.nome = "Sasuke";
//        segundoNinja.idade = 16;
//        segundoNinja.aldeia = "Folha";
//        segundoNinja.cla = "Uchiha";
//        segundoNinja.nomeJutsu = "Chidori";
//
//        primeiroNinja.apresentarSe();
//        primeiroNinja.realizarJutsu();
//
//        System.out.println();
//
//        segundoNinja.apresentarSe();
//        segundoNinja.realizarJutsu();
//

        Funcionario funcionarioUm = new Funcionario();
        funcionarioUm.salario = 1000d;

        Gerente gerenteUm = new Gerente();
        gerenteUm.salario = 1000d;

        Analista analistaUm = new Analista();
        analistaUm.salario = 1000d;

        funcionarioUm.calcularBonus();
        gerenteUm.calcularBonus();
        analistaUm.calcularBonus();

    }

}
