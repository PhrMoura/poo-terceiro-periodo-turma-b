package primeirob.lista06.models;

public class Endereco {
    public String cidade;
    public String bairro;
    public String rua;


    public void setEndereco (String cidade, String bairro, String rua) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }
    public void printarEndereco () {
        System.out.println(cidade + ", Bairro " + this.bairro + " - Rua " + this.rua);
    }
}
