package primeirob;

public class exemplos5 {
    public static void main(String[] args) {
        int [] vetor = new int[] {23, 34, 54};

        for(int i = 0; i < vetor.length; i++){
            if (i >= 3) {
                continue;
            }
                System.out.println("Passou aqui " + i);
        }
    }
}
    

