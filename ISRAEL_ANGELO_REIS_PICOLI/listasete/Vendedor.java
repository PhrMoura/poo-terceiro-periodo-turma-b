package listasete;

public class Vendedor extends Funcionario {

    private Endereco endereco;

    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public void apresentarse() {
        System.out.println("Vendedor: " + getNome() + " | Idade: " + getIdade() + " | Loja: " + getLoja());
    }

}
