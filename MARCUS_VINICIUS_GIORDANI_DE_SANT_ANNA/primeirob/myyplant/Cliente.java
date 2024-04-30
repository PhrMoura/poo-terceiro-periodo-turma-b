package primeirob.myyplant;

public class Cliente {

    private String nome;
    private Integer idade;
    private String cidade;
    private String bairro;
    private String rua;

    // Construtor
    public Cliente(String nome, Integer idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para idade
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    // Getter e Setter para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getter e Setter para bairro
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // Getter e Setter para rua
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void apresentarse() {
        String msg = "Cliente: "
                .concat(nome)
                .concat("\n Idade:  ")
                .concat(Integer.toString(idade));
        System.out.println(msg);
    }
}
