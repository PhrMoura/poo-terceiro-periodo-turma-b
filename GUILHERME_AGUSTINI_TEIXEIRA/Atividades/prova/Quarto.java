package GUILHERME_AGUSTINI_TEIXEIRA.Atividades.prova;

public class Quarto {
    
    Integer banheiros;

    Integer camas;

    Integer numero;

    Boolean checkin;


    private Clientehotel cliente;
   


    public void apresentarsequartos(){

        String msg = "O quarto "
                .concat(numero.toString())
                .concat(" tem ")
                .concat(camas.toString())
                .concat(" camas e ")
                .concat(banheiros.toString())
                .concat(" banheiros ");
    
                System.out.println(msg);
        }

    public void quartoreservado(){

        this.cliente = new Clientehotel();

    }

    public void reservarquarto(){

        cliente.reservar();
        
    }

}
