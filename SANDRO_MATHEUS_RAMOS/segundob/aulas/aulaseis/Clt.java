package segundob.aulas.aulaseis;

public class Clt implements IGerarFolhaPgto {
    
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Double vlrFolhaClt = getSalario() / 2;

        System.out.println("Valor folha clt: " + vlrFolhaClt);
    }

}
