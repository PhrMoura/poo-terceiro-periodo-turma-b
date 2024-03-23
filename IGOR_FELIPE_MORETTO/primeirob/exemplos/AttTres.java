package primeirob.exemplos;

import java.util.Scanner;

public class AttTres {
    public static void main(String[] args) {
        int contMenu = 0, posicao = 0, num = 0, linha = 1, quantPlanta = 0, coluna = 1;
        double precoTotal = 0.00d;
        double precoPlanta, valor, troco = 0.00d;
        double desconto = 0.00d;
        int[] vetor = new int[99];
        double[] vetorPreco = new double[99];
        double[] vetorDesconto = new double[99];
        boolean [][] matrizData = new boolean [30][12];
        

        System.out.println("Olá Dona Gabrielinha, me informe que dia e mês estamos, por gentileza?");
                    Scanner demo1 = new Scanner(System.in);
                    System.out.print("Dia: ");
                    int dia = demo1.nextInt();
                    System.out.print("Mês: ");
                    int mes = demo1.nextInt();
                    
        while (num != 3) {
            do {  
            System.out.println("\nMenu\n [1] Calcular Preço Total\n [2] Calcular Troco\n [3] Sair\n [4] Registro de vendas\n [5] Finalizar o código");

            Scanner demo = new Scanner(System.in);

            num = demo.nextInt();

            if (num == 1) {
                System.out.print("Digite a quantidade de plantas: ");
                quantPlanta = demo.nextInt();
                System.out.print("Digite o preço de cada planta: ");
                precoPlanta = demo.nextDouble();
                if (quantPlanta > 10) {
                    precoPlanta = quantPlanta * precoPlanta;
                    desconto = precoPlanta * 0.05;
                    precoTotal = precoPlanta - desconto;
                    vetorDesconto[posicao] = desconto;
                } else {
                    precoTotal = (precoPlanta * quantPlanta);
                }
                System.out.print("O preço total é: " + precoTotal);
                contMenu++;
                vetor[posicao] = quantPlanta;
                vetorPreco[posicao] = precoTotal;
                matrizData[dia][mes] = true;
                posicao++;
            }
            if (num == 2) {
                System.out.print("Digite o valor que o cliente pagou: ");
                valor = demo.nextDouble();
                troco = (valor - precoTotal);
                System.out.print("O troco é: " + troco);
            }
            if (num == 3) {
                System.out.println("Olá Dona Gabrielinha, me informe que dia e mês estamos, por gentileza?");
                System.out.print("Dia: ");
                dia = demo1.nextInt();
                System.out.print("Mês: ");
                mes = demo1.nextInt();
                matrizData[dia][mes] = true;
                
            }

            if (num == 4) {
                System.out.println("Consulta de Vendas");
                System.out.print("Digite o dia: ");
                dia = demo1.nextInt();
                System.out.print("Digite o mês: ");
                mes = demo1.nextInt();

                System.out.println("Vendas do dia " + dia + " do mês " + mes + ":");
                
                    for (int i = 0; i < contMenu; i++) {
                        System.out.println("Quantidade de planta vendida: " + vetor[i]);
                        System.out.println("Valor total da venda: " + vetorPreco[i]);
                        System.out.println("Desconto aplicado: " + vetorDesconto[i]);
                        }
                
                    
                }
            
            if (num == 5){
            
            }

        } while (coluna < matrizData[linha].length);
        coluna = 1;
        linha++;
        // fim do do-while
        
        
    } // fim do while

    System.exit(5); 

    } 
 
    }     