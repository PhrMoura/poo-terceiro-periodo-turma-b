package primeirob.myyplant;

public class Endereco {

    private String estado;
    private String cidade;
    private Integer numero;
    private String complemento;

    // Construtor
    public Endereco(String estado, String cidade, String bairro, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Getter e Setter para estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Getter e Setter para cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Getter e Setter para numero
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    // Getter e Setter para complemento
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        String msg = "Endereço "
                .concat("Cidade: " + cidade)
                .concat("\n Estado: " + estado)
                .concat("\n Nº ")
                .concat(Integer.toString(numero))
                .concat("\n Complemento: " + complemento);

        // Exibir a mensagem
        System.out.println(msg);
    }
}
