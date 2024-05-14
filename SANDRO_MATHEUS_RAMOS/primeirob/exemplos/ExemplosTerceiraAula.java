package primeirob.exemplos;

public class ExemplosTerceiraAula {

    public static void main(String[] args) {

        // int[][] matrizNaoInicializada;
        // int[][] matrizInicializada = new int[2][4];

        // System.out.println(matrizInicializada);
        // System.out.println(matrizComValor[0][1]);
        // int[] vetor = new int[] { 23, 34, 54, 11, 64 };

        // for (int i = 0; i < vetor.length; i++) {
        // if (i >= 3) {
        // continue;
        // }

        // System.out.println("Passou aqui!" + i);
        // }
        int[][] matrizComValor = new int[][] { { 34, 23, 45 }, { 4, 11, 43 }, { 39, 2, 65 } };

        System.out.print("\n[");

        for (int linha = 0; linha < matrizComValor.length; linha++) {

            for (int coluna = 0; coluna < matrizComValor[linha].length; coluna++) {
                System.out.print(" ");
                System.out.print(matrizComValor[linha][coluna]);
                System.out.print(coluna < matrizComValor[linha].length - 1 ? "," : "");
            }

            System.out.print(linha < matrizComValor.length - 1 ? "\n" : "");
        }

        System.out.print("]\n");
    }

}
