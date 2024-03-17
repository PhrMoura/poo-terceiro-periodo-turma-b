package primeirob;

import java.util.Scanner;

public class SegundaAtividade {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double[] bancoDeDadosQuantidadePlantas = new double[5];
        double[] bancoDeDadosValorVenda = new double[5];
        double[] bancoDeDadosValorDesconto = new double[5];
 
        boolean confirm = true;
        int contador = 0;

        while (confirm == true) {

            System.out.println("Selecione uma opção:");
            System.out.println("[1] - Calcular Preço Total");
            System.out.println("[2] - Calcular Troco");
            System.out.println("[3] - Exibir Vendas Salvas");
            System.out.println("[4] - Sair");

            int opcao = leitor.nextInt();

            switch(opcao) {
                case 1:
                    double valorPlantasVenda = 0, valorTotalVenda = 0, 
                        valorDescontoVenda = 0, valorDescontadoVenda = 0;
                    int quantidadePlantasVenda;
    
                    System.out.print("Insira a quantidade de plantas compradas: ");
                    quantidadePlantasVenda = leitor.nextInt();
                    System.out.print("Insira o valor das plantas: ");
                    valorPlantasVenda = leitor.nextDouble();
    
                    valorTotalVenda = (quantidadePlantasVenda * valorPlantasVenda);
                    
                    if (quantidadePlantasVenda > 10) {
                       valorDescontoVenda = valorTotalVenda * 0.05;
                       valorDescontadoVenda = (valorTotalVenda - valorDescontoVenda);
    
                       System.out.println("Por comprar mais que 10 plantas você ganhou um desconto!");
                       System.out.println("O valor total da compra com desconto é de: " + valorDescontadoVenda);
                    }
                    else {
                        System.out.println("O valor total da compra é: " + valorTotalVenda);
                    }

                    bancoDeDadosQuantidadePlantas[contador] = quantidadePlantasVenda;
                    bancoDeDadosValorDesconto[contador] = valorDescontoVenda;
                    bancoDeDadosValorVenda[contador] = valorTotalVenda;

                    contador++;
                    
                    break;
                case 2:
                    System.out.print("Insira o valor do pagamento do cliente: ");
                    double valorPagamento = leitor.nextDouble();
                    System.out.print("Insira o valor total da compra: ");
                    double valorTotalCompra = leitor.nextDouble();
    
                    double troco = (valorPagamento - valorTotalCompra);
    
                    System.out.println("O valor do troco do cliente: " + troco);
                    break;

                 case 3:
                    System.out.println("-----------------------------------");
                    System.out.println("Exibindo Banco de Dados...");
                    
                    for (int index = 0; index < bancoDeDadosQuantidadePlantas.length; index++) {
                        if (bancoDeDadosValorVenda[index] == 0)
                        {
                            break;
                        }
                        else {
                        System.out.println("Venda numero: " + (index+1));
                        System.out.println("Quantidade de Plantas: " + bancoDeDadosQuantidadePlantas[index]);
                        System.out.println("Valor Total da Compra: " + bancoDeDadosValorVenda[index]);
                        System.out.println("Valor Do Desconto: " + bancoDeDadosValorDesconto[index]);
                        }
                    }
                    
                    System.out.println("-----------------------------------");
                    break;

                 case 4:
                    System.out.println("Encerrando o sistema...");
                    confirm = false;
                    break;
            }

        }
       
        leitor.close();

    }
}