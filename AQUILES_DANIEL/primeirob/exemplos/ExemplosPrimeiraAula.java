package primeirob.exemplos;

import java.util.Scanner;

public class ExemplosPrimeiraAula {
  public static void main(String[] args) {
    byte parcela = 12;
    // armazena ate -128 ate 127
    short idade = 150;
    // armazena ate 32 mil positivo e negativo
    int cep = 54865;
    // armazena ate uns bucado
    long numeroDoZap = 45998202258l;
    // muito numero fi

    System.out.println("-----------------");

    float dolar = 4.99f;
    // numero quebrado
    double dolarDnv = 15.55d;
    // numero maior quebrado
    char letra = 'a';
    boolean verdadeiro = true;
    System.out.println(verdadeiro);

    System.out.println(letra);

    System.out.println("Informe sua idade amigo");
    Scanner input = new Scanner(System.in);

    int idadeDois = input.nextInt();

    System.out.println("sua idade é: " + idadeDois);

    System.out.println("byte " + parcela);
    System.out.println("short " + idade);
    System.out.println("int " + cep);
    System.out.println("long " + numeroDoZap);
    System.out.println("dolar " + dolar);
    System.out.println("dolarMT " + dolarDnv);
  }
}
