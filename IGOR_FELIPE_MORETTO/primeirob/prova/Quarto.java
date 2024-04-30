package IGOR_FELIPE_MORETTO.primeirob.prova;

import java.util.Date;
import java.util.Scanner;

public class Quarto {
    private Integer numQuarto[] = new Integer[19];
    int i = 0;
    Scanner demo = new Scanner(System.in);
    Date dataCheckIn = new Date();
    Long diaEmMs = 86400000l;

    public Quarto (Integer numQuarto){
        this.numQuarto[i] = numQuarto;
    }

    public Integer getNumQuarto() {
        return numQuarto[i];
    }

    public void listarQuarto(){
            System.out.println("Quartos disponíveis: ");
            System.out.println(numQuarto[i]);
    }

    public void reserva() {
       
        System.out.println("Qual quarto deseja reservar?");
        i = demo.nextInt();
        
        if (i < numQuarto.length) {
                    numQuarto[i] = i;
                    System.out.println("Reserva realizada com sucesso!!");
                    System.out.println("Check-in realizado em " + dataCheckIn);
                    i++;
                }
        else{
                    System.out.println("Quarto ocupado");
                }
            
           
        }
        
    }
