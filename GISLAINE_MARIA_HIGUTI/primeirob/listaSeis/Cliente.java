package primeirob.listaSeis;

public class Cliente {
    
    String nome;

    Integer idade;

    Endereco endereco;

    public Cliente(String nome, Integer idade, Endereco endereco) {
        
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

    }

        public void apresentarse() {
            System.out.println("Nome do Cliente: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Endereço");
            endereco.apresentarLogradouro();
            System.out.println("-------------------------");
    }
}
