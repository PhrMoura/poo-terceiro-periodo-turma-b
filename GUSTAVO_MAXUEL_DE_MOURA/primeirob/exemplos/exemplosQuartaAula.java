package primeirob.exemplos;

public class exemplosQuartaAula {
    public static void main(String[] args) {
        System.out.println("[");
        int [] [] matriz = new int [] [] {{1,2,3}, {4,5,6},{7,8,9}};
        for (int linha = 0; linha < matriz.length; linha++) {
            for ( int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println(",]");
            System.out.println("\n");
        }

    }
    
}
