package primeirob.Exemplos;

import java.util.Scanner;

public class ExemplosPrimeiraAula {
    public static void main(String[] args) {

        System.out.println("Inteiros:");

        byte parcela = 23;
        System.out.println("byte: " + parcela); // byte

        System.out.println("----------------");

        short idade = 12;
        System.out.println("short: " + idade); //short

        System.out.println("----------------");

        int cep = 85806137;
        System.out.println("int: " + cep); //int

        System.out.println("----------------");

        long numeroCelular = 45999887766l; //precisa ter o l no final
        System.out.println("long: " + numeroCelular); //long

        System.out.println("----------------");

        System.out.println("Flutuantes, Booleanos e Caracteres");

        float valorProduto = 20.5f;
        double valorTaxa = 0.3;

        System.out.println("float: " + valorProduto);
        System.out.println("double: " + valorTaxa);

        System.out.println("----------------");

        char letraA = 'A';
        System.out.println("char: " + letraA);

        System.out.println("----------------");

        boolean isMaiorDeIdade = false;

        System.out.println("booleano: " + isMaiorDeIdade);

        System.out.println(idade > 18 ? "É maior de idade": "Não é maior");

        System.out.println("----------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        int idadeDois = input.nextInt();
        System.out.println("Sua idade é " + idadeDois);
        input.close();
        
    }
}
