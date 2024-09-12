public class Gerente extends Heranca {
    double salarioBase;
    double[] salarioRecebido = {1400.0, 1500.0, 1600.0};

    public Gerente(String nome, int idade, String loja, String cidade, String bairro, String rua, String complemento, String estado, int numero) {
        super(nome, idade, loja, cidade, bairro, rua, complemento, estado, numero);
    }

    @Override
    public void apresentarse() {
        super.apresentarse();
    }

    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < salarioRecebido.length; i++) {
            soma += salarioRecebido[i];
        }
        return soma / salarioRecebido.length;
    }
    public double calcularBonus(){
        return salarioBase * 0.035;
    }
}
