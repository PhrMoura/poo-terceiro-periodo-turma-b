package segundob.Aulas.aulaquatro;

public class FinanceiroService implements IGerarRelatorio {

    @Override
    public void gerarPdf() {
        System.out.println("Gerando relatorio financeiro em PDF");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando relatorio financeiro em EXCEL");
    }
    
    

}
