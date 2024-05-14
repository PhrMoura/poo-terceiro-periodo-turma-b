package primeirob.atividades.atividadeclasse;
// package primeirob.atividades.atividadeclasse;

// import java.util.Scanner;

// public class AttSeis {
//     public static void main(String[] args) {
//         int posicao = 0, num = 0, linha = 0, quantPlanta = 0, coluna = 0;
//         double precoTotal = 0.00d;
//         double precoPlanta, valor, troco = 0.00d;
//         double desconto = 0.00d;
//         int[] vetor = new int[99];
//         double[] vetorPreco = new double[99];
//         double[] vetorDesconto = new double[99];
//         int [][] matriz = new int [30][13];
//         double [][] matrizValor = new double [30][13];
//         Scanner demo = new Scanner(System.in);
//         Cliente cliente = new Cliente();
//         Cliente clienteDois = new Cliente();
//         Cliente clienteTres = new Cliente();
//         Vendedor vendedor = new Vendedor();
//         Loja loja = new Loja();
//         Item item = new Item();
//         Gerente gerente = new Gerente();
//         Pedido pedido = new Pedido();
//         ProcessaPedido procPedido = new ProcessaPedido();
                    
//         while (num != 12) {
//             if (linha != 0) {
//                 System.out.println("\nEstamos no dia " + linha + " do " + coluna);
//             }
//             else {
//         do {
//             System.out.println("Olá Dona Gabrielinha, me informe que dia e mês estamos, por gentileza? (Ambos em formato numérico)");
//                     demo = new Scanner(System.in);
//                     System.out.print("Dia: ");
//                     linha = demo.nextInt();
//                     System.out.print("Mês: ");
//                     coluna = demo.nextInt();
//                     if (linha > 30 || coluna > 12) {
//                         System.out.println("Data inválida");
//                     }
//         } while (linha > 30 || coluna > 12);
//     }
            
//             System.out.println("\nMenu\n [1] Calcular Preço Total\n [2] Calcular Troco\n [3] Ir para outro dia\n [4] Registro de vendas\n [5] Vendedores\n [6] Clientes\n [7] Loja\n [8] Gerentes\n [9] Itens\n [10] Pedido\n [11] Processar Pedido\n [12] Sair");

//             num = demo.nextInt();

//             if (num == 1) {
//                 System.out.print("Digite a quantidade de plantas: ");
//                 quantPlanta = demo.nextInt();
//                 System.out.print("Digite o preço de cada planta: ");
//                 precoPlanta = demo.nextDouble();
//                 if (quantPlanta > 10) {
//                     precoPlanta = quantPlanta * precoPlanta;
//                     desconto = precoPlanta * 0.05;
//                     precoTotal = precoPlanta - desconto;
//                     vetorDesconto[posicao] = desconto;
//                 } else {
//                     precoTotal = (precoPlanta * quantPlanta);
//                 }
//                 if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[coluna].length) {
//                     matriz[linha][coluna] = (quantPlanta + matriz[linha][coluna]);
//                     matrizValor[linha][coluna] = (precoTotal + matrizValor[linha][coluna]);

//                 } else {
//                     System.out.println("Data inválida.");
//                 }
//                 System.out.print("O preço total é: " + precoTotal);
//                 vetor[posicao] = quantPlanta;
//                 vetorPreco[posicao] = precoTotal;
//                 posicao++;
//             }
//             if (num == 2) {
//                 System.out.print("Digite o valor que o cliente pagou: ");
//                 valor = demo.nextDouble();
//                 troco = (valor - precoTotal);
//                 System.out.print("O troco é: " + troco);
//             }
//             if (num == 3) {
//                 System.out.println("Olá Dona Gabrielinha, me informe que dia e mês estamos, por gentileza?  (Ambos em formato numérico)");
//                 System.out.print("Dia: ");
//                 linha = demo.nextInt();
//                 System.out.print("Mês: ");
//                 coluna = demo.nextInt();
                
//             }

//             if (num == 4) {
//                 System.out.print("Informe o dia para consulta: ");
//                     int linhaConsult = demo.nextInt();
//                     System.out.print("Informe o mês para consulta: ");
//                     int colunaConsult = demo.nextInt();
//                     if (linhaConsult >= 0 && linhaConsult < matriz.length && colunaConsult >= 0
//                             && coluna < matriz[colunaConsult].length) {
//                         System.out.println("-----------------------");
//                         System.out.println("As vendas da dia " + linhaConsult + " do " + colunaConsult + " foram de " + matriz[linhaConsult][colunaConsult] + " quantidades e o valor das vendas foi de: R$" + matrizValor[linhaConsult][colunaConsult]);

//                     } else {
//                         System.out.println("Data inválida.");
//                     }   
//                 }
//             if (num == 5) {
//                 vendedor.nome = "Roger Guedes";
//                 vendedor.idade = 18;
//                 vendedor.bairro = "São José Operário";
//                 vendedor.cidade = "Capanema";
//                 vendedor.rua = "Tamoios";
//                 vendedor.loja = loja ;
//                 loja.contadorVendedor++;
//                 vendedor.apresentarse();
//             }
//             if (num == 6) {
//                 cliente.nome = "Yuri Alberto";
//                 cliente.idade = 20;
//                 loja.contadorCliente++;
//                 clienteDois.nome = "Cássio";
//                 clienteDois.idade = 35;
//                 loja.contadorCliente++;
//                 clienteTres.nome = "Fagner";
//                 clienteTres.idade = 48;
//                 loja.contadorCliente++;

//                 cliente.apresentarse();
//                 clienteDois.apresentarse();
//                 clienteTres.apresentarse();
//             }
//             if (num == 7) {
                
//                 loja.razaoSocial = "Floricultura Dona Gabrielinha LTDA.";
//                 loja.bairro = "Parque Verde";
//                 loja.cidade = "Cascavel - PR";
//                 loja.cnpj = "00.000.000/0001-01";
//                 loja.rua = "Avenida da Torres";

//                 loja.apresentarLogradouro();
//                 loja.contarClientes();
//                 loja.contarVendedores();
//             }
//             if (num == 8) {
//                 gerente.nome = "Neymar";
//                 gerente.idade = 32;
//                 gerente.loja = loja;

//                 gerente.apresentarse();
//             }
//             if (num == 9) {
//                 item.gerarDescricao();
//             }
//             if (num == 10) {
//                 pedido.calcularValorTotal();
//                 pedido.gerarDescricaoVenda();
//             }
//             if (num == 11) {
//                 procPedido.processar();
//                 procPedido.confirmarPagamento();
//             }
//             if (num == 12){
//                 System.out.println("Saindo...");
//             }

//     } // fim do while

//     System.exit(8); 
//     demo.close();
// }
// }
