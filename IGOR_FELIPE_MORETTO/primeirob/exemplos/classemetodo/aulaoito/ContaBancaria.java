package primeirob.exemplos.classemetodo.aulaoito;

public class ContaBancaria {
    private String numero;

    private Double saldo;

    private String documento;

    private String email;

    public ContaBancaria(String documento, String email) {
        this.numero = "24234";
        this.documento = documento;
        this.saldo = 0d;
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
