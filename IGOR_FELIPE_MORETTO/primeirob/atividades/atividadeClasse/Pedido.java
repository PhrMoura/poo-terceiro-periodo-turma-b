package primeirob.atividades.atividadeclasse;

import java.util.Date;
import java.util.Scanner;

public class Pedido extends Item{
    Integer id;
    Date dataCriacao = new Date();
    Date dataPagamento = new Date();
    long dataVencimentoReserva;
    String cliente;
    String vendedor;
    Loja lojaDois;
    double valorT = 0.0d;
    int [] item = new int []{1002, 1003, 1004};
    Scanner demo = new Scanner(System.in);
    double valorTotal = 0.0d;
    long diaAtual;
    int cond = 0;

    public void calcularValorTotal(){
        
        System.out.println("Id do produto: ");
        id = demo.nextInt();
        if (id == 1002) {
            System.out.println("Samambaia");
            valorTotal = valor[0];
            valorT = valorT + valorTotal;
        }
        else if (id == 1003){
            System.out.println("Suculenta");
            valorTotal = valor[1];
            valorT = valorT + valorTotal;
        }
        else if (id == 1004){
            System.out.println("Cacto");
            valorTotal = valor[2];
            valorT = valorT + valorTotal;
        }
        else {
            System.out.println("Id inválido");
        }
        
        while (cond != 2) {
                System.out.println("Mais algum produto? [1] Sim [2] Não");
                cond = demo.nextInt();
                if (cond == 1) {
                    System.out.println("Id do produto: ");
                id = demo.nextInt();
                if (id == 1002) {
                    System.out.println("Samambaia");
                    valorTotal = valor[0];
                    valorT = valorT + valorTotal;
                }
                else if (id == 1003){
                    System.out.println("Suculenta");
                    valorTotal = valor[1];
                    valorT = valorT + valorTotal;
                }
                else if(id == 1004){
                    System.out.println("Cacto");
                    valorTotal = valor[2];
                    valorT = valorT + valorTotal;
                }
                else {
                    System.out.println("Id inválido");
                }
                } else {
                    break;
                }
        }
            System.out.println("Valor total: R$" + valorT);
        }
        

    public void gerarDescricaoVenda(){

        System.out.println("Data de criação: "+ dataCriacao + ", valor total: R$" + valorT);
    }
    
}
