package primeirob.exemplos;

import java.util.Scanner;

public class ExemploPrimeiraAula {
    public static void main(String[] args) {
        byte parcela = 23;
        System.out.println(parcela);//byte

        short idade = 12;
        System.out.println("Byte: " + idade);//short


        int cep = 85816060;
        System.out.println("int: " + cep);//short

        long numeroTelefone = 45998168991l;
        System.out.println("long: " + numeroTelefone);//long

        float valorProduto = 20.5f;
        double valorTaxa = 0.3;

        System.out.println("float: " + valorProduto);//float
        System.out.println("double: " + valorTaxa);//double

        char letraA = 65;
        System.out.println("char: " + letraA);//char

        boolean ehMaiorDeIdade = true;
        System.out.println("boolean: " + ehMaiorDeIdade);//boolean

        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idadeDois = input.nextInt();
        System.out.println("Idade informada: " + idadeDois);
        
    }
}
