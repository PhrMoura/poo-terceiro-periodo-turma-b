package ISRAEL_ANGELO_REIS_PICOLI.prova;

import java.util.Date;


public class CheckinQuarto {
    

    public Reserva criarReserva(Cliente[] cliente, Quarto[] quarto){

        Reserva reserva = new Reserva(cliente, quarto);

        return reserva;
    }


    public void confirmarCheckin(Reserva reserva){
        Long msDia = 864000000l;

        reserva.setDataCheckin(new Date());

        Long fimReservaConta = msDia + (reserva.getDataCheckin().getTime() * 7);
        Date fimReserva = new Date(fimReservaConta);
        System.out.println("Checkin conclúido na data: " + reserva.getDataCheckin().toString());
        System.out.println("Sua reserva terminará na data: " + fimReserva.toString());
        
    }
}
