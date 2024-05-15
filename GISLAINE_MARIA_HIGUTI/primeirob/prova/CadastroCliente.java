package GISLAINE_MARIA_HIGUTI.primeirob.prova;

public class CadastroCliente {
    private String nome;
    private Integer idade;

    public CadastroCliente(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public void cadastrarCliente(){
        CadastroCliente cliente = new CadastroCliente(nome, idade);
            cliente.setNome(nome);
            cliente.setIdade(idade);
    }         
    
    public void apresentarse() {
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("-------------------------");
    
}
}