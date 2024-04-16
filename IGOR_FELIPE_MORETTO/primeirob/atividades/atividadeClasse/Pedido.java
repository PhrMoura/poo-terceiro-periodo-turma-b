package primeirob.atividades.atividadeclasse;

import java.util.Date;
import java.util.Scanner;

public class Pedido extends Item{
    Integer id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    String cliente;
    String vendedor;
    Loja lojaDois;
    int [] item = new int []{1002, 1003, 1004};
    Scanner pedido = new Scanner(System.in);
    int valorTotal = 0;

    public void calcularValorTotal(){
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Id do produto: ");
            pedido = new Scanner(System.in);
            if (id == 1002) {
                System.out.println("Samambaia");
                valorTotal = item[0];
            }
            if (id == 1003){
                System.out.println("Suculenta");
                valorTotal = item[1];
            }
            if (id == 1004){
                System.out.println("Cacto");
                valorTotal = item[2];
            }
        }
        System.out.println(valorTotal);
    }

    public void gerarDescricaoVenda(){

    }
}
