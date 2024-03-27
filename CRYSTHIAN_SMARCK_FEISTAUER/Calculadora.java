import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int usuario = 0;
        int quantidadeDeVendas = 0;
        double valorTotalDeVendas = 0;
        double descontos = 0;
        double[] vendas = new double[3];

        String mensagem = """
                \n*Digite sua opção*
                1- Calcular o preço total
                2- Calcular troco
                3- Sair e exibir fluxo de caixa e total de plantas vendidas
                """;

        while (true) {
            System.out.println(mensagem);
            usuario = entrada.nextInt();

            if (usuario == 3) {
                vendas[0] = quantidadeDeVendas;
                vendas[1] = valorTotalDeVendas;
                vendas[2] = descontos;

                System.out.println("\n** resumo das vendas**");
                System.out.println("Quantidade de plantas vendidas: " + vendas[0]);
                System.out.println("Valor das vendas: " + vendas[1]);
                System.out.println("Valor dos descontos aplicados: " + vendas[2]);

                break;
            }

            switch (usuario) {
                case 1:
                    System.out.println("quantidade do mesmo item");
                    int quantidadeItem = entrada.nextInt();

                    System.out.println("Valor do item");
                    double valorItem = entrada.nextDouble();

                    double total = quantidadeItem * valorItem;

                    if(quantidadeItem >= 10){
                        double desconto = total * 0.05;
                        Double novoTotal = total - desconto;
                        System.out.println("Valor total com 5% de desconto: " + novoTotal);
                        valorTotalDeVendas += novoTotal;
                        descontos += desconto;
                    } else{
                        System.out.println("\nO total é: " + total + " reais\n");
                        valorTotalDeVendas += total;
                    }
                    quantidadeDeVendas += quantidadeItem;
                    break;
                case 2:
                    System.out.println("Valor da conta");
                    double valorConta = entrada.nextDouble();

                    System.out.println("Valor recebido do cliente");
                    double valorRecebido = entrada.nextDouble();

                    double troco = valorRecebido - valorConta;
                    System.out.println("\nTroco do cliente é: " + troco + " reais\n");
                    valorTotalDeVendas += troco;
                    quantidadeDeVendas++;
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente.\n");
                    break;
            }
        }
        entrada.close();
        System.out.println("\nSaindo\n");
    }
}