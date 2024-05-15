package primeirob.atividades.uteis;

public class Anotações {

  public static void main(String[] args) {
    int matriz[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
        System.out.println(matriz[linha][coluna]);
      }
    }
  }
}
