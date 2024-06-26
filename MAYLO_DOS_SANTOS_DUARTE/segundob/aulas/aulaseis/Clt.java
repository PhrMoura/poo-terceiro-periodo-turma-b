package segundob.aulas.aulaseis;

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
        Double vlrFolhaClt = this.getSalario();

        System.out.println("Valor folha estágiario: " + vlrFolhaClt);
    }


    
}
