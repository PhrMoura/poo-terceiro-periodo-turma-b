package segundob.aulas.aulaseis;

public class Penguim extends Ave {
    
    @Override
    public void voar() {
        throw new RuntimeException("NÃO SEI VOAR!");
    }

}
