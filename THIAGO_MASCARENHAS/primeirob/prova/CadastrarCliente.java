package THIAGO_MASCARENHAS.primeirob.prova;

public class CadastrarCliente {
    private String nome;
    private String cpf;

    public CadastrarCliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
