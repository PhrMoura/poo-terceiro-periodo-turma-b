public class Endereco {
    public String estado;
    public String cidade;
    public String bairro;
    public String rua;
    public int numero;
    public String complemento;

    public Endereco(String estado, String cidade, String bairro, String rua, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade + ", " + estado + ", " + numero + ", " + complemento);
    }
}
