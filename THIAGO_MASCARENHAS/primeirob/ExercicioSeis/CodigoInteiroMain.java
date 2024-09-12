package ExercicioSeis;
class Endereco {
    // Atributos
    private String estado;
    private String cidade;
    private String bairro;
    private int numero;
    private String complemento;

    // Construtor
    public Endereco(String estado, String cidade, String bairro, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Método apresentarLogradouro
    public void apresentarLogradouro() {
        System.out.println("Endereço: " + numero + " " + complemento + ", " + bairro + ", " + cidade + ", " + estado);
    }
}
