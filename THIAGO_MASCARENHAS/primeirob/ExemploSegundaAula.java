
public class ExemploSegundaAula {
    public static void main(String[] args) {
        int contador = 9;
        
        if (contador < 2) {
            System.out.println("É menor que dois");
          }  else if (contador < 7) {
                System.out.println("É menor que sete");
            } else if (contador < 10); {
                System.out.println("É menor que dez");
            }
        
    //int[] vetor1;
            int[] vetor2 = new int[2];
            int[] vetor3 = new int[] {23,45,72};
            
            //System.out.println(vetor1);
            System.out.println(23);
            System.out.println(vetor2[0]);
            System.out.println(vetor2[1]);
            System.out.println(vetor3[0]);
            System.out.println(vetor3[1]);
            System.out.println(vetor3[2]);
            
            
            vetor2[0] = 99;
            System.out.println(vetor2[0]);
            

            String[] palavras = new String[] {"Olá" ,"Show", "Top"};
            
            System.out.println(palavras[0]);
            System.out.println(palavras[1]);
            System.out.println(palavras[2]);

    }
}
