package poo.ListaSete;

public class Pessoa {
    String nome;
    Integer idade;
    Loja novaLoja;
    Endereco endereco;

    void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        endereco.apresentarLogradouro();
        novaLoja.apresentarSe();
        System.out.println("              \n");
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

    public Loja getLoja(Loja novaLoja) {
        return novaLoja;
    }

    public void setLoja(Loja novaLoja) {
        this.novaLoja = novaLoja;
    }

}
