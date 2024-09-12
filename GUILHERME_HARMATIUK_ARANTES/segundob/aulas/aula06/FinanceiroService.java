package segundob.aulas.aula06;

public class FinanceiroService implements IGerarRelatorio {

    @Override
    public void gerarPdf() {
        System.err.println("Gerando relatório financeiro");
    }

    @Override
    public void gerarExcel() {
        System.err.println(" Gerando excel financeiro");
    }
    
}
