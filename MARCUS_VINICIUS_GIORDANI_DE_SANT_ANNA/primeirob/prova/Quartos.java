package primeirob.prova;

public class Quartos {

    public static Object cadastrarQuarto;
    private Integer numero;
    private Integer[] quartosHotel = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private Quartos[] quartos;

    public void listarQuartos(){
        System.out.println("Quartos disponíveis:");
        for (int i = 0; i < this.quartos.length; i++){
            if (this.quartos[i] != null) {
                System.out.println((i + 1) + ": " + this.quartos[i].getNumero() + " - " + this.quartos[i].getTipo());
            }
        }
    }

    public void cadastrarQuarto(Quartos quarto){
        this.quartos[quarto.getNumero() - 1] = quarto;
    }

    public void reservarQuarto(int numeroQuarto, Clientes Clientes){
        Quartos quarto = this.quartos[numeroQuarto - 1];
        if (quarto != null && quarto.getDisponivel()){
            quarto.setDisponivel(false);
            quarto.setClientes(Clientes);
            System.out.println("Quarto " + quarto.getNumero() + " reservado com sucesso!");
            System.out.println("Quarto indisponível");
        }
    }

    public Quartos(Integer numero, Integer[] quartosHotel) {
        this.numero = numero;
        this.quartosHotel = quartosHotel;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer[] getQuartos() {
        return quartosHotel;
    }

    public void setQuartos(Integer[] quartosHotel) {
        this.quartosHotel = quartosHotel;
    }

    public int getTipo() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getTipo'");
    }

    public boolean getDisponivel() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getDisponivel'");
    }

    public void setDisponivel(boolean b) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setDisponivel'");
    }

    public void setClientes(Clientes clientes) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setClientes'");
    }

    public Object getClientes() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getClientes'");
    }

    public void setOcupado(boolean b) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setOcupado'");
    }


}
