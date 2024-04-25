package primeirob.setimaatividade;

public class Endereco {
    String uf, cidade, bairro, rua, complemento;
    int numero;

    public Endereco(String uf, String cidade, String bairro, String rua, String complemento, int numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.complemento = complemento;
        this.numero = numero;
    }
    
}
