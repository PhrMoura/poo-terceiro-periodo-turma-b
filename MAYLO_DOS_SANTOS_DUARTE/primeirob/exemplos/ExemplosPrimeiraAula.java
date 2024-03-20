package primeirob.exemplos;

import java.util.Scanner;

public class ExemplosPrimeiraAula {

    public static void main(String[] args) {
        
        // TIPOS INTEIROS

        byte quantidadeParcela = 12; // Exemplo de como criar uma variavel do tipo byte

        System.out.println("Variavel byte " + quantidadeParcela); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");

        short valorCarro = 12000; // Exemplo de como criar uma variavel do tipo short

        System.out.println("Variavel short " + valorCarro); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");

        int cep = 85814235; // Exemplo de como criar uma variavel do tipo int

        System.out.println("Variavel int: " + cep); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");

        long numeroCelular = 45998029132l; // Exemplo de como criar uma variavel do tipo long (IMPORTANTE "l" no fim para transformar int em long)

        System.out.println("Variavel long: " + numeroCelular); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");

        // DEMAIS TIPOS

        float valorProduto = 2.50f; // Exemplo de como criar uma variavel do tipo float (IMPORTANTE "f" no fim para transformar double em float)

        System.out.println("Variavel float: " + valorProduto); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");

        double valorTaxa = 5.50; // Exemplo de como criar uma variavel do tipo double

        System.out.println("Variavel double: " + valorTaxa); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");

        char sexo = 'F'; // Exemplo de como criar uma variavel do tipo char

        System.out.println("Variavel char: " + sexo); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");
        
        boolean isMale = sexo != 'F'; // Exemplo de como criar uma variavel do tipo boolean

        System.out.println("Variavel boolean: " + isMale); // Exibindo valor da variavel

        System.out.println("------------------------------------------------");

        int idade = 17; // Criação de variavel para Exemplo de Operador Ternario

        System.out.println(idade >= 18 ? "É maior de idade" : "É menor de idade"); // Exemplo de Operador ternario

        System.out.println("------------------------------------------------");

        Scanner leitor = new Scanner(System.in); // Instanciado a classe Scanner
        idade = leitor.nextInt(); // Solicitando a Entrada de Dados

        System.out.println("Sua idade é: " + idade);

        leitor.close();
    }
    
}
