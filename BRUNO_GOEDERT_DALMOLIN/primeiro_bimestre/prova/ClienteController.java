package BRUNO_GOEDERT_DALMOLIN.prova;

import java.util.ArrayList;
import java.util.List;

public class ClienteController implements IClienteController {
    public static List<Cliente> lClientes = new ArrayList<>();

    @Override
    public void cadastrar(String nome, String cpf) {
        var novoCliente = new Cliente(nome, cpf);

        var lastIdCliente = lClientes.stream().mapToInt(c -> c.getId()).max();

        if (lastIdCliente.isPresent()) {
            novoCliente.setId(lastIdCliente.getAsInt() + 1);
        } else {
            novoCliente.setId(1);
        }

        lClientes.add(novoCliente);

        System.out.println("\nCliente: " + novoCliente.getNome() + ". Cadastrado com Sucesso! ");
    }

    @Override
    public void listar() {
        System.out.println("\nListando clientes cadastrados: \n");

        for (Cliente cliente : lClientes) {
            System.out.println(
                    "Id: " + cliente.getId() + ". Nome: " + cliente.getNome() + ". CPF: " + cliente.getCpf() + ".");
        }
    }

    @Override
    public Cliente getById(int id) {
        var cliente = lClientes.stream().filter(c -> c.getId() == id).findFirst();

        if (cliente.isPresent()) {
            return cliente.get();
        } else {
            return new Cliente("", "null", 0);
        }
    }

}
