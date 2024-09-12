package exemplos.ExemplosAulaSete;

import java.util.Date;

public class ExemplosDate {
    
    public static void main(String[] args) {
        Date dataAtual = new Date();
        long umDia = 86400000;

        System.out.println(dataAtual.getTime());
        long msCIncoDias = dataAtual.getTime() + (umDia * 5);


        Date cincoDias = new Date(msCIncoDias);
        System.out.println(cincoDias);

        if (dataAtual.getTime() > cincoDias.getTime()){
            System.out.println("Error: data atual maior!");
        }

        long valorDif = dataAtual.getTime() - cincoDias.getTime();

        long dias = valorDif / umDia;

        System.out.println(dias);

    }
}
