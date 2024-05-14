package MICHEL_LIBERALI_SANTOS.primeirob.prova;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Cliente> clientes;
    private ArrayList<Quarto> quartos;

    public Hotel() {
        this.clientes = new ArrayList<>();
        this.quartos = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String cpf, String dataNascimento, String telefone) {
        Cliente cliente = new Cliente(nome, cpf, dataNascimento, telefone);
        clientes.add(cliente);
    }

    public void cadastrarQuarto(int numero, String tipo) {
        Quarto quarto = new Quarto(numero, tipo);
        quartos.add(quarto);
    }

    public void listarQuartosDisponiveis() {
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                System.out.println("Quarto: " + quarto.getNumero() + ", Tipo: " + quarto.getTipo());
            }
        }
    }
}
