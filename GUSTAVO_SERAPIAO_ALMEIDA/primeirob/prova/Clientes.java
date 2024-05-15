package GUSTAVO_SERAPIAO_ALMEIDA.primeirob.prova;

public class Clientes {

    protected String nome;
    private String cpf; //xx.xxx.xxx-xx
    private Short idade;

    public Clientes(String nome, String cpf, Short idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Short getIdade() {
        return idade;
    }
    public void setIdade(Short idade) {
        this.idade = idade;
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

    public void apresentarCliente() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
    }
    
}
