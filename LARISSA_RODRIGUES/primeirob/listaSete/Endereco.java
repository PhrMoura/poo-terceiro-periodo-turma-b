package primeiroB.listaSete;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;

    public void apresentarLogradouro() {
        System.out.println("Endereço: Rua " + rua + ", " + numero + ", " + bairro + ", " + cidade + ", " +
        estado + ".\nComplemento: " + complemento);
    }

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }
}
