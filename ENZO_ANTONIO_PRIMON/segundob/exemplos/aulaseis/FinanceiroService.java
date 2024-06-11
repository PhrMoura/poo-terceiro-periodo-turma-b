package segundob.exemplos.aulaseis;

public class FinanceiroService implements IGerarRelatorioExcel,
        IGerarRelatorioPDF {

    @Override
    public void gerarPdf() {
        System.out.println("Gerando relatorio financeiro");
    }
    
    @Override
    public void gerarExcel() {
        System.out.println("Gerando Excel financeiro");
    }
    
}
