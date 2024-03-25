package primeirob.exemplos;

public class ExemplosSegundaAula {
    
    public static void main(String[] args) {
        
        // Exemplo de IF

        int contador = 9;

        if  (contador < 2) {
            System.out.println("É menor que dois");
        } else if (contador < 7) {
            System.out.println("É menor que sete");
        } else if (contador < 10) {
            System.out.println("É menor que dez");
        }

        System.out.println("-------------------------------------");

        // Exemplo de vetor

        //int[] vetor1;
        int[] vetor2 = new int[2]; // Criação do vetor só por tamanho.
        int[] vetor3 = new int[] {23, 45, 72}; // Criação do vetor por variaveis definidas previamente.

        //System.out.println(vetor1);
        System.out.println(vetor2); // Impressão de endereçamento de memoria.
        System.out.println(vetor3[0] + " " + vetor3[1] + " " + vetor3[2]); // Impressão do valor armazenado no vetor
    }
}
