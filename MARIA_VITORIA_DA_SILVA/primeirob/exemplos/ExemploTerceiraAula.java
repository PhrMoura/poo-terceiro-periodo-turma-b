package primeirob.exemplos;

public class ExemploTerceiraAula {
    public static void main(String[] args) {
        /*
         * int[][] matrizNaoInicializada;
         * int[][] matrizInicializada = new int[2][4];
         * 
         * /System.out.println(matrizInicializada[0][0]);
         */

        int[][] matrizDeExemplo = new int [][] {{9, 8, 7, 6}, {5, 4, 3, 2}};

        System.out.println(matrizDeExemplo[0][3]); //6
        System.out.println(matrizDeExemplo[1][1]); //4

        // int[] vetor = new int[] { 23, 34, 54, 10 };

        // for (int i = 0; i < vetor.length; i++) {
        //     if (i == 2) {
        //         break;
        //     }

        //     System.out.println("Passou aqui!");
        // }
        // for (int i = 0; i < vetor.length; i++) {
        //     if (i >= 3) {
        //         continue;
        //     }

        //     System.out.println("Passou aqui!" + i);
        // }

        for(int linha = 0; linha < matrizDeExemplo.length; linha++){
            for(int coluna = 0; coluna < matrizDeExemplo[linha].length; coluna++){
                System.out.println("Linha: " + linha + " Coluna: " + coluna + " Valor: " + matrizDeExemplo[linha][coluna]);
            }
        }
    }
}