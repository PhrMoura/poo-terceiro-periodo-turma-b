package listaCinco_listaSeis;

public class Item {
    // id, nome, tipo, valor
    // geralDesc = print id do item, nome, tipo e valor.

    private Integer id;

    private String nome;

    private String tipo;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    private Double valor;

    void geralDescricao(){
        System.out.println("Descrição geral");
        System.out.println("id: " + id);
        System.out.println("nome: " + nome);
        System.out.println("tipo: " + tipo);
        System.out.println("valor: " + valor);
    }
}


