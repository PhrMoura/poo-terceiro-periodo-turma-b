import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner gSel = new Scanner(System.in);
        int op;
        int qntPlanta;
        Double valorPlanta = 0d;
        double precoTotal = 0;
        double valorPago = 0;
        double valorTroco = 0;
        

        do {

        System.out.println("Calculadora da Dona Gabrielinha ");
        System.out.println("Selecione a funcao ");
        System.out.println("1- Calcular Preço Total ");
        System.out.println("2- Calcular Troco ");
        System.out.println("3- Historico de Vendas ");
        System.out.println("4- Sair ");

        op = gSel.nextInt();

      
            
        
        switch (op) {

            case 1: //Preco total 

                System.out.println("Quantas plantas compradas: ");
                qntPlanta = gSel.nextInt();
                System.out.println("Valor da planta: ");
                valorPlanta = gSel.nextDouble();
                precoTotal = qntPlanta * valorPlanta;
                
                if (qntPlanta > 10) {
                    precoTotal = precoTotal * 0.05;
                    System.out.println("O desconto de 5% foi aplicado e o valor total ficou: " + precoTotal);
                }

                System.out.println("O valor total é: " + precoTotal);

                break;

            case 2: //Valor do troco

                System.out.println("Valor pago: ");
                valorPago = gSel.nextDouble();
                valorTroco = valorPago - precoTotal;
                System.out.println("O valor do troco sera: " + valorTroco);

                break;

            case 3: //Historico de vendas
                int desconto;
                
                System.out.println("Insira a quantidades de plantas vendidas ");
                qntPlanta = gSel.nextInt();

                System.out.println("Insira o valor total da venda ");

                precoTotal = gSel.nextFloat();

                System.out.println("Insira o valor do desconto aplicado ");
                
                desconto = gSel.nextInt();

                break;

            case 4: //Sair

                System.out.println("Ate logo ");

                break;

            default:

                System.out.println("Opcao invalida selecione novamente... ");

                break;
        }
        } while (op != 4);
        gSel.close();
    }
}
