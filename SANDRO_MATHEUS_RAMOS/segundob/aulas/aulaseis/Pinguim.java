package segundob.aulas.aulaseis;

public class Pinguim extends Ave {
    
    @Override
    public void voar() {
        throw new RuntimeException("NÃO SEI VOAR!");
    }

}
