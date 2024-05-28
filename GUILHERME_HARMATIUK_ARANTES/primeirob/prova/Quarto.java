package primeirob.prova;

import java.util.Scanner;

public class Quarto {
    public Long id;
    public Integer piso;
    public Integer numQuarto;
    public Boolean reservado;
    public Long precoQuarto;
    public Boolean checkedIn;

    public void fazerCheckin() {
        this.checkedIn = true;
    }

    public void easyCadastro() {
        this.id = (long)Math.floor(Math.random() *(100 - 1 + 1) + 1);
        this.reservado = false; 

        Scanner newQuartoInfo = new Scanner(System.in);

        System.out.println("Em qual piso está o quarto?");
        this.piso = newQuartoInfo.nextInt();

        System.out.println("Qual é o número do quarto?");
        this.numQuarto = newQuartoInfo.nextInt();

        System.out.println("Qual é o preço do quarto?");
        this.precoQuarto = newQuartoInfo.nextLong();
    }

    public void toggleReservado() {
        this.reservado = !this.reservado;
        if (this.reservado) {
            System.out.println("Quarto foi reservado.");
        } else {
            System.out.println("Reserva do Quarto foi cancelada.");
        }
    }
    public void listarSelf() {
        System.out.println("Id: " + this.id);
        String reservadoAsString;
        if (this.reservado) {reservadoAsString = "Sim";} else {reservadoAsString = "Não";}
        System.out.println("Reservado: " + reservadoAsString);

        System.out.println("Piso " + this.piso + ", Número " + this.numQuarto);

        System.out.println("\n");
    }
}
