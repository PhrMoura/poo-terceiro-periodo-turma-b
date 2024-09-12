public class Endereco extends Heranca {
    String estado;
    String cidade;
    String bairro;
    int numero;
    String complemento;

    public Endereco(String nome, int idade, String loja, String cidade, String bairro, String rua, String complemento, String estado, int numero) {
        super(nome, idade, loja, cidade, bairro, rua, complemento, estado, numero);
    }

    @Override
    public void apresentarLogradouro() {
        super.apresentarLogradouro();
    }
}
