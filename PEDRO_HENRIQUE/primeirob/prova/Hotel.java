package PEDRO_HENRIQUE.primeirob.prova;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Cliente> clientes;
    private ArrayList<Quarto> quartos;

    public Hotel() {
        clientes = new ArrayList<>();
        quartos = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, int idade) {
        Cliente cliente = new Cliente(nome, idade);
        clientes.add(cliente);
    }

    public void cadastrarQuarto(int numero) {
        Quarto quarto = new Quarto(numero);
        quartos.add(quarto);
    }

    public void listarQuartosDisponiveis() {
        System.out.println("Quartos disponíveis:");
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                System.out.println("Quarto número: " + quarto.getNumero());
            }
        }
    }

    public void reservarQuarto(int numeroQuarto, String nomeCliente) {
        Quarto quarto = buscarQuarto(numeroQuarto);
        if (quarto != null && quarto.isDisponivel()) {
            quarto.reservar();
            System.out.println("Quarto " + numeroQuarto + " reservado para " + nomeCliente);
        } else {
            System.out.println("Quarto não encontrado ou não disponível.");
        }
    }

    public void realizarCheckIn(String nomeCliente) {
        Cliente cliente = buscarCliente(nomeCliente);
        if (cliente != null) {
            System.out.println("Check-in realizado para o cliente " + nomeCliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private Quarto buscarQuarto(int numero) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numero) {
                return quarto;
            }
        }
        return null;
    }

    private Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }
}
