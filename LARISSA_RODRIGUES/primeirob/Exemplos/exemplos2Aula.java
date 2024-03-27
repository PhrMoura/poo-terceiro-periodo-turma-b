package primeirob.Exemplos;

public class Exemplos2Aula {
    public static void main(String[] args) {
        
        int contador = 9;

        if (contador < 9) {
            System.out.println("É menor que dois.");
        } else if (contador < 7) {
            System.out.println("É menor que sete.");
        } else if (contador < 10) {
            System.out.println("É menor que dez.");
        }

        switch (contador) {
            case 0:
            System.out.println("Contador igual a 0.");
            break;

            case 1:
            System.out.println("Contador igual a 1.");
            break;

            default:
            System.out.println("Contador negativo ou maior que um.");
            break;
        }

        // int[] vetor1;
        int[] vetor2 = new int[2];
        int[] vetor3 = new int[] {23 , 45 , 72};

        // System.out.println(vetor1); erro de compilação pq não inicializou a variável
        System.out.println(vetor2);
        System.out.println(vetor3[2]); // acessa por posição

        // vetor de string
        String[] palavras = new String[] {"Oi" , "Eai"};
        System.out.println(palavras[0]);
        System.out.println(palavras[1]);
    }
}