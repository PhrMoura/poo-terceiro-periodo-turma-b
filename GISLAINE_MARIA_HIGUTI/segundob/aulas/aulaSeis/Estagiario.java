package segundob.aulas.aulaSeis;

public class Estagiario implements IGerarFolhaPagamento{
    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void gerarFolhaPagamento() {
        Estagiario estagiario = new Estagiario();
        Double vlrFolhaEst = estagiario.getSalario() + (estagiario.getSalario() * 0.90) - 100;
        System.out.println("Valor Folha Estagiario " + vlrFolhaEst);
    }

    
}
