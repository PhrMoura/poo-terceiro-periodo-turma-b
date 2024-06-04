package p_prova.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import p_prova.models.Cliente;
import p_prova.models.Quarto;

public class ClientesService {
    List<Cliente> clientes;

    public void addCliente(Cliente novoCliente) {
        if (this.clientes == null) {this.clientes = new ArrayList<Cliente>();} 
        this.clientes.add(novoCliente);

        System.out.println("Todos os clientes:");
        this.clientes.forEach(cliente -> {
            System.out.println("Teste");
        });
    }

    public List<Cliente> getAllClientes() {
        if (this.clientes == null) {this.clientes = new ArrayList<Cliente>();} 
        return this.clientes;
    }
    public Integer qtdClientes() {
        return getAllClientes().size();
    }
    public List<Cliente> getClientesSemReservas() {
        return getAllClientes().stream().filter(cliente -> {
            return cliente.quartoReservado == null;
        }).toList();
    }
    public Integer qtdClientesSemReservas() {
        return getAllClientes().stream().filter(cliente -> {
            return cliente.quartoReservado == null;
        }).toList().size(); 
    }

    public void listarClientes() {
        getAllClientes().forEach(cliente -> {
            cliente.listarSelf();
        });
    }
    
    public void listarClientesSemReservas() {
        getClientesSemReservas().forEach(cliente -> {
            cliente.listarSelf();
        });
    }


    public void selecionarQuartoECliente(QuartosService quartosService) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um Quarto em qual fazer a reserva");
        System.out.println("(Digite o ID dele)");
        quartosService.listarQuartosNaoReservados();

        Long idQuarto = input.nextLong();

        System.out.println("Escolha o Cliente qual deseja fazer a reserva");
        System.out.println("(Digite o ID dele)");
        listarClientesSemReservas();

        Long idCliente = input.nextLong();

        quartosService.quartos.forEach(quarto -> {
            if (quarto.id == idQuarto) {
                quarto.reservado = true;
            }
        });

        adicionarQuarto(idCliente, idQuarto, quartosService.getAllQuartos());
    }

    public void adicionarQuarto(Long idCliente, Long idQuarto, List<Quarto> listaQuartos) {
        Quarto quartoSelecionado = listaQuartos.stream().filter(quarto -> { 
            return quarto.id == idQuarto;
        }).findFirst().orElse(null);

        this.clientes.forEach(cliente -> {
            if (cliente.id == idCliente) {
                cliente.quartoReservado = quartoSelecionado;
            }
        });

        // clienteSelecionado.quartoReservado = quartoSelecionado;

        // oRestoDosClientes.add(clienteSelecionado);

        // this.clientes = oRestoDosClientes;
    
    }


    public void fazerCheckin(QuartosService quartoService) {
        List<Cliente> lista = getAllClientes().stream().filter(cliente -> {
            return cliente.quartoReservado != null && cliente.checkin == false;
        }).toList();

        System.out.println("Clientes que faltam fazer check-in");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o id do cliente que deseja fazer checkin");
        Long id = input.nextLong();

        this.clientes.forEach(cliente -> {
            if (cliente.id == id) {
                cliente.fazerCheckin();
            }
        });

        System.out.println("Checkin do cliente foi realizado");

    }
}
