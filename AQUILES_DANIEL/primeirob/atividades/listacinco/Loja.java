package primeirob.atividades.listacinco;

import java.util.ArrayList;

public class Loja {
  String nomeFantasia, razaoSocial, cidade, bairro, rua, cnpj;
  ArrayList<Vendedor> arrayVendedores = new ArrayList<>();
  ArrayList<Cliente> arrayClientes = new ArrayList<>();

  public void contarClientes() {
    System.out.println("Quantidade de Clientes: " + arrayClientes.size());
  }

  public void contadorVendedores() {
    System.out.println("Quantidade de Vendedores: " + arrayVendedores.size());
  }

  public void apresentarse() {
    System.out.println("Nome fantasia: " + nomeFantasia);
    System.out.println("Cnpj: " + cnpj);
    System.out.println("Endereço: " + cidade + ", " + bairro + ", " + rua);
  }
}
