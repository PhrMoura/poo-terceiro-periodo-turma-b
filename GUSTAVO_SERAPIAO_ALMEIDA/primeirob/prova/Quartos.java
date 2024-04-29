package GUSTAVO_SERAPIAO_ALMEIDA.primeirob.prova;

import java.util.Scanner;

public class Quartos extends Clientes{

    static Scanner scanner = new Scanner(System.in);

    Boolean reservado;

    Integer numQuarto;

    public Quartos(Boolean reservado, Integer numQuarto, String nome, String cpf, Short idade) {
        super(nome, cpf, idade);
        //TODO Auto-generated constructor stub
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void setReservado(Boolean reservado) {
        this.reservado = reservado;
    }

}
