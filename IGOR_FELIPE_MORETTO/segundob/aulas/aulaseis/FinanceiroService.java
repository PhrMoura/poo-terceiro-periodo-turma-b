package segundob.aulas.aulaseis;

public class FinanceiroService implements IGerarRelatorio {

    @Override
    public void gerarPDF() {
        System.out.println("Gerando relatório financeiro");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando excel financeiro");
    }
    


}
