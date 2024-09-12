package exemplos;

public class exemplos3 {
    public static void main(String[] args) {
       // int [] vetor1;
        int [] vetor2 = new int[2];
        int [] vetor3 = new int[] {23, 45, 72};
       // int [] vetor4 = vetor2;

        // System.out.println(vetor1); Não foi inicializado
        System.out.println(vetor2);
        System.out.println(vetor3);
        System.out.println(vetor3[2]);


        System.out.println("-------------------");

        vetor2[0] = 99;
        System.out.println(vetor2);

        String[] palavras = new String[] { "Olá", "Tchau", "ByeBye"};

        System.out.println(palavras[0]);
        System.out.println(palavras[1]);
        System.out.println(palavras[2]);
    }
    
}
