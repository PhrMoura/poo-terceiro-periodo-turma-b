package primeirob.exemplos.ListaSeis;

public class Endereco  {
    String estado;
    String cidade;
    String bairro;
    int numero;
    String rua;
    String complemento;

    public void apresentarLogradouro() {
        String enderecoCompleto = "Endereço: " + bairro + ", Nº " + numero + ", " + cidade + ", " + estado + ", "
                + complemento;

        System.out.println(enderecoCompleto);
    }
}
