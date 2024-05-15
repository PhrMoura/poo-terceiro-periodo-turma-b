package MATHEUS_FONSECA.prova;

import java.util.ArrayList;
import java.util.List;

public class ListaQuartosHotel {
    public static void main(String[] args) {
        
        List<QuartoHotel> listaQuartos = new ArrayList<>();

        
        listaQuartos.add(new QuartoHotel(101, "Single", 100.00));
        listaQuartos.add(new QuartoHotel(201, "Duplo", 150.00));
        listaQuartos.add(new QuartoHotel(301, "Suíte", 250.00));

       
        System.out.println("Lista de Quartos de Hotel:");

        for (QuartoHotel quarto : listaQuartos) {
            quarto.exibirInformacoes();
            System.out.println();
        }

    }


}
