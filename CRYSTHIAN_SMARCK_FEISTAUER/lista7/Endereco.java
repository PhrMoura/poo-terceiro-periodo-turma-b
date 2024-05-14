package lista7;

public class Endereco extends Gerente{
    String estado;
    String complemento;
    int numero;

    public Endereco(String nome, int idade, String loja, String cidade, String bairro, String rua, Double salarioBase, Double[] salarioRecebido, String estado, int numero, String complemento) {
        super(nome, idade, loja, cidade, bairro, rua, salarioBase, salarioRecebido);
        this.estado = estado;
        this.complemento = complemento;
        this.numero = numero;
    }

    public void apresentarLogradouro(){
        String mensagem = "Nome: " + super.nome + ", estado: " + estado + ", número: " + numero + " e complemento: " + complemento;
        System.out.println(mensagem);
    }
}
