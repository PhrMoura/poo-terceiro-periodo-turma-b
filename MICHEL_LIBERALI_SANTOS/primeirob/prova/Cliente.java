package MICHEL_LIBERALI_SANTOS.primeirob.prova;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;

    public Cliente(String nome, String cpf, String dataNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }
}