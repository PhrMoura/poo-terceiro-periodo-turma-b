package primeirob.exemplos;

public class ExemplosPrimeiraAula {
    public static void main(String[] args) {
        
        byte parcela = 12;  //byte variavel -128 ate 127 padrao = 0
        System.out.println("byte: " + parcela);

        short idade = 18;   //variavel 32mil
        System.out.println("idade: " + idade);
        
        int cep = 85802180;  //numero bao mas nao tanto
        System.out.println("int: " + cep);
        
        long numeroZap = 998318409l; //muito numero pprt
        System.out.println("long: " + numeroZap);
        
        System.out.println("-----------------");

        float money = 9.99f; //numero quebrado
        System.out.println("float: " + money);
        
        double muitoMoney = 9.99999d; //muito numero quebrado
        System.out.println("double: " + muitoMoney);

        System.out.println("------------------");

        char letraA = 65;
        System.out.println("char: " + letraA);
    }


}
