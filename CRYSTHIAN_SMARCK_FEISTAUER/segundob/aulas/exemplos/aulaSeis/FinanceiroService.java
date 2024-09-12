package aulaSeis;

public class FinanceiroService implements IGerarRelatorioPdf, IGerarRelatorioExcel {

    @Override
    public void gerarPdf() {
        System.out.println("Gerando relatorio financeiro");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando excel financeiro");
    }
    
}
