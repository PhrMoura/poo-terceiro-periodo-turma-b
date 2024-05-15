package primeirob.aulaoito;

public class ContaBancaria {
    
    private String numero;

    private Double saldo;

    private String email;

    public ContaBancaria(String email) {
        this.numero = "2342323";
        this.saldo = 0d;
        this.email = email;
    }

    public String getNumero() {
        return numero;
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
