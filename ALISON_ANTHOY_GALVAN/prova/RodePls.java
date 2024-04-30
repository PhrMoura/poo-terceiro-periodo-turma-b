package ALISON_ANTHOY_GALVAN.prova;

import java.util.Scanner;

public class RodePls {


    public static void main(String[] args) {

        int qrts[] = new int [100]; 
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite quantos quartos voce deseja cadastrar: ");
        int qtdq = scanner.nextInt();

        int i;
    
        for(i=0; i<qtdq; i++){
    
            int x = i + 1;
    
            qrts[i] = x;
    
            System.out.println("Quarto " + qrts[i] + " cadastrado com sucesso");
    
        }
    
        String cltns[] = new String [200];
        
        System.out.println("Escolha quantos cliente você deseja cadastrar");
        int qtdc = scanner.nextInt();

        qtdc = qtdc * 2;
    
        for(i=0; i<qtdc; i++){
    
            System.out.println("Digite o nome do cliente: ");
            cltns[i] = scanner.next();
    
            i += 1;
    
            System.out.println("Digite o cpf do cliente: ");
            cltns[i] = scanner.next();
    
        }
        
        System.out.println("Digite 1 para listar os quartos");
        i = scanner.nextInt();

        System.out.println(" ");
    
        if(i == 1){
    
            for(i=0; i<qtdq; i++){
    
                System.out.println(qrts[i]);
    
             };
    
        }
    
        System.out.println("Digite 1 para listar os clientes");
        i = scanner.nextInt();
    
        int x = 1;
    
        if (i == 1){
    
            for(i=0; i<qtdc; i++){
    
                System.out.print("Cliente nº" + x + ": " + cltns[i]);

                x +=1;
    
                i += 1;
                
                System.out.println(" do cpf: " + cltns[i]);
    
            }
        }
    
        System.out.println("Escolha o numero do cliente do qual voce deseja reservar um quarto: ");
        i = scanner.nextInt();
    
        System.out.println("Escolha o numero do quarto qual voce deseja reservar: ");
        x = scanner.nextInt();
    
        x -=1;
    
        System.out.println("O cliente " + cltns[i] + " reservou o quarto " + qrts[x] + " com sucesso");

        System.out.print("Check-in realizado para o cliente " + cltns[i]);

        i +=1;

        System.out.println(" portador do cpf: " + cltns[i] + " no quarto: " + qrts[x]);

    }

}
