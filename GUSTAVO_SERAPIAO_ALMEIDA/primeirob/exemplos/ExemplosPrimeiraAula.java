package exemplos;

import java.util.Scanner;

public class ExemplosPrimeiraAula {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        int[] vetor1;
        int[] vetor2 = new int[2];
        int[] vetor3 = new int[] { 13, 14, 15 };
        int[] vetor4 = vetor2; // Se o vetor 2 for alterado o vetor 4 também será alterado.
        
        vetor2[0] = 15;

        //System.out.println(vetor1);
        System.out.println(vetor2[0]);
        System.out.println(vetor3[2]);
        
        String[] palavras = new String[] { "a", "b", "c" };

        System.out.println(palavras[0]);
        System.out.println(palavras[1]);
        System.out.println(palavras[2]);
    }
}
