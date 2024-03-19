package exemplos;
import java.util.Scanner;


public class exemploPrimeiraAula {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        byte parcela = 24;

        System.out.println(parcela);

        short idade = 23;
        System.out.println(idade);

        int numero = 111111;
        System.out.println(numero);

        long numeroCelular = 46991404118l;
        System.out.println(numeroCelular);

        float valorQuebrado = 2.1234f;
        System.out.println(valorQuebrado);

        double valorQuebradis = 1.12345d;
        System.out.println(valorQuebradis);

        char sexo = 'F';
        System.out.println(sexo);

        boolean aulaBoa = false;
        System.out.println(aulaBoa);

        System.out.println("Informe sua idade");
        int idadis = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Sua idade é: " + idadis);

        entrada.close();
    }
}
