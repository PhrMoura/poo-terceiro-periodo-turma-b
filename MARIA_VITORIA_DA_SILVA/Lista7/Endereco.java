package Lista7;

public class Endereco {
    private String bairro;
    private String rua;
    private String cidade;
    private String estado;
    private int numero;
    private String complemento; 

    public Endereco(String bairro, String rua, String cidade, String estado, int numero, String complemento) {
        this.bairro = bairro;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
    }
    public void presentarLogradouro(){
        System.out.println("Rua: " + rua + ", " + numero + " - " + complemento + ", " + bairro + ", " + cidade + " - " + estado);
    }
}

