package MAYLO_DOS_SANTOS_DUARTE.primeirob.prova;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Quarto> listaQuartos = new ArrayList<>(30);
    private List<Cliente> listaClientes = new ArrayList<>(30);
    private List<Reserva> listaReservas = new ArrayList<>(30);

    public void exibirListaQuartos () {
        for (Quarto quarto : listaQuartos) {
            String status; 
            if (quarto.getStatus() == true) {
                status = "Reservado";
            } else { status = "Disponivel"; }

            System.out.printf("Numero do quarto: %3d | Tipo do Quarto: %7s | Valor do Quarto: %.2f | Status: %7s\n", 
                quarto.getNumeroQuarto(), quarto.getTipoQuarto(), quarto.getValorQuarto(), status);
        }
    }

    public void exibirListaClientes () {
        for (Cliente cliente : listaClientes) {
            System.out.printf(" Nome: %20s | Idade: %3d\n", 
                cliente.getNome(), cliente.getIdade());
        }
    }

    public List<Quarto> getListaQuartos() {
        return listaQuartos;
    }
    public void setListaQuartos(List<Quarto> listaQuartos) {
        this.listaQuartos = listaQuartos;
    }
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    
    
}
