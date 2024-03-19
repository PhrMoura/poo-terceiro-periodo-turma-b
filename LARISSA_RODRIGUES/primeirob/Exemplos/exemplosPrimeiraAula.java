package primeirob.Exemplos;

public class exemplosPrimeiraAula {
    public static void main(String[] args) {
        System.out.println("----- Números inteiros -----");

        byte parcela = 23;
        System.out.println("byte: " + parcela); //print do byte

        short idade = 19;
        System.out.println("short: " + idade); //print do short

        int cep = 85845000;
        System.out.println("int: " + cep); //print do int

        long numeroCelular = 45998096149l; //quando é long precisa do l no fim
        System.out.println("long: " + numeroCelular); //prit do long


        System.out.println("----- Números decimais -----");

        float valorProduto = 20.5f; //quando é float precisa do f no fim
        System.out.println("float: " + valorProduto); //print do float

        double valorTaxa = 0.3;
        System.out.println("double: " + valorTaxa); //prit do double

        
        System.out.println("----- Letras -----");

        char letraA = 'A'; //aspas simples
        System.out.println("char: " + letraA); //print do char

        boolean isMaiorDeIdade = idade > 18; //verdadeiro ou falso
        System.out.println("boolean: " + isMaiorDeIdade); //print do boolean


    }
}
