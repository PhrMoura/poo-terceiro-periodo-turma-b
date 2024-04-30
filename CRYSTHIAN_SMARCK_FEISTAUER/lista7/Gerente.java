package lista7;

public class Gerente {
    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    Double salarioBase;
    Double[] salarioRecebido = {1400.0, 1500.0, 1600.0};

    public void apresentarse(){
        String mensagem = "Nome: " + nome + " idade: " + idade + " loja: " + loja;
        System.out.println(mensagem);
    }

    public void calcularMedia(){
        double soma = 0;
        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        String mensagem = "A média é de: " + soma / salarioRecebido.length;
        System.out.println(mensagem);
    }

    public void calcularBonus(){
        String mensagem = "O bônus é de: " + salarioBase * 0.035;
        System.out.println(mensagem);
    }

    public Gerente(String nome, int idade, String loja, String cidade, String bairro, String rua, Double salarioBase, Double[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }
}
