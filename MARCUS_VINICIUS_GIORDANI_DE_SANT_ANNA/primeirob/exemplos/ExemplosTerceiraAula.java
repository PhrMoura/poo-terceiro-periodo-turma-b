package primeirob.exemplos;

public class ExemplosTerceiraAula {

    public static void main(String[] args) {

        // int[][] matrizNaoInicializada;
        // int[][] matrizInicializada = new int[2][4];
        int[][] matrizComValor = new int[][] { { 34, 23 }, { 4, 11 } };
        // System.out.println(matrizInicializada);
        //System.out.println(matrizComValor[0][1]);

        // int[] vetor = new int[] { 23, 34, 54, 11, 64 };

        // for (int i = 0; i < vetor.length; i++) {
        // if (i >= 3) {
        // continue;
        // }

        // System.out.println("Passou aqui!" + i);
        // }
        System.out.println("[");
        System.out.println();
        for (int linha = 0; linha < matrizComValor.length; linha++) {
            for (int coluna = 0; coluna < matrizComValor[linha].length; coluna++) {
                System.out.print(matrizComValor[linha][coluna] + " ");
            }
            System.out.println();
        }
        System.out.println("]");
    }

}
