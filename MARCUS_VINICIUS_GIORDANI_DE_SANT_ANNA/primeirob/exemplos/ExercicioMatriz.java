package primeirob.exemplos;

public class ExercicioMatriz {

    public static void main(String[] args) {
        
        float[][] valorNotas = new float[][] {{ 8, 7.1f }, { 9, 6 }, { 8.6f, 7.2f }, { 9.2f, 5.2f }, { 7, 7.4f }};
        float bigData = 0;
        float logProg = 0;

        for (int i = 0; i < valorNotas.length; i++) {

                bigData += valorNotas[i][0];
                logProg += valorNotas[i][1];
        }

        float mediaBigData = bigData / valorNotas.length;
        float mediaLogProg = logProg / valorNotas.length;

        System.out.println("A media de Big data eh: " + mediaBigData);
        System.out.println("A media Log Prog eh: " + mediaLogProg);

    }
    
}
