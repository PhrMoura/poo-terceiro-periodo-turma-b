package listaseis;

public class Gerente extends Funcionario {

    private Endereco endereco;

    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public void apresentarse() {
        System.out.println("Gerente: " + getNome() + " | Idade: " + getIdade() + " | Loja: " + getLoja());
    }

    @Override
    public double calcularBonus() {
        double bonus = 0;
        bonus = getSalarioBase() * 0.35;

        return bonus;
    }

}
