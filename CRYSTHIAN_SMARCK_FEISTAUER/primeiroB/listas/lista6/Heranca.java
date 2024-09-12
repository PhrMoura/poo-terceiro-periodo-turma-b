public class Heranca {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    String complemento;
    String estado;
    int numero;

    public Heranca(String nome, int idade, String loja, String cidade, String bairro, String rua, String complemento, String estado, int numero) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.complemento = complemento;
        this.estado = estado;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void apresentarse(){
        String mensagem = String.format("Nome: %s idade: %d loja: %s", nome, idade, loja);
        System.out.println(mensagem);
    }

    public void apresentarLogradouro(){
        String mensagem = String.format("O endereço é: estado %s, cidade de %s, bairro %s, numero %d complemento: %s", estado, cidade, bairro, numero, complemento);
        System.out.println(mensagem);
    }
}
