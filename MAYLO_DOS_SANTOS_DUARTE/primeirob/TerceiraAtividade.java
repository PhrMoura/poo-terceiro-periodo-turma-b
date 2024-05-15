package primeirob;

import java.util.Scanner;

public class TerceiraAtividade {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double[] bancoDeDadosQuantidadePlantas = new double[5];
        double[] bancoDeDadosValorVenda = new double[5];
        double[] bancoDeDadosValorDesconto = new double[5];

        double[][] bancoDeDadosVendaPorDia = new double[12][30];
        double[][] bancoDeDadosQuantidadeVendaPorDia = new double[12][30];
 
        boolean confirm = true;
        int contador = 0;

        while (confirm == true) {

            System.out.println("Selecione uma opção:");
            System.out.println("[1] - Calcular Preço Total - Venda");
            System.out.println("[2] - Calcular Troco - Troco");
            System.out.println("[3] - Exibir Vendas Salvas");
            System.out.println("[4] - Exibir Vendas Salvas - Por Dia");
            System.out.println("[5] - Sair");

            int opcao = leitor.nextInt();

            switch(opcao) {
                case 1:
                    double valorPlantasVenda = 0, valorTotalVenda = 0, 
                        valorDescontoVenda = 0, valorDescontadoVenda = 0;
                    int quantidadePlantasVenda;
                    
                    System.out.print("Qual o dia do mês? ");
                    int diaMes = leitor.nextInt();
                    System.out.print("Qual o mês? ");
                    int mes = leitor.nextInt();
                    
                    mes--;
                    diaMes--;
    
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

                    if (valorDescontoVenda == 0) {
                        bancoDeDadosVendaPorDia[mes][diaMes] += valorTotalVenda;
                        bancoDeDadosQuantidadeVendaPorDia[mes][diaMes] += 1;
                    } 
                    else {
                    bancoDeDadosVendaPorDia[mes][diaMes] += valorDescontadoVenda;
                    bancoDeDadosQuantidadeVendaPorDia[mes][diaMes] += 1;
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
                        System.out.println("-----------------------------------");
                        }
                    }
                    
                    break;
                    
                case 4:
                    boolean confirmCheck = true;
                    int tempIndex = 0;

                    System.out.print("Qual mês você deseja checar? ");
                    int mesCheck = leitor.nextInt();
                    System.out.print("Qual dia você deseja checar? ");
                    int diaMesCheck = leitor.nextInt();

                    mesCheck--;
                    diaMesCheck--;

                    do {

                        if (tempIndex != 444) {
                            System.out.println("Você fez " + bancoDeDadosQuantidadeVendaPorDia[mesCheck][diaMesCheck] + " vendas no dia");
                            System.out.println("Isso gerou um valor total de: " + bancoDeDadosVendaPorDia[mesCheck][diaMesCheck]);
                        }

                        System.out.println("Deseja checar outro dia neste mês?");
                        System.out.println("[1] - Sim");
                        System.out.println("[2] - Não");
                        System.out.println("[3] - Sair");

                        tempIndex = leitor.nextInt();

                        switch (tempIndex) {
                            case 1:
                                System.out.print("Qual dia você deseja checar? ");
                                diaMesCheck = leitor.nextInt();

                                diaMesCheck--;
                                break;

                            case 2:
                                System.out.print("Qual mês você deseja checar? ");
                                mesCheck = leitor.nextInt();
                                System.out.print("Qual dia você deseja checar? ");
                                diaMesCheck = leitor.nextInt();

                                mesCheck--;
                                diaMesCheck--;
                                break;
                        
                            case 3:
                                confirmCheck = false;
                                break;

                            default:
                                System.out.println("Erro: Opção inexistente...");
                                tempIndex = 444;
                            break;
                        }

                    } while(confirmCheck == true);
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    confirm = false;
                    break;
                
                default:
                    System.out.println("Erro: Opção inexistente...");
                    break;
                
            }

        }
       
        leitor.close();

    }
}
