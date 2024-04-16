package atividades.atividade6;

public class Endereço {
    String rua;
    String cidade;
    String bairro;
    int numero;
    String complemento;


    public void apresentarLogradouro(){ 

        String msg = "Endereço:\n"
        .concat("Cidade: " + cidade)
        .concat("Bairro: " + bairro)
        .concat("Rua: " + rua)
        .concat("Número: " + numero)
        .concat("Complemento: " + complemento);

        System.out.println(msg);
    }
}
