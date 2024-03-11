package primeirob.exemplos;

import java.util.Scanner;

public class ExemplosPrimeiraAula {
    
    public static void main(String[] args) {
        
        byte parcela = 23;
        System.out.println("byte: " + parcela);
        
        short idade = 12;
        System.out.println("short: " + idade);
        
        int cep = 85806137;
        System.out.println("int: " + cep);
        
        long numeroCelular = 45991351087l;
        System.out.println("long: " + numeroCelular);
        
        float valorProduto = 20.5f;
        double valorTaxa = 0.3;

        System.out.println("-------------");
        System.out.println("float: " + valorProduto);
        System.out.println("double: " + valorTaxa);
        
        System.out.println("-------------");
        
        char letraA = 65;
        System.out.println(letraA);

        System.out.println("-------------");
        System.out.println(idade > 18 ? "É maior idade" : "Não é maior idade");
        
        System.out.println("-------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua idade");
        int idadeDois = input.nextInt();
        System.out.println("Sua idade é" + idadeDois);
    }

}
