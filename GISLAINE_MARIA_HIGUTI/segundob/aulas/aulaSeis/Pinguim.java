package segundob.aulas.aulaSeis;

public class Pinguim extends Ave{
    @Override
    public void voar(){
        throw new RuntimeException("Pinguim não voa");
    }
    
}
