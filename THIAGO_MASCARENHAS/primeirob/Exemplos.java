package primeirob;

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        
        byte parcela = 23;
        System.out.println("byte: " + parcela); //Byte
       
        System.out.println("----------------");

        short idade = 12;
        System.out.println("short: " + idade);// short
        
        System.out.println("----------------");

        int cep = 8506137;
        System.out.println("int: " + cep );// int

        System.out.println("----------------");

        long numeroCelular = 45999251366l;
        System.out.println("long:" + numeroCelular);
        
        System.out.println("----------------");

        float valorProduto = 20.5f;
        double valorTaxa = 0.3;

        System.out.println("----------------");

        System.out.println("float:" + valorProduto);
        System.out.println("double:" + valorTaxa);
        
        System.out.println("----------------");

        char letraA = 'A'; 
        System.out.println("char:" + letraA);
        
        System.out.println("----------------");

        boolean isMaiorDeIdade = false;
        System.out.println("boolean:" + isMaiorDeIdade);

        System.out.println(idade > 18 ? "É maior de idade":"Não é maior de idade");

        System.out.println("----------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua idade ?");
        int idadeDois = input.nextInt();
        System.out.println("Sua idade" + idadeDois);
        input.close();

    
    }
}
