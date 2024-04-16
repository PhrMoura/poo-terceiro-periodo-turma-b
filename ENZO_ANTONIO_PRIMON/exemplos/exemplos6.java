package exemplos;

public class exemplos6 {
    public static void main(String[] args) {
        int[][] anMultArrayInitialized = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int l = 0; l < anMultArrayInitialized.length; l++) {
            System.out.println("============");
            for (int c = 0; c < anMultArrayInitialized[l].length; c++) {

                System.out.println(anMultArrayInitialized[l][c]);
                
            }
        }
    }
}
