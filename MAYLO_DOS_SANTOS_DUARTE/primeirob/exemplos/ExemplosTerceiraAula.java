package primeirob.exemplos;

public class ExemplosTerceiraAula {

    public static void main(String[] args) {

        /*  Exemplos De Inicialização de Matriz
        int[][] matrizNaoInicializada;
        int[][] matrizInicializada = new int[2][4];
        int[][] matrizComValor = new int[][] { { 34, 23}, { 3, 9}, { 5, 4} };

        System.out.println(matrizInicializada);
        System.out.println(matrizComValor[0][1]); */

        /* Exemplos interação laço e vetor
        int[] vetor = new int[] { 23, 34, 54};

        
        for (int index = 0; index < vetor.length; index++) {
            if (index >= 3)
            {
                continue;
            }

            System.out.println("Passou aqui!"); 
        } */

        int[][] matrizComValor = new int[][] { { 34, 23}, { 3, 9}, { 5, 4} };

        for (int linha = 0; linha < matrizComValor.length; linha++) {
            for (int coluna = 0; coluna < matrizComValor[linha].length; coluna++) {
                System.out.print(matrizComValor[linha][coluna] + " ");
            }
            System.out.println();
        }
    
    }
    

    
    
}