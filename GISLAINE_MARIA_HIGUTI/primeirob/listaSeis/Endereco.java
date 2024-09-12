package primeirob.listaSeis;

public class Endereco {
    
    String estado;

    String cidade;

    String bairro;

    String rua;

    Integer numero;

    String complemento;

    public void apresentarLogradouro() {

        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);

    }

    public Endereco(String estado, String cidade, String bairro, String rua, Integer numero, String complemento) {
        
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua= rua;
        this.numero = numero;
        this.complemento = complemento;

    }

}
