package segundob.aulas.aulaseis;

public class Estagiario implements IGerarFolhaPagamento {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Double vlrFolhaEst = (this.getSalario() + (this.getSalario() * 0.01d) - 100);

        System.out.println("Valor folha estágiario: " + vlrFolhaEst);
    }
    
}
