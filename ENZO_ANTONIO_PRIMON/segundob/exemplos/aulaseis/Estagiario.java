package segundob.exemplos.aulaseis;

public class Estagiario implements IGerarFolhaPgto {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Double vlrFolhaEst = getSalario() + (getSalario() * 0.01) - 100d;

        System.out.println("Valor folha estágiario: " + vlrFolhaEst);
    }

}
