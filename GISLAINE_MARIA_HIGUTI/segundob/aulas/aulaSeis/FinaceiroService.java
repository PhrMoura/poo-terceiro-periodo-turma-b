package segundob.aulas.aulaSeis;

public class FinaceiroService implements IGerarRelatorioExcel, IGerarRelatorioPDF {

    @Override
    public void gerarPDF() {
        System.out.println("Gerando relatório Finaceiro");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando excel Financeiro");
    }
    
}
