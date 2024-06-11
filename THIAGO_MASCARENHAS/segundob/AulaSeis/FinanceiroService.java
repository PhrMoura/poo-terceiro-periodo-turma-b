package segundob.AulaSeis;

public class FinanceiroService implements IGerarRelatorio, 
    Igerar{

    @Override
    public void gerarPdf() {
         System.out.println("Gerando relatorio financeiro");
    }

    @Override
    public void gerarExel() {
       System.out.println("Gerar Excel financeiro");
    }
    
}
