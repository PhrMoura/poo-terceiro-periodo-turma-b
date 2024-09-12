package ISRAEL_ANGELO_REIS_PICOLI.prova;

public class Cliente extends Pessoa {

    private String nome;

    private Integer idade;

    private Endereco endereco;

    public Cliente(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarse() {
        System.out.println("Cliente: " + getNome() + " | Idade: " + getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
