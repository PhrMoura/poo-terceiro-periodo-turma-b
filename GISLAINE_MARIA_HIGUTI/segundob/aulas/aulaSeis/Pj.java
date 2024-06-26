package segundob.aulas.aulaSeis;

public class Pj implements IGerarFolhaPagamento {
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Pj pj = new Pj();
        Double vlrFolhaPj = pj.getSalario();
        System.out.println("Valor Folha pj " + vlrFolhaPj);
    }

    
}

