package segundob.aulas.aulaseis;

public class FinanceiroService implements IGerarRelatorio {

    @Override
    public void gerarPdf() {
    System.out.println("Gerando relatorio financeiro");
}

    @Override
    public void gerarExcel() {
        System.out.println("Gerando relatorio financeiro em excel");
    }
}
