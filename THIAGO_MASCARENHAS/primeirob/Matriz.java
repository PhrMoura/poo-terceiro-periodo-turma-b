public class Matriz {
    public static void main(String[] args) {
        
        //int [] [] matrizNaoInicializada;     

       // int [] [] matrizNaoInicializada = new int [2][4]; // primeiro [] Linhas, segundo [] colunas 
        
        //System.out.println(matrizNaoInicializada);

        int [] [] matrizComValor = new int [] [] { { 34, 23 } , {4, 1}};

        //System.out.println(matrizComValor);
        //System.out.println(matrizComValor[0][1]);

        //int[] vetor = new int[] { 23, 34, 54 };//

        //for (int i = 0; i < vetor.length; i++) {
        //    if (i == 2){
        //        break;
        //    }
        //    System.out.println("passou aqui!");
        //}
        //int[] vetor = new int[] { 23, 34, 54 };//

        //for (int i = 0; i < vetor.length; i++) {
        //    if (i >= 3){
        //        continue;
        //    }
        //    System.out.println("passou aqui!");
        //}
        System.out.print("[");
        for (int i = 0; i < matrizComValor.length; i++) {
            for (int j = 0; j < matrizComValor[i].length; j++) {
                System.out.print(matrizComValor [i] [j] + " ");
            }
            System.out.println();
        }
        System.out.print("]");
    }
}
