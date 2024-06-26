package segundob.exemplos.aulaseis;

public class Pj implements IGerarFolhaPgto {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Double vlrFolhaPj = getSalario();

        System.out.println("Valor folha pj: " + vlrFolhaPj);
    }

}
