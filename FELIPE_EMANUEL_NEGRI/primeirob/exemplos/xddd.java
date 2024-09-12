package primeirob.exemplos;

public class xddd {
    public static void main(String[] args) {
        /*int[][] matrizInicializada = new int[2][4];

        System.out.println(matrizInicializada[][0]);*/

        int[][] matriz = {
            {43, 27, 12},
            {32, 74, 33},
            {22, 8, 37}
        };

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Elemento na posição [" + linha + "][" + coluna + "]: " + matriz[linha][coluna]);
            }
        }
    }
}
