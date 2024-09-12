package poo.ListaSeis;

public class Endereco {
    String estado;
    String cidade;
    String bairro;
    String numero;
    String complemento;

    public void apresentarLogradouro() {
        System.out.println("Endereço: " + this.numero + ", " + this.complemento + ", " + this.bairro + ", " + this.cidade + " - " + this.estado);
    }
}

