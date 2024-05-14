package AQUILES_DANIEL.primeirob.prova;

import java.util.ArrayList;

public class Cliente {
  private int idCliente;
  private String nome;
  private int idade;
  private int diasDeEstadia;
  private ArrayList<Cliente> listaDeClientes = new ArrayList<>();

  public Cliente(int idCliente, String nome, int idade, int diasDeEstadia) {
    this.idCliente = idCliente;
    this.nome = nome;
    this.idade = idade;
    this.diasDeEstadia = diasDeEstadia;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getDiasDeEstadia() {
    return diasDeEstadia;
  }

  public void setDiasDeEstadia(int diasDeEstadia) {
    this.diasDeEstadia = diasDeEstadia;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public ArrayList<Cliente> getListaDeClientes() {
    return listaDeClientes;
  }

  public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
    this.listaDeClientes = listaDeClientes;
  }

  public void mostrarListaDeClientes() {
    for (Cliente clientes : listaDeClientes) {
      System.out.println(clientes);
    }
  }

  @Override
  public String toString() {
    return "ID: " + idCliente + " Nome: " + nome + " Idade: " + idade + " Dias de estadia: " + diasDeEstadia;
  }

}
