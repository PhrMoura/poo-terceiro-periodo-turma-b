package primeirob.atividades.atividadeclasse;

public class Vendedor extends Pessoa{

    Loja loja;
    Integer salarioBase = 2000;
    Integer[] salarioRecebido = new Integer[] {2000, 2250, 2500};
    Integer soma = 0;    

    public void apresentarse() {
        
        for (Integer valor : salarioRecebido) {
            soma = soma + valor;
        }
        double calcularMedia = soma / 3; //cálculo média

        double calcularBonus = salarioBase * 0.2; //cálculo bônus

        String msg = "Olá, sou o vendedor "
        .concat(nome)
        .concat(", tenho " + idade)
        .concat(" anos")
        .concat(" e trabalho na "  + loja.nomeFantasia)
        .concat(". Meu primeiro salário foi de R$" +salarioRecebido[0] + ", o segundo salário foi de R$" +salarioRecebido[1]+ " e o terceiro salário ficou em R$" +salarioRecebido[2])
        .concat(". Então a média dos últimos três salários ficou em R$" + calcularMedia)
        .concat(" e o bônus desse mês ficou em R$" +calcularBonus)
        .concat(" com base no meu salário base.");

        System.out.println(msg);
    }

}
