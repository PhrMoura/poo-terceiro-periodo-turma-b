package segundob.aulas.aulaSeis;

public class Clt implements IGerarFolhaPagamento{
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Clt clt = new Clt();
        Double vlrFolhaClt = clt.getSalario();
        System.out.println("Valor Folha clt " + vlrFolhaClt);
    }

    
}
