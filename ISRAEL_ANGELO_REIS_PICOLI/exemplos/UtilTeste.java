package exemplos;

import java.util.Date;

public class UtilTeste {
    public static void main(String[] args) {
        Long umDiaEmMs = 86400000l;
        Date dataAtual = new Date();
    
        Date dataSemHora = new Date(dataAtual.getYear(), dataAtual.getMonth(), dataAtual.getDate());

        Date cincoAbril = new Date(124, 03, 05);
        Long cincoAbrilEpoch = cincoAbril.getTime();

        System.out.println(dataAtual.toString());

        System.out.println(dataSemHora.toString());

        System.out.println(cincoAbril.toString());

        System.out.println(cincoAbrilEpoch);

        System.out.println(dataSemHora.getTime());

        System.out.println(dataSemHora.getTime() - cincoAbrilEpoch);

        System.out.println((dataSemHora.getTime() - cincoAbril.getTime() ) / umDiaEmMs);


        if (UtilsDate.isDataMaior(dataAtual, cincoAbril)){  // Verifica de uma data é maior que a outra.
            System.out.println("É maior");
        }
        else{
            System.out.println("É menor");
        }

        int comparacao = UtilsDate.compararDates(dataAtual, cincoAbril);  // DataUm menor que a DataDois = valor negativo
        System.out.println("Resultado: " + comparacao);                   // Datas iguais = 0
                                                                            // DataUm maior que a DataDois = valor positivo
        
        
        Date dataFutura = UtilsDate.adicionarDias(dataAtual, 10);  // Método para adicionar dias à uma data.
        System.out.println(dataFutura.toString());     
        
        Date dataPassada = UtilsDate.subtrairDias(dataAtual, 3); // Método para substrair dias de uma data.
        System.out.println(dataPassada.toString());
    }                                                                     
    

}
