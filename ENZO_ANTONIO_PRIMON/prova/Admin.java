package prova;

import java.util.ArrayList;

public class Admin {

    private ArrayList<Quarto> listaQuartos;
    private ArrayList<Cliente> listaClientes;
    private Cliente cliente;
    private Quarto quarto;
  
    public Admin(Cliente cliente, Quarto quarto) {
        this.listaQuartos =listaQuartos;
        this.listaClientes = listaClientes;
        this.cliente = cliente;
        this.quarto = quarto;
    }

    

    public void cadastrarClientes(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public void listarHospedes() {
        for (Cliente hospede : listaClientes) {
            System.out.println(hospede.toString());
        }
    }

    public void cadastrarQuarto(Quarto quarto) {
        this.listaQuartos.add(quarto);
    }

    public void listarQuartos() {
        for (Quarto quarto : listaQuartos) {
            System.out.println(quarto);
        }
    }
    
    
}
