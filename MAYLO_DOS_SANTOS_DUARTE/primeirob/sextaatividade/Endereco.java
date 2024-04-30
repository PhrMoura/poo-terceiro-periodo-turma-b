package primeirob.sextaatividade;

public class Endereco {
    String uf, cidade, bairro, rua, complemento;
    int numero;

    public void apresentarLogradouro() {
        String msg01 = "R. "
            .concat(rua + ", ")
            .concat(numero + " - ")
            .concat(bairro)
            .concat("\n")
            .concat(cidade)
            .concat(" - " + uf)
            .concat("\n")
            .concat("Complemento: ")
            .concat(complemento);

        System.out.println(msg01);
    }


    
}
