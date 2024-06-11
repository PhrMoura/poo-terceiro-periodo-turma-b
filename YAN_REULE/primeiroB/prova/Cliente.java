package prova;

public class Cliente {
    private Integer idCliente;
    private String nome;
    private String cpf;
    private Quarto quartoCliente = new Quarto(null, false, null);

    public Cliente(String nome, String cpf, Quarto quartoCliente, Integer idCliente) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.quartoCliente = quartoCliente;
    }

    public void clienteCriado() {
        System.out.println("\nCliente => Nº "+idCliente);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("criado com sucesso! \n ");
    }

    public void infosCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Quarto: "+quartoCliente.getNumQuarto());
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Quarto getQuartoCliente() {
        return quartoCliente;
    }

    public void setQuartoCliente(Quarto quartoCliente) {
        this.quartoCliente = quartoCliente;
    }

}
