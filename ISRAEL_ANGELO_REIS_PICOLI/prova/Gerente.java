package ISRAEL_ANGELO_REIS_PICOLI.prova;

public class Gerente extends Pessoa {

    private String nome;

    private Integer idade;

    private Endereco endereco;

    public Gerente(String nome, Integer idade) {

    }

    public void apresentarse() {
        System.out.println("Gerente: " + getNome() + " | Idade: " + getIdade());
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
