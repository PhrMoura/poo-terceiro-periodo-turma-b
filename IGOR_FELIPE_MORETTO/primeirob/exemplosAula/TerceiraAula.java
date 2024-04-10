package primeirob.exemplosAula;

public class TerceiraAula {
    public static void main (String[] args){

        int [][] matrizNaoInicializada;
        int [][] matrizInicializada = new int [2][4];
        int [][] matriz = new int [][] {{3, 9, 12}, {2, 4, 8}};

        System.out.println(matriz [1][0]);
        System.out.println(matriz [0][1]);

        int [] vetor = new int [] {20, 30, 40};

        for (int i = 0; i < vetor.length; i++) {
            if (i > 2) {
                continue;
            }
            System.out.println("Passou!" + i);
            
        }
        System.out.println("\n");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println(matriz[linha][coluna]);
            }
        
            System.out.println();
        }
    
}
}