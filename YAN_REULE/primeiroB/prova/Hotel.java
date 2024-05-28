package prova;

import java.util.ArrayList;

public class Hotel {
    private String nome;
    private ArrayList<Quarto> Quartos;
    private ArrayList<Cliente> Clientes;

    public Hotel(String nome, ArrayList<Quarto> Quartos, ArrayList<Cliente> Clientes) {
        this.nome = "Pedro Hoteis";
        this.Quartos = new ArrayList<>();
        this.Clientes = new ArrayList<>();
    }

    public void listaQuartos() {
        System.out.println("Listando...");
        for (Quarto item : Quartos) {
            if (item.getIsOcupado() == false) {
                System.out.println("Quarto Num: " + item.getNumQuarto() + " está desocupado :)");
            } else {
                System.out.println("Quarto Num: " + item.getNumQuarto() + " está Reservado :(");
                System.out.println("Ocupado por");
                item.getCliente().infosCliente();
            };
        }
    }

    public void listaClientes() {
        System.out.println("Listando CLientes cadastrados...");
        for (Cliente item : Clientes) {
            System.out.println("id: " + item.getIdCliente() + " Cliente: " + item.getNome() + " CPF: " + item.getCpf());
            ;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Quarto> getQuartos() {
        return Quartos;
    }

    public void setQuartos(Quarto quarto) {
        Quartos.add(quarto);
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(Cliente cliente) {
        Clientes.add(cliente);
    }

}
