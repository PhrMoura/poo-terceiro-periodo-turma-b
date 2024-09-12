package listaCinco_listaSeis;

public class Pessoa{
    
    protected String nome;

    private Integer idade;

    private Endereco endereco;

    public Pessoa(Integer idade, String nome, String rua, String bairro, String cidade, String estado, String numero, String complemento){
        this.endereco = new Endereco(rua, cidade, bairro, numero, complemento);
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome2, int idade2) {
        //TODO Auto-generated constructor stub
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
