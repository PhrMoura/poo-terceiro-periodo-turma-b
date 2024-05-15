public class Vendedor {

    String nome;

    String idade;

    Loja Loja;

    String cidade;

    String bairro;

    String rua;

    Double salarioBase;

    Double salarioRecebido;

    public void apresentarsevend(){

        String msg = "Olá eu sou o vendedor "
                .concat(nome)
                .concat(" tenho ")
                .concat(idade)
                .concat(" anos e trabalho na Loja Myy Plant");

        System.out.println(msg);

    }

    public void calcularbonus(){

        String msg = "O bonus do vendedor "
                .concat(nome)
                .concat(" será de R$" + (salarioBase * 0.02));

        System.out.println(msg);
    }

    public void calcularmedia(){

        String msg = "A media salaria dos vendedores é de R$" + ((3000 + 4700 + 1800) / 3);
        System.out.println(msg);
    }

}