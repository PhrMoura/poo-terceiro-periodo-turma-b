// package primeirob;

// import java.util.Scanner;

// import primeirob.exemplos.Cliente;
// import primeirob.exemplos.Loja;
// import primeirob.exemplos.Vendedor;

// public class AtvTres {
//     public static void main(String[] args) {
//         int dia = 0, mes = 0, numero = 0, diaConsulta, mesConsulta;
//         double valorPago = 0.00d, precoPlanta = 0.00d, desconto = 0.00d, precoTotal = 0.00d;
//         int quantidadePlanta, posicao = 0;
//         int[][] matrizVendas = new int[30][13];
//         double[] arrayDesconto = new double[99];
//         double[][] matrizPreco = new double[30][13];
//         Scanner menu = new Scanner(System.in);
//         Loja lojaImport = new Loja();
//         Vendedor vend = new Vendedor();
//         Cliente clienteIn = new Cliente();

//         while (numero != 3) {

//             if (dia != 0) {
//                 System.out.println("---------------------\n" +
//                         "O dia de hoje é " + dia + ", e o mês é " + mes);

//             } else {
//                 do {
//                     System.out.print("digite o dia atual: ");
//                     dia = menu.nextInt();
//                     System.out.print("digite o mês atual(Em formato numérico): ");
//                     mes = menu.nextInt();
//                     if (dia > 30 || mes > 12) {
//                         System.out.println("Data inválida!");
//                     }
//                 } while (dia > 30 || mes > 12);

//             }

//             System.out.println(
//                     "---------------------------\n" +
//                             "Menu de pagamentos do café Dona Gabrielinha\n" +
//                             "Escolha a opção que deseja\n[1]-Calcular preço total\n" +
//                             "[2]-Calcular troco\n" +
//                             "[3]-Sair\n" +
//                             "[4]-Ver todas as vendas\n"
//                             + "[5]-Novo dia"
//                             + "[6]-Mostrar descrição loja"
//                             + "[7]-Mostrar descrição vendedor"
//                             + "[8]-Mostrar descrição cliente"
//                             + "\n--------------------------");
//             numero = menu.nextInt();

//             switch (numero) {
//                 case 1:
//                     System.out.println("Cálculo do preço da planta\nDigite a quantidade da planta:");
//                     quantidadePlanta = menu.nextInt();

//                     System.out.println("Digite o preço da planta");
//                     precoPlanta = menu.nextDouble();
//                     if (quantidadePlanta > 10) {
//                         desconto = (precoPlanta * quantidadePlanta);
//                         precoTotal = ((precoPlanta * quantidadePlanta) * 0.95);
//                         desconto = (desconto - precoTotal);
//                         arrayDesconto[posicao] = desconto;
//                     } else {
//                         precoTotal = (precoPlanta * quantidadePlanta);
//                     }

//                     if (dia >= 0 && dia < matrizVendas.length && mes >= 0 && mes < matrizVendas[mes].length) {
//                         matrizVendas[dia][mes] = (quantidadePlanta + matrizVendas[dia][mes]);
//                         matrizPreco[dia][mes] = (precoTotal + matrizPreco[dia][mes]);

//                     } else {
//                         System.out.println("Data inválida.");
//                     }
    
//                     System.out.println("O preço é "+ precoTotal);

//                     posicao++;

//                     break;
//                 case 2:
//                     System.out.println("Cálculo do troco para o cliente\nDigite o valor recebido:");
//                     valorPago = menu.nextDouble();
//                     valorPago = (valorPago - precoTotal);
//                     break;
//                 case 3:

//                     break;
//                 case 4:
//                     System.out.print("Digite o dia para consultar: ");
//                     diaConsulta = menu.nextInt();
//                     System.out.print("Digite o mês para consultar: ");
//                     mesConsulta = menu.nextInt();
//                     if (diaConsulta >= 0 && diaConsulta < matrizVendas.length && mesConsulta >= 0
//                             && mes < matrizVendas[mesConsulta].length) {
//                         System.out.println("------------------------------------------------");
//                         System.out.println("As vendas da data " + diaConsulta + "/" + mesConsulta + " foram de "
//                                 + matrizVendas[diaConsulta][mesConsulta] + "\nE o preço das vendas foi de:R$"
//                                 + matrizPreco[diaConsulta][mesConsulta]);

//                     } else {
//                         System.out.println("Data inválida.");
//                     }

//                     break;
//                 case 5:
//                     do {
//                         System.out.print("digite o dia atual: ");
//                         dia = menu.nextInt();
//                         System.out.print("digite o mês atual(Em formato numérico): ");
//                         mes = menu.nextInt();
//                         if (dia > 30 || mes > 12) {
//                             System.out.println("Data inválida!");
//                         }
//                     } while (dia > 30 || mes > 12);
//                     break;
//                     case 6:
//                     lojaImport.apresentarSe();
//                     break;
//                     case 7:
//                     vend.apresentarSe();
//                     break;
//                     case 8:
//                     clienteIn.apresentarSe();
//                     break;

//                 default:
//                     System.out.println("Opção não válida");

//             }

//         }

//         System.exit(0);
//         menu.close();
//     }
// }
