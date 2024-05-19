package p_prova.models;

import java.util.List;
import java.util.Scanner;

public class Cliente {
    public Long id;
    public String nome;
    public Quarto quartoReservado;
    public Boolean checkin;


    public void fazerCheckin () {
        this.checkin = true;
    }

    public void easyCadastro () {
        this.id = (long)Math.floor(Math.random() *(100 - 1 + 1) + 1);;
        this.checkin = false;
        Scanner newClienteInfo = new Scanner(System.in);

        System.out.println("Qual é o nome do cliente?");
        this.nome = newClienteInfo.nextLine();
    }

    public void listarSelf () {
        System.out.println("Id do cliente: " + this.id);
        System.out.println("Nome do cliente: " + this.nome);

        String possuiReservaFormatada;
        if (this.quartoReservado == null) { possuiReservaFormatada = "Não";}
        else { possuiReservaFormatada = "Sim"; }
        System.out.println("Possui quarto?: " + possuiReservaFormatada);
    } 
}
