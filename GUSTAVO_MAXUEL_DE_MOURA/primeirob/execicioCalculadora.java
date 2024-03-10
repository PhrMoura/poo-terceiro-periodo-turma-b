package primeirob.exemplos;
import java.util.Scanner;

public class execicioCalculadora {
public static void main(String[] args) {
    int numero = 0; 
    double valorPago,precoPlanta, precoTotal = 0.00d; 
    int quantidadePlanta; 
    while (numero != 3) {
    Scanner menu = new Scanner(System.in);
    
 System.out.println("Menu de pagamentos do café Dona Gabrielinha\nEscolha a opção que deseja\n[1]-Calcular preço total\n[2]-Calcular troco\n[3]-Sair");
 numero = menu.nextInt();
    
        switch (numero) {
            case 1:
            System.out.println("Cálculo do preço da planta\nDigite a quantidade da planta:");
            quantidadePlanta = menu.nextInt();
            System.out.println("Digite o preço da planta");
            precoPlanta = menu.nextDouble();
            precoTotal = (precoPlanta * quantidadePlanta);
            System.out.println("O preço total é "+ precoTotal);
                break;
            case 2:
            System.out.println("Cálculo do troco para o cliente\nDigite o valor recebido:");
            valorPago = menu.nextDouble();
            valorPago = (valorPago - precoTotal);
            System.out.println("O troco é "+ valorPago);
                break;
            case 3:
            
                break;
        
            default:
            System.out.println("Opção não válida");
                break;
        }
        
        System. exit(0);
    }






}

  

}
