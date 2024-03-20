package primeirob.exemplos;

public class ExemploSegundaAula {
    public static void main(String[] args) {
        int contador = 9;

        if (contador < 2) {
            System.out.println("É menor que dois");
        } else if (contador < 7){
            System.out.println("É maior que sete");
        } else if(contador < 10){
            System.out.println("É menor que dez");
        }

        int[] vetor2 = new int [2];
        int[] vetor3 = new int [] {23,45,72};

        System.out.println(vetor2[0]);
        System.out.println(vetor2[1]);
        System.out.println(vetor3[0]);
        System.out.println(vetor3[1]);
        System.out.println(vetor3[2]);

    }
}
