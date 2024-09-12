package primeirob.PrimeiroBimestre.Lista7;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, Endereco endereco) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    
        this.endereco = endereco;
    }
    public String getNomeFantasia(){
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public String getRazaoSocial(){
        return razaoSocial;
    }
    public String getCnpj(){
        return cnpj;
    }
    public Endereco getEndereco(){
        return endereco;
    }

    public void gerarDescricaoLoja(){
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        endereco.presentarLogradouro();
    }
}
