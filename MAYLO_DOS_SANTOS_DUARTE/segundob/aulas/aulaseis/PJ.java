package segundob.aulas.aulaseis;

public class PJ implements IGerarFolhaPagamento {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Double vlrFolhaPj = this.getSalario();

        System.out.println("Valor folha estágiario: " + vlrFolhaPj);
    }
    
}
