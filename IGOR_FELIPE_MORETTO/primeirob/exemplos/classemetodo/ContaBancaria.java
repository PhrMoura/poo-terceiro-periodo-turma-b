package primeirob.exemplos.classemetodo;

public class ContaBancaria {
    private String numero;
    private String documento;
    private String email;
    private Double saldo;

    public ContaBancaria (String documento, String email){
        this.numero = "123456";
        this.documento = documento;
        this.email = email;
        this.saldo = 0d;
    }

    public String getNumero() {
        return numero;
    }


    public String getDocumento() {
        return documento;
    }


    public Double getSaldo() {
        return saldo;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
