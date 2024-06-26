package primeiroB.exemplos;

public class Exemplos3Aula {
    public static void main(String[] args) {
        int[][] matriz = new int[][] { {1 , 2} , {3 , 4} };
        /* System.out.println(matriz[0][0]);
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][0]);
        System.out.println(matriz[1][1]); */

        /* int[] vetor = new int[] {1 , 2 , 3};
        for (int i = 0; i < vetor.length; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("Passou");
        } */

        System.out.println("Matriz printada:");
        for (int linha = 0; linha < matriz.length; linha++) { // matriz.length = tamanho da matriz
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "] "); // println = printa por linha (TIRA O LN !!!)
            }
            System.out.println();
        }
    }
}