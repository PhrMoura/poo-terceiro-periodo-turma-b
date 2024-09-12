package primeirob.atividades.atividadeclasse;

public class Gerente extends Pessoa{
    Loja loja;
    Integer salarioBase = 4000;
    Integer[] salarioRecebido = new Integer[] {4000, 4100, 4350};
    Integer soma = 0;
    public void apresentarse() {
        
        for (Integer valor : salarioRecebido) {
            soma = soma + valor;
        }
        double calcularMedia = soma / 3; //cálculo média

        double calcularBonus = salarioBase * 0.35; //cálculo bônus

        String msg = "Olá, sou o gerente de vendas "
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
