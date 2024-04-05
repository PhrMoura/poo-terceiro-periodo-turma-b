package atividades.atividade5;

public class Vendedor {

    String nomeVendedor;
    String cidadeVendedor;
    String bairroVendedor;
    String ruaVendedor;
    String loja; 

    int idadeVendedor;

    double salarioBase;
    double salarioRecebido;

    public void apresentarseVendedor() {

        String msg = "Nome do vendedor "
            .concat(nomeVendedor)
            .concat(". ")
            .concat(idadeVendedor+toString())
            .concat(" anos. Trabalha na loja: ")
            .concat(loja);

            System.out.println(msg);
    }

    public void calcularBonus(){

        salarioRecebido = salarioBase * 0.2;
        
        System.out.println("O salário com bônus é de: " + salarioRecebido);
    }

    public void calcularMedia(){
        
    }
}