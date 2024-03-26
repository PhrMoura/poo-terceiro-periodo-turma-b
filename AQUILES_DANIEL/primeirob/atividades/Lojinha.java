package primeirob.atividades;

import java.util.Scanner;

public class Lojinha {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int escolha = 0, totalVendas = 0;
    int plantasVendidas[] = new int[100];
    double valorDaVenda[] = new double[100];
    double descontoAplicado[] = new double[100];
    double matriz[][] = new double[30][12];

    while (escolha != 7) {
      System.out.println("|-----------------------------------------------|");
      System.out.println("|   Bem vindo a vendinha da Dona Gabrielinha!   |");
      System.out.println("|-----------------------------------------------|");

      System.out.println("Quantas plantas gostaria de comprar?");
      int plantas = input.nextInt();

      System.out.println("Qual o valor das plantas?");
      float valorPlanta = input.nextFloat();

      double valorTotal = plantas * valorPlanta;

      System.out.println("Total da compra: " + valorTotal);

      double valorPago = 0;
      while (valorTotal > valorPago) {
        System.out.println("Qual o valor que vai pagar?");
        valorPago = input.nextInt();
        if (valorTotal > valorPago) {
          System.out.println("NOT ENOUGH CASH! Stranger.");
        }
      }

      double desconto = 0;

      if (plantas >= 10) {
        desconto = valorTotal * 0.05;
        valorTotal -= desconto;
        System.out.println("Valor com desconto: " + valorTotal);
      } else {
        System.out.println("Valor sem desconto: " + valorTotal);
      }

      double troco = valorPago - valorTotal;

      plantasVendidas[totalVendas] = plantas;
      valorDaVenda[totalVendas] = valorTotal;
      descontoAplicado[totalVendas] = desconto;
      totalVendas++;

      System.out.println("[ 1 ] Calcular preço total");
      System.out.println("[ 2 ] Calcular troco");
      System.out.println("[ 3 ] Registro de vendas");
      System.out.println("[ 4 ] Fazer uma nova compra");
      System.out.println("[ 5 ] Alocar valor em um dia do mês");
      System.out.println("[ 6 ] Pesquisar total do dia em um mês");
      System.out.println("[ 7 ] Sair da loja");

      escolha = input.nextInt();
      int dia = 0, mes = 0;

      switch (escolha) {
        case 1:
          System.out.println("Preço total dessa compra: " + valorTotal);
          break;
        case 2:
          System.out.println("Você recebeu :" + troco + " de troco.");
          break;
        case 3:
          for (int i = 0; i < totalVendas; i++) {
            System.out.println("Vendas " + (i + 1) + " Plantas vendidas: " + plantasVendidas[i] + " Valor da venda: "
                + valorDaVenda[i] + " Desconto aplicado: " + descontoAplicado[i]);
          }
          break;
        case 4:
          break;
        case 5:
          System.out.println("Coloque o dia:");
          dia = input.nextInt();
          System.out.println("Coloque o mês:");
          mes = input.nextInt();
          matriz[dia][mes] += valorTotal;
          break;
        case 6:
          System.out.println("Coloque o dia:");
          dia = input.nextInt();
          System.out.println("Coloque o mês:");
          mes = input.nextInt();
          System.out.println("Total de valor vendido nesse dia é: " + matriz[dia][mes]);
          break;
        case 7:
          System.out.println("Volte sempre !");
          break;
        default:
          System.out.println("Opção invalida bobo.");
          break;
      }
    }
    input.close();
  }
}
