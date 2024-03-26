package primeirob.atividades;

public class Anotações {

  public static void main(String[] args) {
    int contador = 9;

    if (contador < 2) {
      System.out.println("É menor que dois.");
    } else if (contador < 7) {
      System.out.println("É menor que sete.");
    } else if (contador < 10) {
      System.out.println("É menor que dez.");
    }

    int vetor[] = new int[10];
    int numero = 10;

    for (int i = 0; i < 10; i++) {
      vetor[i] = numero;
      numero += 1;
    }
    System.out.println(vetor[4]);
  }
}
