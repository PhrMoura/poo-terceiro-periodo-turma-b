package GUILHERME_AGUSTINI_TEIXEIRA.Atividades.prova;

public class Clientehotel {
    
    String nome;

    Integer idade;

    String cidade;

    Integer quarto;

    Boolean checkin10 = false;

    Boolean checkin20 = false;

    public void reservar(){ 
    
    if (quarto == 10){

        System.out.println(" quarto 10 reservado ");
        checkin10 = true;

    }

    if(quarto == 20){

        System.out.println(" quarto 20 reservado ");
        checkin20 = true;
        
    }

}

    public void apresentarsecliente(){

        String msg = "O nome do cliente é: "
                .concat(nome)
                .concat(" A idade do cliente é: ")
                .concat(idade.toString())
                .concat(" A cidade do cliente é: ")
                .concat(cidade)
                .concat(" Qual quarto o cliente está: ")
                .concat(quarto.toString());
    
                System.out.println(msg);
        }

}
