package GUILHERME_AGUSTINI_TEIXEIRA.Atividades.prova;

public class Hotel {


    public static void main(String[] args) {

        Clientehotel cliente = new Clientehotel();
        Clientehotel cliente1 = new Clientehotel();
        Quarto quarto10 = new Quarto();
        Quarto quarto20 = new Quarto();


        cliente.nome = "Joao ";
        cliente.idade = 25;
        cliente.cidade = "Cascavel";
        cliente.quarto = 10;

        cliente1.nome = "Joao 2 ";
        cliente1.idade = 27;
        cliente1.cidade = "Cascavel";
        cliente1.quarto = 20;

        quarto10.banheiros = 2;
        quarto10.camas = 2;
        quarto10.numero = 10;

        quarto20.banheiros = 1;
        quarto20.camas = 1;
        quarto20.numero= 20;

        cliente.apresentarsecliente();
        cliente1.apresentarsecliente();
        quarto10.apresentarsequartos();
        quarto20.apresentarsequartos();
        
        if(cliente.quarto == cliente1.quarto){

            System.out.println(" quarto indisponivel");

        }else{

            cliente.reservar();
            cliente1.reservar();

        }
        
    }
}
