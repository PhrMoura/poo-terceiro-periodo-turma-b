package ProvaJava;

public class Hotel {
    private CadastroQuartos[] quartos;
    private CadastrarCliente[] clientes;

    public Hotel() {
        this.quartos = new CadastroQuartos[5];
        this.clientes = new CadastrarCliente[10]; 

        
        for (int i = 0; i < 5; i++) {
            quartos[i] = new CadastroQuartos(i + 1, 100.0); // preço diário padrão de R$ 100,00
        }
    }

    public void cadastrarCliente(String nome, String cpf) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = new CadastrarCliente(nome, cpf);
                System.out.println("Cliente cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Não há vagas disponíveis para cadastro de clientes.");
    }

    public void cadastrarQuarto(int numero, double precoDiaria) {
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] == null) {
                quartos[i] = new CadastroQuartos(numero, precoDiaria);
                System.out.println("Quarto cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Nao há vagas disponíveis para cadastro de quartos.");
    }

    public void listarQuartos() {
        System.out.println("Lista de Quartos:");
        for (CadastroQuartos quarto : quartos) {
            System.out.println("Quarto " + quarto.getNumero() + " - Disponível: " + quarto.isDisponivel());
        }
    }

    public void reservarQuarto(int numeroQuarto, String cpfCliente) {
        for (CadastroQuartos quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto && quarto.isDisponivel()) {
                quarto.setDisponivel(false);
                System.out.println("Quarto reservado com sucesso!");
                return;
            }
        }
        System.out.println("Quarto nao disponível ou nao encontrado.");
    }
}
