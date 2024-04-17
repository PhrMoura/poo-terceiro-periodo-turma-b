package primeirob.listaSeis;

public class Cliente extends Pessoa {
    
    Endereco endereco;

    public void apresentarse() {
        System.out.println("Nome cliente: " + nome);
        System.out.println("Idade do cliente: " + idade);
    }
}
