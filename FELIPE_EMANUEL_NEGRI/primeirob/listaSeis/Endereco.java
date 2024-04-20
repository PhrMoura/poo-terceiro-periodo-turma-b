package primeirob.listaSeis;

public class Endereco {
    
    String estado;
    String cidade;
    String bairro;
    int numero;
    String complemento;

    public Endereco(String estado, String cidade, String bairro, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    public void apresentarLogradouro() {
        System.out.println("Estado:" + estado);
        System.out.println("Cidade:" + cidade);
        System.out.println("Bairro:" + bairro);
        System.out.println("Numero" + numero);
        System.out.println("Complemento: " + complemento);
    }

}
