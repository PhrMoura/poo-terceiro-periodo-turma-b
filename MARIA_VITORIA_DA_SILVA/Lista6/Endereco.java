package Lista6;

public class Endereco {
    String bairro;
    String rua;
    String cidade;
    String estado;
    int numero;
    String complemento; 

    public Endereco(String bairro, String rua, String cidade, String estado, int numero, String complemento) {
        this.bairro = bairro;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
    }
    public void presentarLogradouro() {
        System.out.println("===========================");
        System.out.println("Endereço: " + rua + ", " + numero + ", " + complemento + ", " + bairro + ", " + cidade + ", " + estado);
        System.out.println("===========================");
    }
}

