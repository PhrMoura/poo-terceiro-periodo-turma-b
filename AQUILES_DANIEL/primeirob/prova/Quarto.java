package AQUILES_DANIEL.primeirob.prova;

import java.util.ArrayList;
import java.util.Date;

public class Quarto {
  private int idQuarto;
  private int numero;
  private int andar;
  private Date dataCheckIn = new Date();
  private ArrayList<Quarto> listaDeQuartos = new ArrayList<>();
  private int idQuartoReservado;

  public Quarto(int idQuarto, int numero, int andar) {
    this.idQuarto = idQuarto;
    this.numero = numero;
    this.andar = andar;
  }

  public Quarto() {

  }

  public int getIdQuarto() {
    return idQuarto;
  }

  public void setIdQuarto(int idQuarto) {
    this.idQuarto = idQuarto;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getAndar() {
    return andar;
  }

  public void setAndar(int andar) {
    this.andar = andar;
  }

  public ArrayList<Quarto> getListaDeQuartos() {
    return listaDeQuartos;
  }

  public void setListaDeQuartos(ArrayList<Quarto> listaDeQuartos) {
    this.listaDeQuartos = listaDeQuartos;
  }

  public Date getDataCheckIn() {
    return dataCheckIn;
  }

  public void setDataCheckIn(Date dataCheckIn) {
    this.dataCheckIn = dataCheckIn;
  }

  public int getIdQuartoReservado() {
    return idQuartoReservado;
  }

  public void setIdQuartoReservado(int idQuartoReservado) {
    this.idQuartoReservado = idQuartoReservado;
  }

  public void mostrarListaDeQuartos() {
    for (Quarto quarto : listaDeQuartos) {
      System.out.println(quarto);
    }
  }

  @Override
  public String toString() {
    return "ID: " + idQuarto + " Numero do quarto: " + numero + " Andar: " + andar;
  }
}