package PROVA.JAVA;

public class cadastroclientes {

    private List<Cliente> clientes;

    public cadastroclientes() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}


    
}
