package IGOR_FELIPE_MORETTO.primeirob.prova;

import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Quarto quarto = new Quarto(20);
        int num = 0;
        Scanner reserva = new Scanner(System.in);

        System.out.println("Olá somos o hotel JAVA");
        System.out.println("Vamos começar? [1] Sim [2] Não/Sair");
        num = reserva.nextInt();
        while (num != 2){
        System.out.println("Deseja realizar uma reserva? [1] Sim [2] Não/Sair");
        num = reserva.nextInt();
        cliente.cliente();
        System.out.println("Olá cliente " + cliente.getNome());
        quarto.listarQuarto();
        quarto.reserva();
        System.out.println();
        System.out.println("Deseja realizar uma nova reserva? [1] Sim [2] Não/Sair ");
        num = reserva.nextInt();
        if (num == 1) {
            cliente.cliente();
            System.out.println("Olá cliente " + cliente.getNome());
            quarto.listarQuarto();
            quarto.reserva();
            System.out.println();
        }
    
        }
        if (num == 2) {
            System.out.println("Saindo...");
        }
        
        System.exit(2);
        reserva.close();
    }
}
