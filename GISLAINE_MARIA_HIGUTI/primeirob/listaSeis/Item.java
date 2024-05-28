package primeirob.listaSeis;

public class Item {
    
    Integer id;

    String nome;

    String tipo;

    Double valor;

    public void gerarDescricao() {

        System.out.println("ID do item: " + id);
        System.out.println("Nome do item: " + nome);
        System.out.println("Tipo do item: " + tipo);
        System.out.println("Valor do item: " + valor);

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
