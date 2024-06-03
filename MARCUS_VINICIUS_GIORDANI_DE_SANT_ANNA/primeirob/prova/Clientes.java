package primeirob.prova;

public class Clientes{

    private String nome;
    private String email;
    private String contato;
    private Clientes[] Clientes;

    public Clientes(String nome, String email, String contato) {
        this.nome = nome;
        this.email = email;
        this.contato = contato;
    }

    public void cadastrarClientes(Clientes Clientes){
        this.Clientes[Clientes.getNumero() - 1] = Clientes;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getContato(){
        return contato;
    }

    public void setContato(String contato){
        this.contato = contato;
    }

    public int getNumero() {
        throw new UnsupportedOperationException("Unimplemented method 'getNumero'");
    }

}
