package primeirob.exemplos.listaseis;

public class Gerente extends Pessoa {
    
    private Loja loja;

    private Double salarioBase;

    public void calcularBonus() {
        System.out.println(salarioBase * 0.02);
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
