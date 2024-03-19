package primeirob.exemplos;

import java.util.Scanner;

public class AtividadeUm {
  public static void main(String[] args) {
    System.out.println("|-----------------------------------------------|");
    System.out.println("|   Bem vindo a vendinha da Dona Gabrielinha!   |");
    System.out.println("|-----------------------------------------------|");

    System.out.println("Quantas plantas gostaria de comprar?");
    Scanner input = new Scanner(System.in);
    int plantas = input.nextInt();

    System.out.println("Qual o valor das plantas?");
    Scanner inputDois = new Scanner(System.in);
    float valorPlanta = inputDois.nextFloat();

    float calculo = plantas * valorPlanta;
    //valor total a pagar

    System.out.println("Total da compra: " + calculo);

    int valorPago = 0;
    for (int i = 0; i <= 1; i++) {
      System.out.println("Qual o valor que vai pagar?");
      Scanner inputTres = new Scanner(System.in);
      valorPago = inputTres.nextInt();
    if (calculo > valorPago) {
      System.out.println("NOT ENOUGH CASH! Stranger.");
      i--;
      } else {
      i++;
      }
    }

    float troco = valorPago - calculo;

    System.out.println("[ 1 ] Calcular preço total");
    System.out.println("[ 2 ] Calcular troco");
    System.out.println("[ 3 ] Sair");

    Scanner inputQuatro = new Scanner(System.in);
    int escolha = inputQuatro.nextInt();

    if (escolha == 1) {
      System.out.println(calculo);
    }
    if (escolha == 2) {
      System.out.println(troco);
    }
    if (escolha == 3) {
      System.out.println("Saindo da loja !");
    }
    
  }
}
