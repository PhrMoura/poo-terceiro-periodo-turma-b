package segundob.aulas.aulaseis;

public class FinanceiroService implements IGerarRelatorioExcel, IGerarRelatorioPDF {

    @Override
    public void gerarPDF() {
        System.out.println("Gerando PDF");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando Excel");
    }

}
