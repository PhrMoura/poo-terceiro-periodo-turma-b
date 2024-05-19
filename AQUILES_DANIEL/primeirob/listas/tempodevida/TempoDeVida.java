package primeirob.listas.tempodevida;

import java.util.Date;
import java.util.Scanner;

public class TempoDeVida {
  public static void main(String[] args) {
    System.out.println("**********************************");
    System.out.println("*   Bem vindo ao tempo de vida   *");
    System.out.println("**********************************");

    Scanner input = new Scanner(System.in);

    System.out.println("Me informe sua data de nascimento");

    System.out.println("Qual o dia?");
    int dia = input.nextInt();

    System.out.println("Qual o mês?");
    int mes = input.nextInt();

    System.out.println("Qual o ano?");
    int ano = input.nextInt();

    // data de joje
    Date dataAtual = new Date();
    // data de hoje mas com os parametros ano ,mes e dia
    Date dataSemHora = new Date(dataAtual.getYear(), dataAtual.getMonth(), dataAtual.getDate());
    // editando a data manualmente
    Date dataDeAniversario = new Date((ano - 1900), (mes - 1), dia);

    Long diaEmMs = 86400000l;
    Long mesEmMS = 2629800000l;
    long semanaEmMs = 604800000l;

    // System.out.println("Data de hoje: " + dataAtual);
    // System.out.println("Data sem hora: " + dataSemHora);
    // System.out.println("Meu aniversario: " + dataDeAniversario);

    System.out.println("Dias de vida: " + (dataAtual.getTime() - dataDeAniversario.getTime()) / diaEmMs);
    System.out.println("Semanas de vida: " + (dataAtual.getTime() - dataDeAniversario.getTime()) / semanaEmMs);
    System.out.println("Meses de vida: " + (dataAtual.getTime() - dataDeAniversario.getTime()) / mesEmMS);

  }
}
