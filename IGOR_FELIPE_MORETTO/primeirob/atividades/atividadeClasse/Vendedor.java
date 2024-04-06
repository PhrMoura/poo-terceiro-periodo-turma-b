package primeirob.atividades.atividadeClasse;

public class Vendedor {
    
    String nome;
    Integer idade;
    Loja loja;
    String cidade;
    String bairro;
    String rua;
    Integer salarioBase = 2000;
    Integer[] salarioRecebido = new Integer[] {2000, 2250, 2500};
    Integer soma = 0;    

    
    public void apresentarse() {

        for (Integer valor : salarioRecebido) {
            soma = soma + valor;
        }
        double calcularMedia = soma / 3; //cálculo média

        double calcularBonus = salarioBase * 0.2; //cálculo bônus
        //System.out.println("O bônus desse mês ficou em: R$" +calcularBonus);


        String msg = "Olá, sou o vendedor "
        .concat(nome)
        .concat(", tenho " + idade)
        .concat(" anos")
        .concat(" e trabalho na " + loja)
        .concat(". Meu primeiro foi de R$" +salarioRecebido[0] + ", o segundo salário foi de R$" +salarioRecebido[1]+ " e o terceiro salário ficou em R$" +salarioRecebido[2])
        .concat(". Então a média dos últimos três salários ficou em R$" + calcularMedia)
        .concat(" e o bônus desse mês ficou em R$" +calcularBonus);

        // String calcularMedia = "Meu salário foi "
        // .concat(" " + salarioRecebido [0])
        // .concat(" no primeiro mês,")
        // .concat(" " + salarioRecebido [1])
        // .concat(" no segundo mês, e ")
        // .concat(" " + salarioRecebido [2])
        // .concat("no terceiro mês.");
        
       
        //System.out.println("O primeiro salário foi de R$" +salarioRecebido[0] + ", o segundo salário foi de R$" +salarioRecebido[1]+ " e o terceiro salário ficou em R$" +salarioRecebido[2]+ ". Então a média dos últimos três salários ficou em: R$" + calcularMedia);
        

        
        // System.out.println(calcularMedia);

        System.out.println(msg);
    }

}
