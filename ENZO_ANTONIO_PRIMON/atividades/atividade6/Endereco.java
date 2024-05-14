package atividades.atividade6;

public class Endereco {
    
    private String cidade;

    private String bairro;
    
    private String rua;

    public Endereco(String cidade, String bairro, String rua) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
      }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public void apresentarLogradouro() {
        System.out.println("Cidade " + cidade + " Bairro " + bairro + " Rua " + rua);
    }
}