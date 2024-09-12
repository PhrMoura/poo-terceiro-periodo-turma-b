package segundoB.aulas.aulaSeis;

public class FinanceiroService implements IGerarRelatorioPdf, IGerarRelatorioExel{

    @Override
    public void gerarPdf() {
        System.out.println("Gerando relatório financeiro...");
    }

    @Override
    public void gerarExel() {
        System.out.println("Gerando exel financeiro...");
    }
    
}
