package GUSTAVO_MAXUEL_DE_MOURA.primeirob.prova;

public class CadastroCliente {
    private String nome;
    private int documento;

    
   

    public CadastroCliente(String nome, int documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

}