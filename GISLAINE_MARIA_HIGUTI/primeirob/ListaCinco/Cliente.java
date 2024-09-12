package primeirob.ListaCinco;

public class Cliente {
    
    String nome;

    Integer idade;

    String cidade;

    String bairro;

    String rua;

    public Cliente(String nome, Integer idade){

        this.nome = nome;
        this.idade = idade;

    }

        public void apresentarse() {
    
            String msg = "Cliente "
                    .concat(nome)
                    .concat(", de " + idade)
                    .concat(" anos de idade");
    
            System.out.println(msg);
    }
}